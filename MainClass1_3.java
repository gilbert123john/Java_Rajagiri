import java.io.*;
public class MainClass1_3
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int x,y,sum=0;
            System.out.println("Enter X:");
            x=Integer.parseInt(dis.readLine());
            System.out.println("Enter Y:");
            y=Integer.parseInt(dis.readLine());
            sum=x+y;
            System.out.println("Sum of "+x+" and "+y+" is "+sum);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}