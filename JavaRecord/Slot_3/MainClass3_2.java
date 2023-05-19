//  WAP to display numbers from m to n using single while loop.

import java.io.*;

class MainClass3_2{
	public static void main(String args[])
	{
	String str;
	int m=0,n=0;
	DataInputStream din=new DataInputStream(System.in);
	try
	{
		System.out.println("Enter the value of m: ");
		str=din.readLine();
		m=Integer.parseInt(str);
		System.out.println("Enter the value of n: ");
		str=din.readLine();
		n=Integer.parseInt(str);
		if(m>n)
		{
			System.out.println("Value of M should not be greater than N");
			return;
		}
		else
		{
			while(m<=n)
			{
				System.out.print(m+" ");
				m++;
			}
		}
	}
	catch(IOException e){System.out.println(e);}
	}
}