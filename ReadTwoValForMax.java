//Method Overloading 
import java.io.*;
import java.lang.*;

class FindMax{
	int r,i;
	void max(int a,int b){
        
		int c =a>b?a:b;
		System.out.println("big is "+c);
	}
    void max(float a,int b){
		float c =a>b?a:b;
		System.out.println("big is "+c);
		
	}
    void max(float a,float b){
		float c =a>b?a:b;
		System.out.println("big is "+c);
		
	}

}
public class ReadTwoValForMax{
	public static void main(String args[]){
        int i1,i2;
        float f1,f2;
		DataInputStream dis= new DataInputStream(System.in);
        try{
			System.out.println("Enter the First integer value ->");
			i1=Integer.parseInt(dis.readLine());
			System.out.println("Enter the Second integer value ->");
			i2=Integer.parseInt(dis.readLine());
            System.out.println("Enter the First Floating value ->");
			f1=Float.parseFloat(dis.readLine());
			System.out.println("Enter the Second Floating value ->");
			f2=Float.parseFloat(dis.readLine());

            FindMax m = new FindMax();
            m.max(i1,i2);
            m.max(f1,i2);
            m.max(f1,f2);
		} 
		catch(Exception e){
			System.out.println(e);
		}
        

	}
}