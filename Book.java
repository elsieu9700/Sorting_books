public class Book
{
 private String author, title, publisher;
 private int Year;
 private static int YearOfPublication =0;
 public Book()
 {
  title = author = "unknown";
  Year = 0;
 }
 public Book(String title)
 {
  this.title = title;
  author = "unknown";
  YearOfPublication++;
  Year = YearOfPublication;
 }
 public Book (String title, String author)
 {
  this.title = title;
  this.author = author;
  YearOfPublication++;
  Year = YearOfPublication;
 }
 public void setTitle(String title)
 {
  this.title = title;
 }
 public void setAuthor(String author)
 {
  this.author = author;
 }
 
 public String getTitle()
 {
  return title;
 }
 public String getAuthor()
 {
  return author;
 }
 public int getYear()
 {
  return Year;
 }
 public boolean equals(Book other)
 {
  boolean enough = true;
  String otherAuthor = other.getAuthor();
  String otherTitle = other.getTitle();
  if(otherAuthor.equals(author) && otherTitle.equals(title))
   enough = true;
  else
   enough = false;
  return enough;
 }
 public String getInitials ()
 {
  String output = "";
  if (!(author.equals("")) && !
      	(author.equals("unknown")) && !(author.equals(null))) {
   output += author.charAt(0);
   output += ". ";
   if (author.indexOf(" ") != -1) {
   output += author.charAt(author.indexOf(" ") + 1);
   output += ". "; }
   if (author.indexOf(" ") != -1) {
   output += author.charAt((author.indexOf(" ")
                     	+ author.indexOf(" ")) +4 );
   output += ". "; }
  }
  return output;
 }
 public int compareTo(Book another){     	
	return this.title.compareTo(another.title);  
  }
 public String toString()
 {
  return "Book No: " + Year + " entitled \""
            	+ title + "\"" + " written by " + author;
 }
}




import java.util.Scanner;
public class BookTest{
 public static void main (String[] args){
  Book firstBook = new Book();
    	Book lastBook = new Book();
    	Book aBook = new Book();
  Scanner scan = new Scanner (System.in);
  System.out.println("To end the input " +
   	"process bypass each question by typing the enter key!");
  System.out.print("Type the title of the book: ");
  String title = scan.nextLine();
  System.out.print("Type the name of the author: ");
  String author = scan.nextLine();
  aBook = new Book(title, author);
  if (!(title.equals("") && author.equals("")))
  System.out.println(aBook);
  while (!(title.equals("") && author.equals("")))
  {
	if (aBook.getYear() == 1)
 	firstBook = aBook;
	System.out.print("Type the title of the book: ");
	title = scan.nextLine();
	System.out.print("Type the name of the author: ");
	author = scan.nextLine();
	if (!(title.equals("") && author.equals(""))) { 
 	aBook = new Book(title, author);
	System.out.print(aBook);
	System.out.println(); }
  }
  lastBook = aBook;
  if (firstBook.equals(lastBook))
   System.out.println("First and last books are the same");
  System.out.println(lastBook.getInitials());
 }
}
