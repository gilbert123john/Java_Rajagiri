//  Thread creations Method 1 - extends thread
import java.lang.*; 

class AAA extends Thread{
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

class MainClass_CreationOfThreads{
    public static void main(String args[]){
        AAA a = new AAA("Gilbert");//this is now automatically thread
        a.start();//start is an inbuilt method
    } 
}


