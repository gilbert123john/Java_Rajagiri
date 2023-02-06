// producer consumer problem using thread implementation
import java.lang.*;

class Item{
    int i;
    boolean produced = false;
    synchronized void Produce(int s){
        if(!produced){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            produced = true;
            notify();
        }
    }
}
class Producer extends Thread{
    void run(){

    }
}

public class MainClass_ProducerConsumer_Thread{
	public static void main(String args[]){
		Item i = new Item();
	}
}
