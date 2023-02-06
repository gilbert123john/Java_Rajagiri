//WAP to search for a given element in an array.
import java.io.*;
import java.lang.*;
public class SearchArrayElement{
	public static void main(String args[]){
		int a[],i,n,chk;
		int big=0;
		DataInputStream input = new DataInputStream(System.in);
		try{
			System.out.println("Enter the size of array :");
			n=Integer.parseInt(input.readLine());
			a=new int[n];
			System.out.println("Enter Elements into array :");
			for(i=0;i<n;i++){
				a[i]=Integer.parseInt(input.readLine());
			}
            System.out.println("Enter the value to check :");
			chk=Integer.parseInt(input.readLine());
			for(i=0;i<n;i++){
				if(a[i]==chk){
                    System.out.println("The element is found at pos :"+(i+1));
                    break;
                }
			}
            if(i==n)
                System.out.println("The element is not found ");
		}
		catch(IOException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
		}
	}
}