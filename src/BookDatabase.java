
public class BookDatabase {

	private String Title;
	private String author;
	private String description;
	private double price;
//	private String book;
	
	
	BookDatabase(){}
	
	public BookDatabase(String aBook, String aAuthor, String aDescription, double aPrice, String finalBook) {
		   setTitle(aBook);
		   setAuthor(aAuthor);
		   setDescription(aDescription);
		   setPrice(aPrice);
	//	   book = finalBook;
	
		}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String BookData(String SKU)
	{
		
	
	   if (SKU.equals("Java1001"))
	   {
		Title = "Head First Java";
		author = "Kathy Sierra";
		description = "Easy to read java workbook";
		price= 47.50;
		
		return ( "Title: " + Title + "author: "+ author + "Description: "+ description + "Price " + price );
	   }
	   
	   else if (SKU.equals("Java1002"))
	   {
		   Title = "Thinking in Java";
			author = "ruce Eckel";
			description = "Details about Java under the hood";
			price= 20.00;
			
			return ("Title: " + Title + "author: "+ author + "Description: "+ description + "Price " + price );
	   }
	   
	   else if (SKU.equals("Orcl1003"))
	   {
		   Title = "oce: Oracle certified Professional Java SE";
			author = "jEANNE bOYARSKY";
			description = "Everything u need to know in one place";
			price= 45.00;
			
			return ("Title: " + Title + "author: "+ author + "Description: "+ description + "Price " + price );
	   }
	   
	   else if (SKU.equals("Python1004"))
	   {
		   Title = "Automate the boring stuff with python";
			author = "Al Sweigart";
			description = "Fun with Python";
			price= 10.50;
			
			return ("Title: " + Title + "author: "+ author + "Description: "+ description + "Price " + price );   
	   }
	   else if (SKU.equals("Zombie1005"))
	   {
		   Title = "The markers guide to zombie apocalypse";
			author = "Simon Monk";
			description = "Defend your base with simple circuits, Arduino, and Rasberry Pi";
			price= 16.50;
			
			return ("Title: " + Title + "author: "+ author + "Description: "+ description + "Price " + price );
	   }
	   else if (SKU.equals("Rasp1006"))
	   {
		   Title = "Rasberry pie- projects for the evil genius";
			author = "Donald Norris";
			description = "A dozen fun projects for Raspberry pie";
			price= 14.75;
			
			return ("Title: " + Title + "  author: "+ author + "  Description: "+ description + "  Price " + price );
	   }
	   else return"";
		
	}
	
}
