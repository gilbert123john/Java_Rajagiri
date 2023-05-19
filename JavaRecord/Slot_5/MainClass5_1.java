//program to display even num upto n using a static function
import java.io.*;

class MainClass5_1{
    public static void main(String args[]){
        int n;
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the value for N  to find the even number:");
        try{
            n=Integer.parseInt(dis.readLine());
            findEven(n);
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
    public static void findEven(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print("\t"+i);
            }
        }
    }
}