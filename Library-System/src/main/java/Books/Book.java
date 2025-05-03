package Books;

public class Book {

    //instance variable
    //book id should be between 2000 or 4000 numbers
    private int id;
    private String title;
    private String author;
    private BookStatus bookStatus;

    //constructor
    public Book(int id, String title, String author, BookStatus bookStatus) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.bookStatus = bookStatus;
    }


    //getter and setter method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }


    //this method boolean return book release or borrow with BookStatus Enum :
    public boolean areYouBookReleased() {
        return this.bookStatus == BookStatus.RELEASED;
    }

    //Borrowed status with BorrowedStatus Enum
    public void borrowedBook() {
        this.bookStatus = BookStatus.BORROWED;
    }

    //Released status with BorrowedStatus Enum
    public void releasedBook() {
        this.bookStatus = BookStatus.RELEASED;
    }


    @Override
    public String toString() {
        return "Book Id : " + getId()
                + "\n" + "Book Title : " + getTitle()
                + "\n" + "Book Author : " + getAuthor()
                + "\n" + "Book Status : " + getBookStatus()
                + "\n\n";
    }
}
