
public class book {



		
		private static String bookTitle;
		private static String author;
		private static String description;
		private static double price;
		private boolean isInStock;
		
		
		book(){}

		public book(String firstBook, String firstAuthor, String firstDescription, double firstPrice,boolean firstIsInStock) {
		   bookTitle= firstBook;
		   author = firstAuthor;
		   description= firstDescription;
		   price=firstPrice; 
		   isInStock=firstIsInStock;
		}


		public String getBookTitle() {
			return bookTitle;
		}


		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
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


		public boolean isInStock() {
			return isInStock;
		}


		public void setInStock(boolean isInStock) {
			this.isInStock = isInStock;
		}
		
	
		public static String getDisplayText(){
			
			return ("author: "+ author + "title: "+ bookTitle + "description:" + description) ;
		}
		
		  
	}


