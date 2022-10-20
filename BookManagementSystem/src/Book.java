public class Book {
    private String _bookName;
    private String _author;
    private int _ISBN;
    private String _category;

    private int _inventory;

    public Book(String _bookName, String _author, String _ISBN, String _category, String _inventory) {
        this._bookName = _bookName;
        this._author = _author;
        this._ISBN = Integer.parseInt(_ISBN);
        this._category = _category;
        this._inventory = Integer.parseInt(_inventory);
    }

    public int get_inventory() {
        return _inventory;
    }

    public void set_inventory(int _inventory) {
        this._inventory = _inventory;
    }

    public String get_bookName() {
        return _bookName;
    }

    public void set_bookName(String _bookName) {
        this._bookName = _bookName;
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public int get_ISBN() {
        return _ISBN;
    }

    public void set_ISBN(int _ISBN) {
        this._ISBN = _ISBN;
    }

    public String get_category() {
        return _category;
    }

    public void set_category(String _category) {
        this._category = _category;
    }
}
