//Read element into array and display it;
import java.io.*;
import java.lang.*;
public class ReadArrayAndDisplay{
	public static void main(String args[]){
		int a[],n; //declearing an array
		DataInputStream input = new DataInputStream(System.in);
		try{
			System.out.println("Enter the size of array :");
			n=Integer.parseInt(input.readLine());
			a=new int[n];
			System.out.println("Enter Elements into array :");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(input.readLine());
			}
			System.out.println("The array elements are :");
			for(int i=0;i<n;i++){
				System.out.print(" "+a[i]);
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
