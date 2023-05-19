package Slot_19;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MainClass19_1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			PreparedStatement pst=con.prepareStatement("update emp1 set esal=? where ename=?");
			pst.setInt(1,15000);
			pst.setString(2,"Rani");
			int i=pst.executeUpdate();
            System.out.println("records updated " +i);
			con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}