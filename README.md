# Public-Library

<h2>Project Description</h2>
We are developing a booking system designed for a public library. The system should be able to function as a record keeper of the books owned by the library as well as a service console for both 

**Major Features:**
- Searching and locating books for staff and library users
- Sorting books based on predefined categories
- Checking out books
- Keeping the track of inventory 
- Log-in System
- Admin panel

<h2> How The GUI Works</h2>

JavaFX: We utilized the JavaFX public library and its companion program, Scene Builder, to create the visual design of the graphic interface. The library utlizes java classes and XML files to showcase the screens.

Screens: Each screen has a java class which operates its functions and methods and variables. The attached XML file will include the code for how the screen ought to look. JavaFX methods were used to switch between screens and showcase alerts. These classes take care of reading inputs of the user in the form of buttons and text fields.

<h2>How The Classes Are Organized</h2>

PublicLibrary: This is the main parent class which holds all other classes including admin accounts, user accounts, and books. This class has functionalities such as adding, deleting, editing users and books. Additionally, it can show users and books in the console.

Admin: It just holds the username and password of the administrator. These credentials are used for accessing the admin panel.

User: The user has variables such as username, password, book limit, and a list of checked out books. These credentials are used for accessing the user panel.

Book: This class has variables listing the book's name, author, ISBN, category, and its stock. This class assists PublicLibrary class to set and get the fields needed to store the book's data.

![uml class](https://github.com/GROUP23COSC310/Public-Library/blob/main/Screen%20Shot%202022-10-19%20at%209.58.47%20PM.png)

<h2>How To Compile and Run The Code</h2>
At the moment, you can clone the repository onto your device. Once you have access to the directory, load it on an IDE platform of your choice and run the "BookManagementSystem.java" file
