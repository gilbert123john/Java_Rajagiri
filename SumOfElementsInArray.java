//Sum of elements in array;
import java.io.*;
import java.lang.*;
public class SumOfElementsInArray{
	public static void main(String args[]){
		int a[],n,sum=0; 
		DataInputStream input = new DataInputStream(System.in);
		try{
			System.out.println("Enter the size of array :");
			n=Integer.parseInt(input.readLine());
			a=new int[n];
			System.out.println("Enter Elements into array :");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(input.readLine());
			}
			
			for(int i=0;i<n;i++){
				sum=sum+a[i];
			}
			System.out.println("Sum Of the array Element is "+sum);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
