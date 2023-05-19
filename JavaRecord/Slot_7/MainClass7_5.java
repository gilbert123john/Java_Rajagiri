//Write a program to calculate the prime factor of a given number using package
package mypack;
import java.lang.Math;

public class PrimeFact{
    public static void getPrimeFact(int n){
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
 
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
 
        if (n > 2)
            System.out.print(n);
    }
}

import java.util.*;
import mypack.*;

class MainClass7_5{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for Finding the Prime Factor");
        n=sc.nextInt();
        PrimeFact.getPrimeFact(n);
    }
}
