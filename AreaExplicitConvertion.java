//narrowing or Explicit type casting;
import java.io.*;
import java.lang.*;
public class AreaExplicitConvertion{
	public static void main(String args[]){
		String s1;
		int x;
		int area;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter radious");
		s1=input.readLine();
		
		x=Integer.parseInt(s1);
		area=(int)3.14*x*x;//this process is called narrowing
		System.out.println("area is "+area);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
