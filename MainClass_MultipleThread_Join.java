//  Multiple Thread creation and join 
import java.lang.*; 

class AAA extends Thread{
    String nm;
    AAA(String name){
        nm=name;
    }
    public void run(){
        System.out.println(nm);
        try{
            for(int i =5;i>=0;i--){
                System.out.println("\tA"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class BBB extends Thread{
    String nm;
    BBB(String name){
        nm=name;
    }
    public void run(){
        System.out.println(nm);
        try{
            for(int i =10;i>=0;i=i-2){
                System.out.print("\tB"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class CCC extends Thread{
    String nm;
    CCC(String name){
        nm=name;
    }
    public void run(){
        System.out.println(nm);
        try{
            for(int i =10;i>=0;i=i-2){
                System.out.println("\tC"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class MainClass_MultipleThread_Join{
    public static void main(String args[]){
        AAA a = new AAA("Passed A");
        a.start();
        try{
            a.join();//so hear only after a the thread b and c will be running
        }
        catch(Exception e){
            System.out.println(e);
        }
        BBB b = new BBB("Passed B");
        b.start();
        CCC c = new CCC("Passed C");
        c.start();
    } 
}


