package People;

import Books.Book;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member extends Person implements Borrowable {

    //instance var
    private List<Book> borrowedBooks;

    public Member(int id, String fullName, List<Book> borrowedBooks) {
        super(id, fullName);
        this.borrowedBooks = new ArrayList<>();
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    //Borrowed method
    @Override
    public void borrowBook(Book book) {

        if(book == null) {
            System.out.println("This book is not in library.");
        }

        assert book != null;
        if (!book.areYouBookReleased()){
            System.out.println("This book is borrowed.");
        }

        borrowedBooks.add(book);
        book.borrowedBook();
        System.out.println("This book " + book.getTitle() + " success`s borrowed ");
    }


    //return book if book in library identify with id
    @Override
    public boolean returnBook(int bookId) {

        for (Book book:borrowedBooks) {
            if (book.getId() == bookId){
                borrowedBooks.remove(book);
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

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (! (obj instanceof Member))
            return false;
        if (!super.equals(obj))
            return false;

        Member member= (Member) obj;
        return Objects.equals(borrowedBooks, member.borrowedBooks);
    }

    //Override equals() and hashCode() method for comparison two object in hash list set and map
    // (needs override for test and comparison in PersonFactoryDesignClass class and PersonFactoryDesignClassTest class)
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), borrowedBooks);
    }
}
