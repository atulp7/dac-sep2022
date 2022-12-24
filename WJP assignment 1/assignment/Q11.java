package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Q11 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advancejava?useSSL=false","root","root");
			CallableStatement s = con.prepareCall("{ call my_pro(?) }");
		
			int i = s.executeUpdate();
			
			System.out.println(i+" rows inserted");
			s.close();
			con.close();
	
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");

	}

}
