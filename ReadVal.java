//Add 2 num by reading value;
import java.io.*;
public class ReadVal{
	public static void main(String args[]){
		String s1,s2;
		int x,y,z;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter x");
		s1=input.readLine();
		System.out.println("Enter y");
		s2=input.readLine();
		
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=x+y;
		System.out.println("sum is "+z);
		
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
