import java.io.*;
class test
{
    public void area()
    {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            float r,a;
            System.out.println("Enter the radius:");
            r=Float.parseFloat(dis.readLine());
            a=3.14f*r*r;
            System.out.println("Area of the circle: "+a);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
public class MainClass3_5
{
    public static void main(String[] args) {
        test t=new test();
        t.area();
    }
}