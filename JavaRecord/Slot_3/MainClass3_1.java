import java.io.*;
class test
{
    public int reverse(int n)
    {
        int rem=0,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public int palin(int num,int rev)
    {
        if(rev==num)
            return 1;
        else
            return 0;
    }
}
public class MainClass3_1
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
            int rev=t.reverse(num);
            System.out.println("Reverse of the given number: "+rev);
            int res=t.palin(num,rev);
            if(res==1)
                System.out.println("Given number is a palindrome");
            else
                System.out.println("Given number is not a palindrome");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}