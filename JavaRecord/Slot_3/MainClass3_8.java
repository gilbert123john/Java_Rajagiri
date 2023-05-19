import java.io.*;
class test{
    public int calc()
    {
        int n,i,sum=0;
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter n:");
            n=Integer.parseInt(dis.readLine());
            for(i=0;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        return sum;
    }
}
public class MainClass3_8
{
    public static void main(String[] args) {
        test t=new test();
        int sum=t.calc();
        System.out.println("Sum of even numbers: "+sum);
    }
}