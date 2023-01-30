//reading charachor;
import java.io.*;
import java.util.*;
public class ReadChar{
	public static void main(String args[]){
		char c;
		DataInputStream input = new DataInputStream(System.in);
		Scanner sc = new Scanner(System.in);
		
		try
		{
		System.out.println("Enter charachor :");
		c=(char)input.read();
		char ch = sc.nextLine().charAt(0);// this will get the char from specific index
		System.out.println("charachor is "+c);
		System.out.println("charachor is "+ch);
		
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
