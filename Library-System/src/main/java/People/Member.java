package People;

import Books.Book;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person{

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
}
