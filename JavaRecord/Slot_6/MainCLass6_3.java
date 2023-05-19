import java.io.*;
class num{
void test(float a,float b){
	float c=a;
	a=b;
	b=c;
	System.out.println("inside fn :: a:"+a+" b:"+b);
	}
}
class MainClass6_3{
	public static void main(String args[]){
		num n=new num();
		float a,b;
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("Enter no:");
			a=Float.parseFloat(br.readLine());
			b=Float.parseFloat(br.readLine());
			System.out.println("before fn call :: a:"+a+" b:"+b);
			n.test(a,b);
			System.out.println("after fn call :: a:"+a+" b:"+b);
		}catch(Exception e){}
	}
}