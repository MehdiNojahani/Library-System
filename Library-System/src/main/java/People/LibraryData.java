package People;

import Books.Book;

import java.util.ArrayList;
import java.util.List;

//This class keep book and member lists and use in T type in Person<T> => Person<List<LibraryData> data>
// class in library class
public class LibraryData {

    //Book list :
    private List<Book> bookList;

    //Member list :
    private List<Member> memberList;


    public LibraryData(List<Book> bookList, List<Member> memberList) {
        this.bookList = bookList;
        this.memberList = memberList;
    }

    public LibraryData() {
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
