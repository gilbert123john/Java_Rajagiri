//find highest element in array
import java.io.*;
import java.lang.*;
public class BigArrayElement{
	public static void main(String args[]){
		int a[],n; 
		int big=0;
		DataInputStream input = new DataInputStream(System.in);
		try{
			System.out.println("Enter the size of array :");
			n=Integer.parseInt(input.readLine());
			a=new int[n];
			System.out.println("Enter Elements into array :");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(input.readLine());
			}
			for(int i=0;i<n-1;i++){
			if(a[i]>a[i+1]){
					big=a[i];
					}
				else {
					big =a[i+1];
				}
			}
			System.out.println("The Bigest array element is :"+big);
		}
		catch(IOException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
		}
	}
}