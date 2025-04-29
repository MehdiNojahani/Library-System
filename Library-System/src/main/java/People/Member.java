package People;

import Books.Book;


import java.util.List;

public class Member extends Person implements Borrowable {

    //instance var
    private List<Book> borrowedBooks;

    public Member(int id, String fullName, List<Book> borrowedBooks) {
        super(id, fullName);
        this.borrowedBooks = borrowedBooks;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

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
        book.releasedBook();
        System.out.println("This book " + book.getTitle() + "success`s borrowed ");
    }

    @Override
    public boolean returnBook(int bookId) {
        return false;
    }
}
