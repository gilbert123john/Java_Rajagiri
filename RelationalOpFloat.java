//Relational operator in float;
import java.io.*;
public class RelationalOpFloat{
	public static void main(String args[]){
		float x=10.236F,y=11.201f;
		DataInputStream input = new DataInputStream(System.in);
		
			System.out.println("x="+x+" and y="+y);
			System.out.println("x<y :"+(x<y));
			System.out.println("x>y :"+(x>y));
			System.out.println("x==y :"+(x==y));
			System.out.println("x<=y :"+(x<=y));
			System.out.println("x>=y :"+(x>=y));
			System.out.println("x!=y :"+(x!=y));
	}
}
