import java.io.*;
class facto{
   int fact(int n){
	   if(n>=1)
		   return n*fact(n-1);
	   else
		   return 1;
   }
}
class MainClass4_2{
	public static void main(String args[]){
	DataInputStream br =new DataInputStream(System.in);
	int n,d;
	try{
		facto f=new facto();
		System.out.println("enter a number:");
		n=Integer.parseInt(br.readLine());
		d=f.fact(n);
		System.out.println("factorial of a given number:"+d);
	}catch(Exception e){}
	}
}