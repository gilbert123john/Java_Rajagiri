// WAP to accept two numbers from the keyboard and swap them.
import java.io.*;
public class MainClass1_4{
	public static void main(String args[]){
		String s1,s2,temp;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter x");
		s1=input.readLine();
		System.out.println("Enter y");
		s2=input.readLine();
		
		temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println("x is "+s1);
		System.out.println("y is "+s2);
		
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
