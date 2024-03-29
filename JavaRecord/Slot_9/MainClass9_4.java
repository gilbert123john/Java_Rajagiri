//Implement the Producer- Consumer Problem, using Threads.
class Item{
    int i;
    boolean produced = false;
    synchronized void Produce(int s){
        if(produced){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
            i=s;
            System.out.println("Produced "+i);
            produced = true;
            notify();
    }
    synchronized int consume(){
        if(!produced){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
            System.out.println("Consumed "+i);
            produced = false;
            notify();
            
        return i;
    }
}
class Producer extends Thread{
    Item q;
    Producer(Item qq){
        q=qq;
    }
    public void run(){
        int i=0;
        while(i<10){
            q.Produce(++i);
        }
    }
}
class Consumer extends Thread{
    Item q;
    Consumer(Item qq){
        q=qq;
    }
    public void run(){
        while(true){
            q.consume();
        }
    }
}

public class MainClass9_4{
	public static void main(String args[]){
		Item i = new Item();
        Producer p = new Producer(i);
        p.start();
        Consumer c = new Consumer(i);
        c.start();
	}
}