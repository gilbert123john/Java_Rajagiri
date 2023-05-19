import java.io.*;
import java.util.*;
interface shape 
{
    public void disp();
    public void calc();
}
class circle implements shape 
{
    public void disp()
    {
    System.out.println("\nThe shape is circle ");
    }
    public void calc()
    {
    try{
		DataInputStream br=new DataInputStream(System.in);
		System.out.print("Enter the radius :");
		int r=Integer.parseInt(br.readLine());
		double v=3.14*3.14*r;
		System.out.println("The volume is "+v);
		} catch(Exception e){System.out.println(e);}
	}
}
class rectangle implements shape 
{
    public void disp()
    {
        System.out.println("\nThe shape is rectangle ");
    }
    public void calc()
    {
		try{
			DataInputStream br=new DataInputStream(System.in);
			System.out.print("Enter the length :");
			int l=Integer.parseInt(br.readLine());
			System.out.print("Enter the bredth :");
			int b=Integer.parseInt(br.readLine());
			double v=l*b;
			System.out.println("The volume is "+v);
		}catch(Exception e){System.out.println(e);}
    } 
}
class MainClass6_2
{
    public static void main(String arg[])
    {
		int ch;
		try{
			DataInputStream br=new DataInputStream(System.in);
			do
			{
				System.out.print("\n MENU \n======\n1.Circle \n2.Rectangle \n3.Exit\n");
			     ch=Integer.parseInt(br.readLine());
				switch(ch){
					case 1:circle cr=new circle();
					cr.disp();
					cr.calc();
					break;
					case 2:rectangle rt=new rectangle ();
					rt.disp();
					rt.calc();
					break;
				} 
			} while (ch!=3);
		} catch(Exception e){System.out.println(e);}
	}
}