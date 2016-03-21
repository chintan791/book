//Bookdatabase

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDatabase {
	static Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String Title;
	private String author;
	private String description;
	private double price;
	//	private String book;

	public Book getBook(String sku)
	{
		Book book = new Book();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from books where sku='"+sku+"'";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				book.setAuthor(rs.getString("author"));
				book.setBookTitle(rs.getString("title"));
				book.setDescription(rs.getString("description"));

				book.setInStock(true);

			}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return book;
	}

	public void connect(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			stmt = con.createStatement();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				//	rs.close();
				stmt.close();
				//	con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	public int updateBook(String sku, String Title, String author){
		int cnt=0;
		try{
			connect();
			String sql="Update Books SET Title= ?, author=? where sku=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,Title);
			pstmt.setString(2, author);
			pstmt.setString(3,sku);
			cnt=pstmt.executeUpdate();
			con.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return cnt;
	}


	public int insert(Book book){
		int cnt=0;
		try{
			connect();
			String insertProduct = "INSERT into books "+ 
					"(sku, Title, author)" + "VALUES (?, ?, ?)";
			PreparedStatement ps= con.prepareStatement(insertProduct);
			ps.setString(1,book.getSku());
			ps.setString(2,book.getBookTitle());
			ps.setString(3, book.getAuthor());
			cnt = ps.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return cnt;
	} 

	public int delete(String Sku){
		int cnt=0;
		try{
			connect();
			String deleteProduct = "DELETE FROM books "+ 
					"WHERE Sku= ?";
			PreparedStatement ps= con.prepareStatement(deleteProduct);
			ps.setString(1,Sku);
			cnt = ps.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return cnt;
	} 
}
















