//BookApp

import java.util.Scanner;
public class BookApp {

	public static void main(String[] args) {

		String sku;
		String bookTitle, author;
		
		
//		double noOfBooks;
//		String SKU="";
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no of books");
//		noOfBooks= sc.nextInt();
//	
//		System.out.println("Enter book code");
//		SKU= sc.next();
//		
//	    Book firstBook=new Book("ATLAS SHRUGGED ", "AYN RAND ", "GREAT READ ", 23.22 , false, 6 );
//		System.out.println(firstBook.getDisplayText());
//		
//		Book secondAssignment = new Book("ATLAS SHRUGGED ", "AYN RAND ", "GREAT READ ", 20.00 , true, 6 );
//		System.out.println(secondAssignment.getCostOfBooks(noOfBooks));
//	
		BookDatabase db = new BookDatabase();
	//	System.out.println(dataAssignment.BookData(SKU));
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		Book book = db.getBook(input);
		System.out.println(book.getAuthor());

		
		Scanner cs = new Scanner(System.in);
		System.out.println("Select 1 for update, 2 for insert and 3 for delete ");
		int selection = cs.nextInt();
		
		if (selection == 1)
	// For updateBook method 
		{
	   System.out.println("The code of book is ");
	   sku=keyboard.nextLine();
	   
	   System.out.println("Enter the author of book ");
	   author=keyboard.nextLine();
		
	   System.out.println("Enter the title of book ");
	   bookTitle=keyboard.nextLine();
	
	   db.updateBook(sku, bookTitle, author);
		}
		
		else if (selection==2)
		{
	   // For insert method
	   
	   System.out.println("Set the sku");
	   book.setSku(keyboard.nextLine());
	   
	   System.out.println("Set the author of book ");
	   book.setAuthor(keyboard.nextLine());
		
	   System.out.println("Set the title of book ");
	   book.setBookTitle(keyboard.nextLine());
	
	   db.insert(book);
		}
		
		else if (selection==3)
		{
			   System.out.println("Delete the entry for the sku");
			   sku=keyboard.nextLine();
			   
			   db.delete(sku);
		}
	} 

	
	
}
