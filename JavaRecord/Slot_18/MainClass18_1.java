package Slot_18;
import java.io.*;
import java.sql.*;
class Oops {
		void create()
		{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","electro","electro");
		Statement stmt= con.createStatement();
		stmt.executeUpdate("create table Oops(sid int NOT NULL, sname varchar(20), sage int, saddr varchar(20))");
		System.out.println("Table created!!");
		con.close();
		}
		catch (Exception e) {System.out.println(e);}
		}
		void insert(int id,String name,int age, String addr)
		{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","electro","electro");
		Statement stmt= con.createStatement();
		stmt.executeUpdate("insert into Oops values("+id+",'"+name+"',"+age+",'"+addr+"')");
		System.out.println("Value inserted!!");
		con.close();
		}
		catch (Exception e) {System.out.println(e);}
		}
		void delete(int id)
		{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","electro","electro");
				Statement stmt= con.createStatement();
				stmt.executeUpdate("delete from Oops where sid = "+id+"");
				System.out.println("Record deleted!!");
				con.close();
				}
				catch (Exception e) {System.out.println(e);}
				}
				void search(int id)
				{
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","electro","electro");
				Statement stmt= con.createStatement();
				ResultSet rs;
				rs = stmt.executeQuery("select * from Oops where sid ="+id+" ");
				System.out.println("ID\t\tNAME\t\tAGE\t\tADDRESS");
				while(rs.next())
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"
				+rs.getString(4));
				con.close();
				}
				catch (Exception e) {System.out.println(e);}
				}
				void update(int id,String name,int age, String addr)
				{
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","electro","electro");
				Statement stmt= con.createStatement();
				stmt.executeUpdate("update Oops set sname='"+name+"',sage="+age+",saddr='"+addr+"'where sid="+id+" ");
				System.out.println("table updated");
				con.close();
				}
				catch (Exception e) {System.out.println(e);}
				}
				void disp()
				{
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","electro","electro");
					Statement stmt= con.createStatement();
					ResultSet rs= stmt.executeQuery("select * from Oops");
					System.out.println("ID\t\tNAME\t\tAGE\t\tADDRESS");
					System.out.println("-------------------------------------------------------------");
					while(rs.next())
					System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"
					+rs.getString(4));
					con.close();
					}
					catch (Exception e) {System.out.println(e);}
					}
					}
public class MainClass18_1 {
					public static void main(String[] args) throws Exception
					{
					Oops s=new Oops();
					int id,age,n;
					String name,addr;
					DataInputStream d=new DataInputStream(System.in);
					int i;
					do
					{
					System.out.println("\n------------------------------------------------------------------");
					System.out.print("\n1. Create table\n2. Insert record\n3. Search record\n4.Delete ");
					System.out.println("record\n5. Update record\n6. Display all records\n7. Exit");
					System.out.println("\n------------------------------------------------------------------");
					System.out.print("Enter choice : ");
					i=Integer.parseInt(d.readLine());
					switch(i){
					case 1: s.create();
					break;
					case 2: System.out.print("Enter no. of records to insert : ");
					n=Integer.parseInt(d.readLine());
					for(i=0;i<n;i++){
					System.out.print("\nEnter id: ");
					id=Integer.parseInt(d.readLine());
					System.out.print("Enter name: ");
					name=d.readLine();
					System.out.print("Enter age: ");
					age=Integer.parseInt(d.readLine());
					System.out.print("Enter address: ");
					addr=d.readLine();
					s.insert(id,name,age,addr);
					}
					break;
					case 3: System.out.print("Enter id to search: ");
					id=Integer.parseInt(d.readLine());
					s.search(id);
					break;
					case 4: System.out.print("Enter id to delete: ");
					id=Integer.parseInt(d.readLine());
					s.delete(id);
					break;
					case 5: System.out.print("Enter id to update: ");
					id=Integer.parseInt(d.readLine());
					System.out.print("Enter name: ");
					name=d.readLine();
					System.out.print("Enter age: ");
					age=Integer.parseInt(d.readLine());
					System.out.print("Enter address: ");
					addr=d.readLine();
					s.update(id,name,age,addr);
					break;
					case 6: s.disp();
					break;
					case 7: System.exit(0);
					break;
					}
					}while(true);
					}

	}
