/*Create a class called Book to represent a book.
A Book should include four pieces of information as instance variables‐a book name, 
an ISBN number, an author name and a publisher.
Your class should have a constructor that initializes the four instance variables.
Provide a mutator method and accessor method (query method) for each instance variable.
In addition, provide a method named getBookInfo() that returns the description of the book as a 
String (the description should include all the information about the book).
You should use this keyword in member methods and constructor.
Write a test application named BookTest to create an array of object for 30 elements
for class Book to demonstrate the class Book's capabilities.*/

import java.util.Scanner;

    class Book {
        private String bookname,authorname,publisher;
        private long ISBN;

public Book() {
}

public Book(String bookname,long ISBN,String authorname,String publisher) {
            this.bookname=bookname;
            this.ISBN=ISBN;
            this.authorname=authorname;
            this.publisher=publisher;
            }

public void setData(String bookname,long ISBN,String authorname,String publisher)
            {
            this.bookname=bookname;
            this.ISBN=ISBN;
            this.authorname=authorname;
            this.publisher=publisher;
            }

public void getData() {
            System.out.println("Book Name = "+bookname);
            System.out.println("ISBN No. = "+ISBN);
            System.out.println("Author Name = "+authorname);
            System.out.println("Publisher = "+publisher);
            }
}
   
    public class Main {
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            Book b=new Book();System.out.println("Enter Book name, ISBN number, Author name,Publisher :- ");
            b.setData(scan.next(),scan.nextLong(),scan.next(),scan.next());
            b.getData();
        }
}

