//find sum using Method Overloading 
import java.io.*;
import java.lang.*;

class FindSum{
	void add(int a,int b){
        
		int c =a+b;
		System.out.println("Sum is "+c);
	}
    void add(int a,int b,float c){
        
		float d =a+b+c;
		System.out.println("Sum is "+d);
	}
    void add(int a,int b,float c,float d){
        
		float e =a+b+c+d;
		System.out.println("Sum is "+e);
	}
    void add(float c,float d){
        
		float e =c+d;
		System.out.println("Sum is "+e);
	}

}
public class ReadValAndFindSum{
	
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

            FindSum m1 = new FindSum();
            m1.add(i1,i2);
            m1.add(i1,i2,f1);
            m1.add(f1,f2);
            m1.add(i1,i2,f1,f2);
		} 
		catch(Exception e){
			System.out.println(e);
		}
        

	}
	
}