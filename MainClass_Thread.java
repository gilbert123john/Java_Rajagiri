//  Thread
import java.lang.*;//this is required for threading 
class MainClass_Thread{
    public static void main(String args[]){//main is the first thread in a program
        Thread mt = Thread.currentThread();//now main is the current thread
        System.out.println(mt);// output is:Thread[main,5,main]
        mt.setName("MyThread");//for changing the thread name
        mt.setPriority(3);//for giving the priority to thread
        System.out.println(mt);// output is:Thread[MyThread,3,main]
        //In output the Thread shows the thread class

        try{
            for(int i =5;i>=0;i--){
                System.out.println(i);
                mt.sleep(2000);//1000 mlsec is 1 sec.
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    } 

}

