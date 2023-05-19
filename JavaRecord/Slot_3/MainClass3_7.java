import java.io.*;
class test
{
    public int sum(int n)
    {
        if (n>0)
        {
            return (n%10+(sum(n/10)));
        }

        else
            return 0;
    }
}
public class MainClass3_7
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
            int res=t.sum(num);
            System.out.println("Sum of digits of "+num+" = "+res);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}