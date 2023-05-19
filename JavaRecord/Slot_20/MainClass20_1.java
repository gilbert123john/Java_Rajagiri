/*
 * SQL CODE
 create or replace procedure "EMPINSERT3"
 (dno IN varchar2,dname IN varchar2)
 is
 begin
 insert into Department1 values(dno,dname);
 end;
 /
*/

package Slot_20;

import java.sql.*;

public class MainClass20_1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:orcl", "mca", "mca");
			CallableStatement cs = con.prepareCall("{call EMPINSERT3(?,?)}");
			cs.setString(1, "103");
			cs.setString(2, "Ammu");
			cs.executeUpdate();

			System.out.println("Value inserted");
			con.close();
		} catch (ClassNotFoundException a) {
			System.out.println("ERROR" + a);
		} catch (SQLException e) {
			System.out.println("ERROR" + e);
		}
	}
}
