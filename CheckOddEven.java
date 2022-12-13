//check odd or even ;
import java.io.*;
public class CheckOddEven{
	public static void main(String args[]){
		String s1;
		int x;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter the value :");
		s1=input.readLine();
		x=Integer.parseInt(s1);
		//(x%2==0) ? System.out.println("Even"):System.out.println("odd");
		if(x%2==0){
			System.out.println("Even");
		}
		else
			System.out.println("odd");
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
