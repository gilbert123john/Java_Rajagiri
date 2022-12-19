//Using constructor find the sum of two number
import java.io.*;
import java.lang.*;

class Sum{

int x, y;
    Sum(){ //empty constructor
        System.out.println("Consructor Decleared");
    }
    Sum(int a,int b){ // parameterized constructor
        x=a;
        y=b;
        add();
        
    }
    void add(){
        x=x+y;
        System.out.println("Sum is "+x);
    }

}

class FindSumUsingConstructor{
    public static void main(String args[]){
        //Sum s=new Sum();
        Sum s2= new Sum(10,20);
        s2.add();
    }

}