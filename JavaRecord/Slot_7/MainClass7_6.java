//Write a program to calculate the value of nCr for given values of n and r using packages. 
package mypack;

public class Fact{
    public static int getFact(int val){
        if(val>0){
            return(val*getFact(val-1));
        }
        else
            return 1;
    }
}

import java.util.*;
import mypack.*;

class MainClass7_6{
  public static void main (String args[]){
    int n,r,d,ans;
    int nFact,rFact,dFact;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value for n");
    n=sc.nextInt();
    System.out.println("Enter the value for r");
    r=sc.nextInt();
    nFact=Fact.getFact(n);//calling Fact directly since getFact is static no need object creation
    rFact=Fact.getFact(r);
    d=n-r;
    dFact=Fact.getFact(d);
    ans=nFact/(rFact*dFact);
    System.out.println("nCr = "+ans);
    
  }
}
