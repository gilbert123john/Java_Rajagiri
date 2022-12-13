//Relational operator;
import java.io.*;
public class RelationalOp{
	public static void main(String args[]){
		int x=100,y=100;
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
