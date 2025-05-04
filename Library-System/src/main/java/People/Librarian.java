package People;

import Books.Book;
import Books.BookStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Librarian extends Person {

    //List of book instance variable(attribute)
    List<Book> bookList = new ArrayList<>();

    //Scanner class object for input keyword
    Scanner scanner = new Scanner(System.in);

    //Borrowed book lists member (member can-how create new then borrowed book)
    List<Book> borrowedBookList = new ArrayList<>();

    //Member lists
    List<Member> memberList = new ArrayList<>();

    //Constructor
    public Librarian(int id, String fullName) {
        super(id, fullName);
    }


    //Manage books method (add - remove - edit - show list)
    public void manageBook() {

        while (true) {

            System.out.println("Librarian please enter number for your action :");
            System.out.println("Add new Book : (1) ");
            System.out.println("Delete book : (2) ");
            System.out.println("Edit book : (3) ");
            System.out.println("Show book List : (4) ");
            System.out.println("Exit manage book : (5) ");

            int bookNumber = scanner.nextInt();
            scanner.nextLine();

            switch (bookNumber) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    editBook();
                    break;
                case 4:
                    showBookList();
                    break;
                case 5:
                    System.out.println("Exit the manage book!");
                    break;
                default:
                    System.out.println("The number entered is not in the list.");
                    break;
            }
        }


    }

    //Manage member method (add - remove - edit - show list)
    public void manageMember() {

        while (true) {

            System.out.println("Librarian please enter number for your action :");
            System.out.println("Add new Member : (1) ");
            System.out.println("Delete Member : (2) ");
            System.out.println("Edit Member : (3) ");
            System.out.println("Show Member List : (4) ");
            System.out.println("Exit manage Member : (5) ");

            int memberNumber = scanner.nextInt();
            scanner.nextLine();

            switch (memberNumber) {
                case 1:
                    addMember();
                    break;
                case 2:
                    removeMember();
                    break;
                case 3:
                    editMember();
                    break;
                case 4:
                    showMemberList();
                    break;
                case 5:
                    System.out.println("Exit the manage member!");
                    break;
                default:
                    System.out.println("The number entered is not in the list.");
                    break;
            }
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //manageBook() method branch methods

    //add book method use in manageBook() method
    private void addBook() {
        scanner.nextLine();
        System.out.println("Book Title : ");
        String newBookTitle = scanner.nextLine();
        System.out.println("Author Name : ");
        String newBookAuthorName = scanner.nextLine();

        Book newBook = new Book(automaticBookIdSet(), newBookTitle, newBookAuthorName, BookStatus.RELEASED);

        bookList.add(newBook);
        System.out.println(newBookTitle + "added to book list");
    }

    //Remove book method use in manageBook() method
    private void removeBook() {

        if (bookList.isEmpty()) {
            System.out.println("Book list is empty!!!");
            return;
        }

        Book existingBook = null;

        System.out.println("Please enter book id for remove as list : ");
        int removeBookId = scanner.nextInt();

        for (Book b : bookList) {

            if (b.getId() == removeBookId) {
                existingBook = b;
            }
        }

        if (existingBook != null) {
            bookList.remove(existingBook);
            System.out.println(existingBook.getTitle() + " book removed as list.");
        }

    }


    //Edit the book if the book in question is in the library's book list.
    private void editBook() {

        if (bookList.isEmpty()) {
            System.out.println("BookList is Empty!!!");
            return;
        }

        Book editExistingBook = null;

        System.out.println("Enter book id for edited current book : ");
        int editBookId = scanner.nextInt();
        scanner.nextLine();

        for (Book b : bookList) {

            if (b.getId() == editBookId) {
                editExistingBook = b;
                break;
            }


        }

        if (editExistingBook != null) {

            System.out.println("Enter book title : ");
            String editBookTitle = scanner.nextLine();
            System.out.println("Enter book author : ");
            String editBookAuthor = scanner.nextLine();

            editExistingBook.setTitle(editBookTitle);
            editExistingBook.setAuthor(editBookAuthor);

            System.out.println("Books edited **successfully**");


        } else
            System.out.println("book by " + editBookId + " not found!!");

    }

    //Show book list for Librarian
    private void showBookList() {

        if (bookList.isEmpty()) {
            System.out.println("Book list is empty");
            return;
        }

        System.out.println("Book List :");
        for (Book books : bookList) {
            System.out.println(books);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //manageMember() method branch methods :

    //add book method use in manageBook() method
    private void addMember() {

        System.out.println("Enter new member full-name : ");
        String fullName = scanner.nextLine();

        Member newMember = new Member(automaticMemberIdSet(), fullName, borrowedBookList);

        memberList.add(newMember);
        System.out.println("A new member with the " + newMember.getFullName()
                + " and " + newMember.getId() + " has been added");

    }

    //Remove member in member list if existing in member list
    private void removeMember() {

        if (memberList.isEmpty()) {
            System.out.println("Member list is empty!!!");
            return;
        }

        System.out.println("Enter member id for removed: ");
        int removeMemberId = scanner.nextInt();
        scanner.nextLine();

        Member existingMember = null;
        for (Member m : memberList) {
            if (m.getId() == removeMemberId) {
                existingMember = m;
            }
        }

        if (existingMember != null) {

            memberList.remove(existingMember);
            System.out.println(removeMemberId + " be successfully to removed.");

        }
    }

    //Edit member in member list
    private void editMember() {

        if (memberList.isEmpty()) {
            System.out.println("Member list is empty!!!");
            return;
        }

        System.out.println("Enter Member id for editing :");
        int editExistingMemberId = scanner.nextInt();
        scanner.nextLine();

        Member existingMember = null;
        for (Member m : memberList) {

            if (m.getId() == editExistingMemberId) {
                existingMember = m;

            }
        }

        if (existingMember != null) {

            System.out.println("Enter full name : ");
            existingMember.setFullName(scanner.nextLine());
            System.out.println(editExistingMemberId + " is successfully editing");
        } else
            System.out.println(editExistingMemberId + " is noy found!!!");
    }

    //Show member list :
    private void showMemberList() {

        if (memberList.isEmpty()) {
            System.out.println("Member list is empty!!!");
            return;
        }

        System.out.println("Member List : ");
        for (Member m : memberList) {
            System.out.println(m.toString());
        }
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Set book id automatically method use in manage book. for easy initial by system
    private int automaticBookIdSet() {

        int idMax = 0;
        for (Book b : bookList) {
            if (idMax < b.getId())
                idMax = b.getId();

        }
        return idMax + 1;

    }

    //Set member id automatically method use in manage member. for easy initial by system
    private int automaticMemberIdSet() {

        int idMax = 0;
        for (Member m : memberList) {
            if (idMax < m.getId())
                idMax = m.getId();

        }
        return idMax + 1;

    }


    //Override equals() and hashCode() method for comparison two object in hash list set and map
    // (needs override for test and comparison in PersonFactoryDesignClass class and PersonFactoryDesignClassTest class)
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (!(obj instanceof Librarian))
            return false;
        if (!super.equals(obj))
            return false;

        Librarian librarian = (Librarian) obj;
        return Objects.equals(bookList, librarian.bookList) &&
                Objects.equals(memberList, librarian.memberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bookList, memberList);
    }
}
