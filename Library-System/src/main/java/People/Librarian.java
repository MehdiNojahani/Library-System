package People;

import Books.Book;
import Books.BookStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Librarian extends Person {

    List<Book> bookList=new ArrayList<>();

    Scanner scanner=new Scanner(System.in);


    //Manage books method (add - remove)
    public void manageBook(){

        System.out.println("Librarian please enter number for your action :");
        System.out.println("Add new Book : (1) ");
        System.out.println("Delete book : (2) ");
        System.out.println("Edit book : (3) ");
        System.out.println("Exit manage book : (4) ");

        int number = scanner.nextInt();

        switch (number) {
            case 1 :
                addBook();
                break;
            case 2 :

        }

    }

    
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



    //Set book id automatically method use in manage book. for easy initial by system
    private int automaticIdSet(){
        return bookList.size()+1;
    }
}
