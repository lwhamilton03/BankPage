//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class BankOperations implements ActionListener {
//
//	public void database()
//	{
//		Connection conn = null; 
//		Statement stmt = null; 
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "password");
//			stmt = conn.createStatement();
//			String getName = "select Name from account where AcNo = "; //+ INPUTFIELD
////			String sqlUpdate = "insert into training values(8, 'Moo', 2)";
////			String sqlAlter = "update training set Name='Man' where Id = 3";
////			stmt.executeUpdate(getName);
////			stmt.executeUpdate(sqlAlter);
//			ResultSet rs = stmt.executeQuery(getName);
//			
//			while(rs.next())
//			{
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				String address = rs.getString(3);
//				System.out.println("AcNo: " + id);
//				System.out.println("Name: " + name);
//				System.out.println("Address: " + address);
//				System.out.println("");
//			}
//			
//			rs.close();
//			stmt.close();
//			conn.close();
//		}catch(Exception se) {}
//	}
//	
//}
