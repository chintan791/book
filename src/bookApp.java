import java.util.Scanner;
public class bookApp {

	public static void main(String[] args) {

		double noOfBooks;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of books");
		noOfBooks= sc.nextInt();
		
		book firstBook=new book("ATLAS SHRUGGED ", "AYN RAND ", "GREAT READ ", 23.22 , false, 6 );
		System.out.println(firstBook.getDisplayText());
		
		book secondAssignment = new book("ATLAS SHRUGGED ", "AYN RAND ", "GREAT READ ", 20.00 , true, 6 );
		System.out.println(secondAssignment.getCostOfBooks(noOfBooks));
	}

}
