//Sum of elements in float array;
import java.io.*;
import java.lang.*;
public class SumOfElementsInFloatArray{
	public static void main(String args[]){
		float a[],sum=0; 
		int n;
		DataInputStream input = new DataInputStream(System.in);
		try{
			System.out.println("Enter the size of array :");
			n=Integer.parseInt(input.readLine());
			a=new float[n];
			System.out.println("Enter Elements into array :");
			for(int i=0;i<n;i++){
				a[i]=Float.parseFloat(input.readLine());
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
