package Slot_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass20_4 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "mca", "mca");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("select * from Employee2 where ename='Bob'");
		} catch (SQLException e) {
			System.out.println("SQL message :" + e.getMessage());
			System.out.println("SQL state :" + e.getSQLState());
			System.out.println("SQL error code :" + e.getErrorCode());
			System.out.println("SQL cause :" + e.getCause());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("error " + e);

		}
	}
}
