import java.io.*;
import java.lang.Math;
class num{
	int x;
}
class root{
	double sqr(num s){
			double t;
			double sq=s.x/2;
			do{
				t=sq;
				sq=(t+(s.x/t))/2;
			}while((t-sq)!=0);
			return sq;
	}
}
class MainClass6_4{
	public static void main(String args[]){
		try{
			DataInputStream br=new DataInputStream(System.in);
			root r =new root();
			num n=new num();
			System.out.println("Enter a number:");
			n.x=Integer.parseInt(br.readLine());
			System.out.println("Square root of "+n.x+"is: "+ r.sqr(n));
		}catch(Exception e){}
	}
}