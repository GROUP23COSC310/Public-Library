import java.util.ArrayList;

public class User {
    private static int _no = 0;
    public int No;
    private String _name;
    private String _password;

    private int _bookLimit = 3;
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public User(String _name, String _password) {
        this._name = _name;
        this._password = _password;
        _no++;
        No = _no;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public void addBookToTheUser(Book book){
        if (books.size() < _bookLimit){
            books.add(book);
            book.set_inventory(book.get_inventory()-1);
            System.out.println("-------------------------------");
            System.out.println("Book is added successfully.");
            System.out.println("-------------------------------");
        }
        else{
            System.out.println("-------------------------------");
            System.out.println("You reached the top book limit, return any book to get new one.");
            System.out.println("-------------------------------");
        }

    }

    public void deleteBookFromTheUser(Book book){
        if (!books.contains(book)) {
            System.out.println("-------------------------------");
            System.out.println("No such book is available for the user to return.");
            System.out.println("-------------------------------");
        }
        else {
            book.set_inventory(book.get_inventory()+1);
            books.remove(book);
        }
    }
}
