
public class Copy extends Book {
	
	private int _id;

	public Copy(String _bookName, String _author, String _ISBN, String _category, String _inventory) {
		super(_bookName, _author, _ISBN, _category, _inventory);
		// TODO Auto-generated constructor stub
	}

	public int getCopy_id() {
		return _id;
	}

	public void setCopy_id(int copy_id) {
		this._id = copy_id;
	}
	
	

}
