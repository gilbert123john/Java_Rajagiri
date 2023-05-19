/*
SQL CODE
create or replace procedure DispEmp(name out varchar2 ,sal out number,no in number)
is
begin
select ename,esal into name,sal from Employee2 where eno=no; 
end;
/
 */

package Slot_20;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainClass20_2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "mca","mca");
			CallableStatement cs = con.prepareCall("{call DispEmp(?,?,?)}");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employee2");
			System.out.println("Employee Name\tSalary");
			System.out.println("************* ******");
			while (rs.next()) {
				Scanner sc = new Scanner(System.in);
				int id = rs.getInt(1);
				cs.registerOutParameter(1, java.sql.Types.VARCHAR);
				cs.registerOutParameter(2, java.sql.Types.NUMERIC);
				cs.setInt(3, id);
				cs.executeUpdate();
				String name = cs.getString(1);
				String salary = cs.getString(2);
				System.out.println(name + "\t\t" + salary);
			}
		} catch (Exception e) {
			System.out.println("error " + e);
		}

	}

}
