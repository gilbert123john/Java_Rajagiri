package Slot_19;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass19_2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			PreparedStatement pst=con.prepareStatement("select * from emp1 where ename like ?");
			pst.setString(1,"R%");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
			}
			con.close();
	}catch(Exception e) {
		System.out.println(e);
	}

	}

}