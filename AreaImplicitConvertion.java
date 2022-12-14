//widening or implicit type casting;
import java.io.*;
import java.lang.*;
public class AreaImplicitConvertion{
	public static void main(String args[]){
		String s1;
		int x;
		double area;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter radious");
		s1=input.readLine();
		
		x=Integer.parseInt(s1);
		area=3.14*x*x;
		System.out.println("area is "+area);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
