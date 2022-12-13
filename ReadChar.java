//reading charachor;
import java.io.*;
public class ReadChar{
	public static void main(String args[]){
		char c;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter charachor :");
		c=(char)input.read();
		System.out.println("charachor is "+c);
		
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
