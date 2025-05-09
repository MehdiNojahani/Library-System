package People;

import Books.Book;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member extends Person<List<Book>> implements Borrowable {

    //instance var
    public Member(int id, String fullName, List<Book> borrowedBooks) {
        super(id, fullName, borrowedBooks);
    }

    public List<Book> getBorrowedBooks() {
        return getExtraData();
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        super.setExtraData(borrowedBooks != null ? new ArrayList<>(borrowedBooks) : new ArrayList<>());
    }

    //Borrowed method
    @Override
    public void borrowBook(Book book) {

        if (book == null) {
            System.out.println("This book is not in library.");
            return;
        }

        if (!book.areYouBookReleased()) {
            System.out.println("This book is borrowed.");
            return;
        }

        if (getExtraData().contains(book)){
            System.out.println("You borrowed this book by you past");
            return;
        }

        getExtraData().add(book);
        book.borrowedBook();
        System.out.println("This book " + book.getTitle() + " success`s borrowed ");
    }


    //return book if book in library identify with id
    @Override
    public boolean returnBook(int bookId) {

        for (Book book : getExtraData()) {
            if (book.getId() == bookId) {
                getExtraData().remove(book);
                book.releasedBook();
                System.out.println("This book " + book.getTitle() + " returned Library. ");
                return true;
            }
        }

        System.out.println("This book not available in library ");
        return false;
    }

    @Override
    public String toString() {
        return "Person id : " + getId()
                + " Person Full Name : " + getFullName()
                + " Borrowed Book : " + getBorrowedBooks();
    }

    //Override equals() and hashCode() method for comparison two object in hash list set and map
    // (needs override for test and comparison in PersonFactoryDesignClass class and PersonFactoryDesignClassTest class)
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (!(obj instanceof Member))
            return false;
        if (!super.equals(obj))
            return false;

        Member member = (Member) obj;
        return Objects.equals(getExtraData(), member.getExtraData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getExtraData());
    }
}
