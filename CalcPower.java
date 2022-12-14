//implementation of function outside a class ---in a new class;
import java.io.*;
import java.lang.*;

class SqrtAndCube
{
	public void cb(int val){
		int p = val*sq(val);
		System.out.println("cube is "+p);
	}
	public int sq(int val){
		int p = val*val;
		System.out.println("sqrt is "+p);
		return p;
	}
	
}
class CalcPower{
	public static void main(String args[]){
		SqrtAndCube calc= new SqrtAndCube();
		int a=10;
		calc.cb(a);
	}
}