import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PublicLibrary {
    private String _name;
    public ArrayList<User> Users = new ArrayList<>();

    public ArrayList<Book> Books = new ArrayList<>();
    public Admin admin = new Admin();


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void addUser(User user){
        Users.add(user);
    }

    public void addBook(Book book){
        Books.add(book);
    }
    public void deleteUser(String name){
        boolean flag = false;
            for (int i = 0; i < Users.size(); i++){
                if (Users.get(i).get_name().equals(name)){
                    flag = true;
                    Users.remove(i);
                    System.out.println("-------------------------------");
                    System.out.println("User has been removed successfully.");
                    System.out.println("-------------------------------");
                    break;
                }
        }
            if (!flag){
                System.out.println("-------------------------------");
                System.out.println("No such user found to be deleted!");
                System.out.println("-------------------------------");
            }
    }

    public void deleteBook(String nameBook){
        boolean flag = false;
        for (int i = 0; i < Books.size(); i++){
            if (Books.get(i).get_bookName().equals(nameBook)){
                flag = true;
                Books.remove(i);
                System.out.println("-------------------------------");
                System.out.println("Book has been removed successfully.");
                System.out.println("-------------------------------");
                break;
            }
        }
        if (!flag){
            System.out.println("-------------------------------");
            System.out.println("No such book found to be deleted!");
            System.out.println("-------------------------------");
        }
    }
    public void showUsers(){
        if (Users.size() == 0){
            System.out.println("-------------------------------");
            System.out.println("No users found on the system.");
            System.out.println("-------------------------------");
        }
        else {
            for (User user : Users) {
                if (user == null) {
                    continue;
                }
                System.out.println("-------------------------------");
                System.out.println("No: " + user.No + " | Username: " + user.get_name() + " | Password: " + user.get_password());
            }
            System.out.println("-------------------------------");
        }
    }

    public void showBooks(){
        if (Books.size() == 0){
            System.out.println("-------------------------------");
            System.out.println("No books found on the system.");
            System.out.println("-------------------------------");
        }
        else {
            for (Book bk : Books) {
                if (bk == null) {
                    continue;
                }
                System.out.println("-------------------------------");
                System.out.println("Name: " + bk.get_bookName() + " - Author: " + bk.get_author() + " - ISBN: " + bk.get_ISBN() + " - Category: " + bk.get_category() + " | Inventory: " + bk.get_inventory());
            }
            System.out.println("-------------------------------");
        }
    }

    public void editUser(int no){
        Scanner scanner = new Scanner(System.in);
            boolean flag = false;
            for (User user : Users) {
                if (user.No == no) {
                    flag = true;
                    System.out.println("-------------------------------");
                    System.out.println("Do you want to change the user's name? Y/N");
                    System.out.println("-------------------------------");
                    if (scanner.nextLine().equals("Y")) {
                        System.out.println("Enter new name: ");
                        user.set_name(scanner.nextLine());
                    }
                    System.out.println("-------------------------------");
                    System.out.println("Do you want to change the user's password? Y/N");
                    System.out.println("-------------------------------");
                    if (scanner.nextLine().equals("Y")) {
                        System.out.println("Enter new password: ");
                        user.set_password(scanner.nextLine());
                    }
                }
            }
            if (!flag){
                System.out.println("-------------------------------");
                System.out.println("No such user found. Check back later.");
                System.out.println("-------------------------------");
            }
        }

    public void editBook(String name){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        for (Book bk : Books) {
            if (bk.get_bookName().equalsIgnoreCase(name)) {
                flag = true;
                System.out.println("-------------------------------");
                System.out.println("Do you want to change the book's name? Y/N");
                System.out.println("-------------------------------");
                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    System.out.println("Enter new name: ");
                    bk.set_bookName(scanner.nextLine());
                }
                System.out.println("-------------------------------");
                System.out.println("Do you want to change the books's author? Y/N");
                System.out.println("-------------------------------");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                    System.out.println("Enter new author name: ");
                    bk.set_author(scanner.nextLine());
                }
                System.out.println("-------------------------------");
                System.out.println("Do you want to change the books's ISBN number? Y/N");
                System.out.println("-------------------------------");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                    System.out.println("Enter new ISBN number: ");
                    bk.set_ISBN(Integer.parseInt(scanner.nextLine()));
                }
                System.out.println("-------------------------------");
                System.out.println("Do you want to change the books's category? Y/N");
                System.out.println("-------------------------------");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                    System.out.println("Enter new category: ");
                    bk.set_category(scanner.nextLine());
                }
            }
        }
        if (!flag){
            System.out.println("-------------------------------");
            System.out.println("No such book found. Check back later.");
            System.out.println("-------------------------------");
        }
    }
    }
