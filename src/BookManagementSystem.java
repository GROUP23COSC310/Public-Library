import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        PublicLibrary library = new PublicLibrary();
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            System.out.println("0 - Exit");
            System.out.println("1 - Admin login");
            System.out.println("2 - User login");
            System.out.println("Please choose your option:");
            option = scanner.nextLine();
            if (option.equals("1")){
                System.out.println("Enter password: ");
                String password;
                do {
                    password = scanner.nextLine();
                    if(!password.equals(library.admin.get_password())){
                        System.out.println("-------------------------------");
                        System.out.println("Ohh no, wrong password. Try again please.");
                        System.out.println("-------------------------------");
                    }
                }while (!password.equals(library.admin.get_password()));
                System.out.println("-------------------------------");
                System.out.println("Access granted to Admin Panel");
                System.out.println("-------------------------------");
                String optionForAdmin;
                do {
                    System.out.println("0 - Back to Main Menu");
                    System.out.println("1 - Add User");
                    System.out.println("2 - Delete User");
                    System.out.println("3 - Edit User");
                    System.out.println("4 - Show Users");
                    System.out.println("5 - Add Book");
                    System.out.println("6 - Delete Book");
                    System.out.println("7 - Edit Book");
                    System.out.println("8 - Show Books");
                    System.out.println("9 - Check out book for a User");
                    System.out.println("10 - Return book");
                    System.out.println("11 - Show books assigned to the Users");
                    optionForAdmin = scanner.nextLine();
                    switch (optionForAdmin) {
                        case "1":
                            library.addUser(getUserFromConsole());
                            System.out.println("-------------------------------");
                            System.out.println("Added successfully!");
                            System.out.println("-------------------------------");
                            break;
                        case "2":
                            if (library.Users.size() == 0) {
                                System.out.println("-------------------------------");
                                System.out.println("No users can be deleted because there is no user. ");
                                System.out.println("-------------------------------");
                            } else {
                                System.out.println("Enter the name of the user you want to delete: ");
                                String deleteName = scanner.nextLine();
                                library.deleteUser(deleteName);
                            }
                            break;
                        case "3":
                            if (library.Users.size() == 0){
                                System.out.println("-------------------------------");
                                System.out.println("No users can be edited because there is no user.");
                                System.out.println("-------------------------------");
                            }
                            else {
                                System.out.println("Enter the No number of a User: ");
                                String no = scanner.nextLine();
                                library.editUser(Integer.parseInt(no));
                            }
                            break;
                        case "4":
                            library.showUsers();
                            break;
                        case "5":
                            library.addBook(getBookFromConsole());
                            System.out.println("-------------------------------");
                            System.out.println("Added successfully!");
                            System.out.println("-------------------------------");
                            break;
                        case "6":
                            if (library.Books.size() == 0) {
                                System.out.println("-------------------------------");
                                System.out.println("No books can be deleted because there is no book. ");
                                System.out.println("-------------------------------");
                            }
                            else{
                                System.out.println("-------------------------------");
                                System.out.println("Enter the name of the book you want to delete: ");
                                System.out.println("-------------------------------");
                                String deleteName = scanner.nextLine();
                                library.deleteBook(deleteName);
                            }
                            break;
                        case "7":
                            if (library.Books.size() == 0) {
                                System.out.println("-------------------------------");
                                System.out.println("No books can be edited because there is no book.");
                                System.out.println("-------------------------------");
                            }
                            else {
                                System.out.println("-------------------------------");
                                System.out.println("Enter the name of the book: ");
                                System.out.println("-------------------------------");
                                String name = scanner.nextLine();
                                library.editBook(name);
                            }
                            break;
                        case "8":
                            library.showBooks();
                            break;
                        case "9":
                            System.out.println("-------------------------------");
                            System.out.println("Enter the name of a book: ");
                            System.out.println("-------------------------------");
                            String desiredBook = scanner.nextLine();
                            boolean flag = false;
                            Book book = null;
                            for(int i = 0; i < library.Books.size(); i++){
                                if (library.Books.get(i).get_bookName().equalsIgnoreCase(desiredBook))
                                    book = library.Books.get(i);
                            }
                            System.out.println("-------------------------------");
                            System.out.println("Enter the User's name for check-out: ");
                            System.out.println("-------------------------------");
                            String nameUser = scanner.nextLine();
                            for (int i = 0; i < library.Users.size(); i++){
                                if (library.Users.get(i).get_name().equalsIgnoreCase(nameUser))
                                    library.Users.get(i).addBookToTheUser(book);
                            }
                            break;
                        case "10":
                            System.out.println("-------------------------------");
                            System.out.println("Enter the name of a book: ");
                            System.out.println("-------------------------------");
                            String desiredBook1 = scanner.nextLine();
                            Book book1 = null;
                            for (int i = 0; i < library.Books.size(); i++){
                                if (library.Books.get(i).get_bookName().equalsIgnoreCase(desiredBook1))
                                    book1 = library.Books.get(i);
                            }
                            System.out.println("-------------------------------");
                            System.out.println("Enter the User's name for check-out: ");
                            System.out.println("-------------------------------");
                            String nameUser1 = scanner.nextLine();
                            for (int i = 0; i < library.Users.size(); i++){
                                if (library.Users.get(i).get_name().equalsIgnoreCase(nameUser1))
                                    library.Users.get(i).deleteBookFromTheUser(book1);
                            }
                            break;
                        case "11":
                            for (User user : library.Users) {
                                if (user == null) {
                                    continue;
                                }
                                System.out.println("-------------------------------");
                                System.out.println("No: " + user.No + " Username: " + user.get_name() + " Password: " + user.get_password());
                                for (Book bookIterate: user.getBooks()) {
                                    System.out.println(bookIterate.get_bookName() + " | " + bookIterate.get_author() + " | " + bookIterate.get_category() + " | " + bookIterate.get_ISBN());

                                }
                                System.out.println("-------------------------------");
                            }
                            break;
                    }
                }while (!optionForAdmin.equals("0"));
            }
            else if (option.equals("2")){
                String username;
                String password;
                System.out.println("Enter username: ");
                username = scanner.nextLine();
                System.out.println("Enter password: ");
                password = scanner.nextLine();
                int userLogin = 0;
                for (int i = 0; i < library.Users.size(); i++){
                    if (library.Users.get(i).get_name().equals(username)) {
                        userLogin = i;
                        break;
                    }
                }
                if(library.Users.size() != 0 && password.equals(library.Users.get(userLogin).get_password())){
                    String optionForUser;
                    System.out.println("-------------------------------");
                    System.out.println("Access granted to User Panel");
                    System.out.println("-------------------------------");
                    do {
                        System.out.println("0 - Back to Main Menu");
                        System.out.println("1 - Check out book");
                        System.out.println("2 - Return book");
                        System.out.println("3 - Books I owe");
                        System.out.println("4 - Show all books in the library");
                        System.out.println("5 - Search books");
                        optionForUser = scanner.nextLine();
                        switch (optionForUser) {
                            case "1" -> {
                                System.out.println("-------------------------------");
                                System.out.println("Enter the ISBN number of the book: ");
                                System.out.println("-------------------------------");
                                String isbn = scanner.nextLine();
                                Book book = null;
                                for (int i = 0; i < library.Books.size(); i++) {
                                    if (library.Books.get(i).get_ISBN() == Integer.parseInt(isbn)) {
                                        book = library.Books.get(i);
                                    }
                                }
                                library.Users.get(userLogin).addBookToTheUser(book);
                            }
                            case "2" -> {
                                System.out.println("-------------------------------");
                                System.out.println("Enter the ISBN number of the book: ");
                                System.out.println("-------------------------------");
                                String isbnSecond = scanner.nextLine();
                                Book bookSecond = null;
                                for (int i = 0; i < library.Books.size(); i++) {
                                    if (library.Books.get(i).get_ISBN() == Integer.parseInt(isbnSecond)) {
                                        bookSecond = library.Books.get(i);
                                    }
                                }
                                library.Users.get(userLogin).deleteBookFromTheUser(bookSecond);
                            }
                            case "3" -> {
                                System.out.println("-------------------------------");
                                System.out.println("No: " + library.Users.get(userLogin).No + " Username: " + library.Users.get(userLogin).get_name());
                                boolean flagA = false;
                                for (Book bookIterate : library.Users.get(userLogin).getBooks()) {
                                    flagA = true;
                                    System.out.println("-------------------------------");
                                    System.out.println(bookIterate.get_bookName() + " | " + bookIterate.get_author() + " | " + bookIterate.get_category() + " | " + bookIterate.get_ISBN());
                                }
                                System.out.println("-------------------------------");
                                if (!flagA) {
                                    System.out.println("-------------------------------");
                                    System.out.println("You do not owe any books!");
                                    System.out.println("-------------------------------");
                                }
                            }
                            case "4" -> library.showBooks();
                            case "5" -> {
                                System.out.println("-------------------------------");
                                System.out.println("Enter the name of the book or the word contained in: ");
                                System.out.println("-------------------------------");
                                String search = scanner.nextLine();
                                boolean flag = false;
                                for (int booksNumber = 0; booksNumber < library.Books.size(); booksNumber++) {
                                    if (library.Books.get(booksNumber).get_bookName().contains(search)) {
                                        flag = true;
                                        System.out.println(library.Books.get(booksNumber).get_bookName() + " | " + library.Books.get(booksNumber).get_author() + " | " + library.Books.get(booksNumber).get_category() + " | " + library.Books.get(booksNumber).get_ISBN());
                                    }
                                }
                                if (!flag) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Nothing found based on your search.");
                                    System.out.println("-------------------------------");
                                }
                            }
                        }
                    }while (!optionForUser.equals("0"));
                }
                else {
                    System.out.println("-------------------------------");
                    System.out.println("No credentials found.");
                    System.out.println("-------------------------------");
                }
            }
        }while (!option.equals("0"));

    }

    public static User getUserFromConsole(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input name for a user: ");
            String name = scanner.nextLine();
            System.out.println("Please input password for a user: ");
            String password = scanner.nextLine();
            return new User(name, password);
    }

    public static Book getBookFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input name of a book: ");
        String name = scanner.nextLine();
        System.out.println("Please input author of a book: ");
        String author = scanner.nextLine();
        System.out.println("Please input ISBN number of a book: ");
        String isbn = scanner.nextLine();
        System.out.println("Please input category of a book: ");
        String category = scanner.nextLine();
        System.out.println("Please input the number of books that you want to add: ");
        String numInventory = scanner.nextLine();
        return new Book(name, author, isbn, category, numInventory);
    }
}
