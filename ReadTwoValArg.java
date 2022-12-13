//add 2 val from argument;
import java.io.*;
public class ReadTwoValArg{
	public static void main(String args[]){
		int x,y,z;
		DataInputStream input = new DataInputStream(System.in);
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		z=x+y;
		System.out.println("sum is "+z);
		
	}
}
