package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q8 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advancejava?useSSL=false","root","root");
			Statement s=con.createStatement();
			ResultSet rs =s.executeQuery("select avg(marks) from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			s.close();
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
			System.out.println("done");

	}

}
