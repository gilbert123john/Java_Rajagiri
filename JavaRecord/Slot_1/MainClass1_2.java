//WAP to display two numbers received as command line argument, and print its product
public class MainClass1_2
{
    public static void main(String args[]) {
        int x,y,p;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        p=x*y;
        System.out.println("Product of "+x+" and "+y+" = "+p);
    }
}