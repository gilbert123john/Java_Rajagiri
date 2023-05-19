package Slot_20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass20_3 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "mca","mca");
			PreparedStatement pst = con.prepareStatement("insert into department values(?,?,?)");
			con.setAutoCommit(false);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("Enter No :");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter name :");
				String name = br.readLine();
				System.out.println("Enter location :");
				String loc = br.readLine();
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setString(3, loc);
				pst.executeUpdate();
				System.out.println("Commit/Rollback?(c/r)");
				String ans = br.readLine();
				if (ans.startsWith("c"))
					con.commit();
				else
					con.rollback();
				System.out.println("Yes/No");
				String s = br.readLine();
				if (s.startsWith("n"))
					break;
			} while (true);
			System.out.println("Records updated!");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
