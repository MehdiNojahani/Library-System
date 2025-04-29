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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >=2000 || id <= 4000)
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
}
