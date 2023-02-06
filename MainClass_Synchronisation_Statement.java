// Synchronisation of Statement 

import java.lang.*;
class First{
	public void disp(String msg){
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
        synchronized(ff){//hear we make it sync by passing as statement
		ff.disp(ss);
        }
	}
}
public class MainClass_Synchronisation_Statement{
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
