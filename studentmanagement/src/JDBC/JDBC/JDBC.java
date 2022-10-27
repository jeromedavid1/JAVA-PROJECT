package JDBC;
import java.sql.*;

public class JDBC {

	public static void main(String[] args) {
		try 
		{
			// call the jdbc driver 
			Class.forName("com.mysql.jdbc.Driver");
			// create the connection and make the setup, port num, localhost,username password......
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs","root","Jerome$12");
			//Create the statements bcz we want to call the query
			Statement st=con.createStatement();
			//I want to execute the query and assign to the ResultSet
			ResultSet rs=st.executeQuery("select * from student_management");
while(rs.next())
System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"   "+rs.getString(5)+"   "+rs.getString(6)+"       "+rs.getString(7)+"   "+rs.getString(8)+"   "+rs.getString(9)+"   "+rs.getString(10)+"   "+rs.getString(11)+"   "+rs.getString(12)+"   "+rs.getString(13)+"   "+rs.getString(14)+"   "+rs.getString(15)+"   "+rs.getString(16)+"   "+rs.getString(17)+"   "+rs.getString(18));
			//we want to release the connection by using of close()
			con.close();
		}
		// if we are not able to catch the connection in this situation our exception will appear 
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
