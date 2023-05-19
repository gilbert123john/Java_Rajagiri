import java.io.*;
import java.lang.*;

class strfunc
{
	String str1,str2;
	DataInputStream br=new DataInputStream(System.in);
	public void read()
	{
		try
		{
			System.out.println("Enter String1: ");
			str1=br.readLine();
			System.out.println("Enter String2: ");
			str2=br.readLine();
		}
		catch(Exception e){}
	}
	public void display()
	{
		System.out.println(str1);
		System.out.println(str2);
	}
	public void comp()
	{
		System.out.println(str1.compareTo(str2));
	}
	public void add()
	{
		System.out.println(str1+str2);
	}
	public void concat()
	{
		System.out.println(str1.concat(str2));
	}
}

class MainClass7_1
{
	public static void main(String args[])
	{
		strfunc s= new strfunc();
		s.read();
		s.display();
		s.comp();
		s.add();
		s.concat();
	}
}