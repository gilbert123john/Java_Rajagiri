// WAP to sort elements in an array in ascending order.
import java.io.*;
import java.lang.*;
public class SortArrayElementsAsc{
	public static void main(String args[]){
		int a[],n; 
		int temp;
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
				for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			}
			System.out.println("The Sorted array elements are :");
			for(int i=0;i<n;i++){
				System.out.print(" "+a[i]);
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}