//Enter the num and find sum of num;
import java.io.*;
public class SumOfNumNum{
	public static void main(String args[]){
		String s1;
		int x,sum=0;
		DataInputStream input = new DataInputStream(System.in);
		
		
		try
		{
		System.out.println("Enter x");
		s1=input.readLine();
		
		x=Integer.parseInt(s1);
		while(x!=0){
			sum=sum+(x%10);
			x=x/10;
			}
		System.out.println("sum is "+sum);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
}
