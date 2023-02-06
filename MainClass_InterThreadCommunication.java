// Inter Thread Communication
// Wait and notify (calc sum of n num)
import java.lang.*;
class Sum extends Thread{
	int total = 0;
	public void run(){
		for(int i=0;i<=10;i++){
			total = total+i;
		}
	}
}
public class MainClass_InterThreadCommunication{
	public static void main(String args[]){
		Sum s = new Sum();
		s.start();
        synchronized(s){// key word 
            try{// wait should be inside try catch
                s.wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
		System.out.println("Sum is "+s.total);
	}
}
