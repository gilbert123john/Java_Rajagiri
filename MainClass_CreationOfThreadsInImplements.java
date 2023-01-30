//  Thread creations Method 2 - Implements thread
import java.lang.*; 

class AAA implements Runnable{
    String nm;
    AAA(String name){
        nm=name;
    }
    public void run(){//when we call a.start() then this rum method is get executed in thread.
        System.out.println(nm);
        try{
            for(int i =5;i>=0;i--){
                System.out.println(i);
                Thread.sleep(1000);//just give Thread. to call sleep if thread is no object 
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class MainClass_CreationOfThreadsInImplements{
    public static void main(String args[]){
        AAA a = new AAA("Gilbert");//this is now automatically thread
        Thread t = new Thread(a);//hear the a is pass to thread

        t.start();//start is an inbuilt method
    } 
}


