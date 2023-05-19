import java.io.*;
class shapes
{
	void rectangle(int l,int b){
			int ar=l*b;
			System.out.println("area:"+ar);
	}
	void rectangle(float l,float b){
		float p=2*(l+b);
		System.out.println("perimeter:"+p);
	}
}
class MainClass4_6{
 public static void main(String args[]){
	 shapes s=new shapes();
	 DataInputStream br =new DataInputStream(System.in);
	int l1,b1;
	float l2,b2;
	try{
		System.out.println("Enter Integer length and breadth:");
		l1=Integer.parseInt(br.readLine());
		b1=Integer.parseInt(br.readLine());
		System.out.println("Enter Floating length and breadth:");
		l2=Float.parseFloat(br.readLine());
		b2=Float.parseFloat(br.readLine());
		s.rectangle(l1,b1);
		s.rectangle(l2,b2);
	}catch(Exception e){}
 }
}