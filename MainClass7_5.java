//Write a program to calculate the prime factor of a given number using package
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
