//WAP to find the sum of the series 1+(1+2)+(1+2+3)+............ +(1+2+3+…+n) using a single while

import java.io.*;
import java.lang.*;
public class MainClass3_3
{
    public static void main(String args[])
    {
        String str;
        int sum=0,n,i=1;
        int temp=0;
        try
		{
            System.out.println("Enter the values:");
            DataInputStream dis=new DataInputStream(System.in);
            str=dis.readLine();
            n=Integer.parseInt(str);
            while(i<=n)
			{
                sum=sum+i;
                temp=temp+sum;
                i++;        
			}
        System.out.println("Sum of series is: "+temp);
		}
		catch(IOException e){System.out.println(e);}
	}
}