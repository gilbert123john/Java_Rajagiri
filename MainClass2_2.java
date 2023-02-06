//Find the minimum of three numbers using a single statement.
import java.io.*;
import java.lang.*;
public class MainClass2_2{
	public static void main(String args[]){
		int x,y,z,small;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter x");
		x=Integer.parseInt(input.readLine());
		System.out.println("Enter y");
		y=Integer.parseInt(input.readLine());
        System.out.println("Enter z");
		z=Integer.parseInt(input.readLine());
        small=(x<y&&x<z)?x:(y<z?y:z);
        System.out.println("Small is "+small);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
