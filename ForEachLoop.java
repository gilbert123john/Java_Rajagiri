//For Each Loop;
import java.io.*;
import java.lang.*;
public class ForEachLoop{
	public static void main(String args[]){
		int a[]={4,5,3,2,9,25,39};
		int sum=0;
		
		for(int i:a){
			sum=sum+i;
		}
		System.out.println("Sum Of the array Element is "+sum);
	}
}
