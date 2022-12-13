//Swap 2 val by reading value;
import java.io.*;
public class SwapVal{
	public static void main(String args[]){
		String s1,s2,temp;
		int x,y,z;
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
