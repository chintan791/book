import java.util.Scanner;
public class BookApp {

	public static void main(String[] args) {

		double noOfBooks;
		String SKU="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of books");
		noOfBooks= sc.nextInt();
	
		System.out.println("Enter book code");
		SKU= sc.next();
		
	    Book firstBook=new Book("ATLAS SHRUGGED ", "AYN RAND ", "GREAT READ ", 23.22 , false, 6 );
		System.out.println(firstBook.getDisplayText());
		
		Book secondAssignment = new Book("ATLAS SHRUGGED ", "AYN RAND ", "GREAT READ ", 20.00 , true, 6 );
		System.out.println(secondAssignment.getCostOfBooks(noOfBooks));
	
		BookDatabase dataAssignment = new BookDatabase();
		System.out.println(dataAssignment.BookData(SKU));
	
	}

}
