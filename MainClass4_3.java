import java.io.*;
class print{
   void disp1(int n){
	   if (n == 0) return;
		System.out.print(n + " ");
		disp1(n - 1);
		}
	void disp2(int n){
	   if (n == 0) return;
		disp2(n - 1);
		System.out.print(n + " ");
		}	
   }
class MainClass4_3{
	public static void main(String args[]){
	DataInputStream br =new DataInputStream(System.in);
	int n,d;
	try{
		print p=new print();
		System.out.println("enter a number:");
		n=Integer.parseInt(br.readLine());
		System.out.println("n to 1");
		p.disp1(n);
		System.out.println();
		System.out.println("1 to n");
		p.disp2(n);
	}catch(Exception e){}
	}
}