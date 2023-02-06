// Synchronisation of method 

import java.lang.*;
class First{
	synchronized public void disp(String msg){//make the method sync
		System.out.print("["+msg);
		try{
                Thread.sleep(1000);
            }
        catch(InterruptedException e){
            System.out.println(e);
        }
		System.out.println("]");
    }
}
class Second extends Thread{
	First ff;
	String ss;
	Second(First f,String s){
		ff=f;
		ss=s;
	}
	public void run(){
		ff.disp(ss);
	}
}
public class MainClass_Synchronisation_Method{
	public static void main(String args[]){
		First fNew= new First();
		Second s1 =new Second(fNew,"Rajagiri");
		s1.start();
		Second s2 =new Second(fNew,"College");
		s2.start();
		Second s3 =new Second(fNew,"Kalamassery");
		s3.start();

	}
}
