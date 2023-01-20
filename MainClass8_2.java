// Write a program to implement a user defined Exception, which will throw an Exception when a given number is prime.
import java.io.*;
import java.util.*;

class primeException extends Exception{
    primeException(String m){
        super(m);//why this super?
    }
}
class PrimeValue{
    public boolean checkPrime(int val){
        int n=val/2;
        int i;
        for(i=n;i>1;i--){
            if(val%i==0){
                return false;
            }
        }
        return true;

    }
}
class MainClass8_2{
    public static void main(String args[]){
        int n;
        
        Scanner sc=new Scanner(System.in);
        PrimeValue primeValue = new PrimeValue();

        System.out.println("Enter the number :");
        n=sc.nextInt();
        try{

            boolean a=primeValue.checkPrime(n);
            if(a){
                throw new primeException("Prime number is not allowerd");
            }
        }
        catch(primeException p){
            System.out.println(p);
        }
        
    }

}