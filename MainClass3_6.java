import java.io.*;
class test
{
    public void reverse(int n)
    {
        int rem=0,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of the given number: "+rev);
    }
    
}
public class MainClass3_6
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int num;
            test t=new test();
            System.out.println("Enter any number: ");
            num=Integer.parseInt(dis.readLine());
            t.reverse(num);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}