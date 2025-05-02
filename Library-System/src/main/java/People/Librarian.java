package People;

import Books.Book;
import Books.BookStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Librarian extends Person {

    //List of book instance variable(attribute)
    List<Book> bookList=new ArrayList<>();

    //Scanner class object for input keyword
    Scanner scanner=new Scanner(System.in);

    //Constructor
    public Librarian(int id, String fullName) {
        super(id, fullName);
    }


    //Manage books method (add - remove - edit)
    public void manageBook(){

        while (true){

            System.out.println("Librarian please enter number for your action :");
            System.out.println("Add new Book : (1) ");
            System.out.println("Delete book : (2) ");
            System.out.println("Edit book : (3) ");
            System.out.println("Show book List : (4) ");
            System.out.println("Exit manage book : (5) ");

            int number = scanner.nextInt();

            switch (number) {
                case 1 :
                    addBook();
                    break;
                case 2 :
                    removeBook();
                    break;
                case 3 :
                    editBook();
                    break;
                case 4 :
                    bookList();
                    break;
                case 5 :
                    System.out.println("Exit the manage book!");
                    break;
                default:
                    System.out.println("The number entered is not in the list.");
                    break;
            }
        }


    }

    public void manageMember(){

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add book method use in manageBook() method
    private void addBook(){
        System.out.println("Book Title : ");
        String newBookTitle=scanner.nextLine();
        System.out.println("Author Name : ");
        String newBookAuthorName=scanner.nextLine();

        Book newBook=new Book(automaticIdSet(), newBookTitle, newBookAuthorName, BookStatus.RELEASED);

        bookList.add(newBook);
        System.out.println(newBookTitle  + "added to book list");
    }

    //Remove book method use in manageBook() method
    private void removeBook(){

        if (bookList.isEmpty()){
            System.out.println("Book list is empty!!!");
            return;
        }

        Book entityBook = null;

        System.out.println("Please enter book id for remove as list : ");
        int removeBookId= scanner.nextInt();

        for (Book b:bookList) {

            if (b.getId() == removeBookId) {
                entityBook = b;
            }
        }

        if (entityBook != null){
            bookList.remove(entityBook);
            System.out.println(entityBook.getTitle() + " book removed as list.");
        }

    }


    //Edit the book if the book in question is in the library's book list.
    private void editBook() {

        if (bookList.isEmpty()){
            System.out.println("BookList is Empty!!!");
            return;
        }

        Book editEntityBook= null;

        System.out.println("Enter book id for edited current book : ");
        int editBookId= scanner.nextInt();
        scanner.nextLine();

        for (Book b : bookList){

            if (b.getId() == editBookId){
                editEntityBook = b;
                break;
            }


        }

        if (editEntityBook != null){

            System.out.println("Enter book title : ");
            String editBookTitle = scanner.nextLine();
            System.out.println("Enter book author : ");
            String editBookAuthor= scanner.nextLine();

            editEntityBook.setTitle(editBookTitle);
            editEntityBook.setAuthor(editBookAuthor);

            System.out.println("Books edited **successfully**");


        }else
            System.out.println("book by " + editBookId + " not found!!");

    }

    //Show book list for Librarian
    private void bookList(){

        if (bookList.isEmpty()) {
            System.out.println("Book list is empty");
            return;
        }

        System.out.println("Book List :");
        for (Book books:bookList) {
            System.out.println(books);
        }
    }

    //Set book id automatically method use in manage book. for easy initial by system
    private int automaticIdSet(){
        return bookList.size()+1;
    }


}
