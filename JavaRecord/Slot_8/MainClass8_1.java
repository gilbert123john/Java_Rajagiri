//Read numbers into an array. Perform validations using multiple catch statements / predefined Exceptions.
import java.io.*;
import java.util.*;

class MainClass8_1{
    public static void main(String args[]){
        int a[];
        int n;
        
        Scanner sc=new Scanner(System.in);

        try{
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the number of elements to be entered :");
        n=Integer.parseInt(dis.readLine());
        a=new int [n];
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print("\t"+a[i]);
        }
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(InputMismatchException ime){
            System.out.println(ime);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        
    }

}