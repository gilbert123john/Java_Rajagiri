//narrowing or Explicit type casting;
import java.io.*;
import java.lang.*;
public class AreaExplicitConvertionFloat{
	public static void main(String args[]){
		String s1;
		float x;
		double area;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter radious");
		s1=input.readLine();
		
		x=Float.parseFloat(s1);
		area=(int)3.14*(int)x*x;//this process is called narrowing
		System.out.println("area is "+area);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
