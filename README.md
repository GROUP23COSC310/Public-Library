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

**Minor Features:**
- Wishlist
- Checked out books and return dates
- Notifications for returning books


**SDLC:** Incremental Development
We chose incremental development because we are a small group of three members co-located working on a small project, which shows there is no need for a scrutinizing plan-driven model. Instead, an incremental development model may aid us in delivering the project faster. Furthermore we believe the structure of the program will not suffer much deterioration from its incremental builds because the software being produced is simple in nature.

  <h2>SDLC Phases and Tasks</h2>
Specification 
- Identify the project idea
- Define the requirements
  - List the major (primary) features
  - List the minor features
- Outline the software
  - Identify the platform(s)
  - Identify the programming language

Design - Console Prototype
- UML diagrams for classes
  - Creating the classes on Astah
  - Defining data types of the items in classes
  - Understanding the dependency between classes

Development - Console Prototype
- Creating the Admin panel 
  - Adding User functionality
  - All features of Users
  - Adding books to the system
  - Return books
- Creating the User panel
  - Simple string search functionality
  - Print list of books
  - Check out books (limit to 5)

Validation
- Component testing (each functionality is tested)
  - Adding book and database test (arraylist working properly)
  - Adding, editing, deleting users through Admin panel
  - Check out test
  - Check in test
  - Searching test
- System testing (testing the system as a whole)
  - Testing the system as a User
  - Testing the system as an Admin
- Customer testing (testing if it meets the needs of customer)

Evolution
- Design next prototype (SQL Console)
  - New UML diagrams
  - New list of functionalities
- Begin adding minor features
- Begin SQL database creation
- Implement SQL to Java program
  - Add project libraries
  - Refactor classes and methods
- List design features that need to be adapted to changes
