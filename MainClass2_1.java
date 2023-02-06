// WAP to read three numbers and the maximum.
import java.io.*;
public class BigInThree{
	public static void main(String args[]){
		int x,y,z,big;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter x");
		x=Integer.parseInt(input.readLine());
		System.out.println("Enter y");
		y=Integer.parseInt(input.readLine());
        System.out.println("Enter z");
		z=Integer.parseInt(input.readLine());
        if(x>y&&x>z){
            big=x;
        }
        else if(y>z)
            big=y;
        else
            big=z;
		System.out.println("Big is "+big);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
