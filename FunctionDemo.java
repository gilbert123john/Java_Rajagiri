//implementation of function outside a class ---in a new class;
//agrument, no return type;
import java.io.*;
import java.lang.*;

class Sqrt
{
	public void calc(int val){
		int p = val*val;
		System.out.println("sqrt is "+p);
	}
	
}
class FunctionDemo{
	public static void main(String args[]){
		Sqrt sqrt= new Sqrt();
		int a=10;
		sqrt.calc(a);
	}
}