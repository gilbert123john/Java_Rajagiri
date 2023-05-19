import java.io.*;
class findMax
{
    public int max(int x,int y,int z)
    {
      int res;
      res=(x>y)?innerMax(x,z):innerMax(y,z);
      return res;
    }
    int innerMax(int a,int b)
    {
      int val;
      val=(a>b)?a:b;
      return val;
    }
}
public class MainClass4_1
{
    public static void main(String[] args) {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int x,y,z,max;
            System.out.println("Enter X:");
            x=Integer.parseInt(dis.readLine());
            System.out.println("Enter Y:");
            y=Integer.parseInt(dis.readLine());
            System.out.println("Enter Z:");
            z=Integer.parseInt(dis.readLine());
            findMax fm=new findMax();
            int res=fm.max(x,y,z);
            System.out.println("Maximum of "+x+" "+y+" and "+z+" is "+res);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}