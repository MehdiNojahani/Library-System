package People;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Admin extends Person<List<Librarian>> {


    Scanner scanner = new Scanner(System.in);

    public Admin(int id, String fullName, List<Librarian> librarian) {
        super(id, fullName, librarian);
    }


    //manage librarian in Library System( Add - Remove - Edit - Show Librarian List) :
    public void manageLibrarian() {

        System.out.println("Admin please enter number for your action :");
        System.out.println("Add new Librarian : (1) ");
        System.out.println("Delete Librarian : (2) ");
        System.out.println("Edit Librarian : (3) ");
        System.out.println("Show Librarian List : (4) ");
        System.out.println("Exit manage Librarian : (5) ");

        int actionNumber = scanner.nextInt();
        scanner.nextLine();
        while (true) {

            switch (actionNumber) {
                case 1:
                    addLibrarian();
                    break;
                case 2:
                    removeLibrarian();
                    break;
                case 3:
                    editLibrarian();
                    break;
                case 4:
                    showLibrarianList();
                    break;
                case 5:
                    System.out.println("Exit manage librarian ");
                    break;
                default:
                    System.out.println("The number entered is not in the list.");
                    break;
            }
        }

    }


    //Add librarian method :
    private void addLibrarian() {

        scanner.nextLine();
        System.out.println("Enter librarian full name : ");
        String librarianFullName = scanner.nextLine();

        Librarian newLibrarianAdded = new Librarian(automaticIdSet(), librarianFullName, new LibraryData());
        getExtraData().add(newLibrarianAdded);
        System.out.println("Librarian added is successfully.");
    }

    //Remove librarian method :
    private void removeLibrarian() {

        if (getExtraData().isEmpty()) {
            System.out.println("Librarian list is empty!!!");
            return;
        }

        System.out.println("Enter librarian id for removed :");
        int removeLibrarianId = scanner.nextInt();
        scanner.nextLine();

        Librarian existingLibrarian = null;
        for (Librarian l : getExtraData()) {

            if (l.getId() == removeLibrarianId) {
                existingLibrarian = l;
            }
        }

        if (existingLibrarian != null) {
            getExtraData().remove(existingLibrarian);
            System.out.println("Librarian removed is successfully.");
        }
    }

    //edit librarian method :
    private void editLibrarian() {

        if (getExtraData().isEmpty()) {
            System.out.println("Librarian list is empty!!!");
            return;
        }

        System.out.println("Enter librarian id for editing : ");
        int editingLibrarianId = scanner.nextInt();
        scanner.nextLine();

        Librarian existingLibrarian = null;

        for (Librarian l : getExtraData()) {
            if (l.getId() == editingLibrarianId) {
                existingLibrarian = l;
                break;
            }
        }

        if (existingLibrarian != null) {
            System.out.println("Enter full name");
            existingLibrarian.setFullName(scanner.nextLine());
            System.out.println("Librarian is editing successfully.");
        } else
            System.out.println(editingLibrarianId + " is not found!!!");
    }

    //Show librarian list:
    private void showLibrarianList() {

        if (getExtraData().isEmpty()) {
            System.out.println("Librarian list is empty!!!");
            return;
        }

        System.out.println("Librarian List :");
        for (Librarian l : getExtraData()) {
            System.out.println(l);
        }
    }


    //Automatic id set in Admin class :
    private int automaticIdSet() {

        int idMax = 0;
        for (Librarian l : getExtraData()) {
            if (idMax < l.getId())
                idMax = l.getId();

        }
        return idMax + 1;

    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (!(obj instanceof Admin))
            return false;
        if (!super.equals(obj))
            return false;

        Admin admin = (Admin) obj;

        return Objects.equals(getExtraData(), admin.getExtraData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getExtraData());
    }
}
