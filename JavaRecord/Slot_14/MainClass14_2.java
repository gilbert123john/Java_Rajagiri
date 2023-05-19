package Slot_14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientFact {

	public static void main(String[] args) {
		try
		{
			Socket s=new Socket("localhost",1235);
			System.out.println("Sending a request to server");
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("Enter number whose factorial you want to find");
			String num="Fact";
			num+=din.readLine();
			
			dout.writeUTF(num);
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

package Slot_14;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class ServerFact {

	public static void main(String[] args) {
		try
		{
			int i,fact=1;
			ServerSocket ss=new ServerSocket(1235);
			System.out.println("Waiting for connection from client");
			Socket as=ss.accept();
			System.out.println("Made Connection");
			DataInputStream din=new DataInputStream(as.getInputStream());
			String val = (String)din.readLine();
			String s1 = val.substring(val.indexOf("t")+1);
			Integer f=Integer.parseInt(s1);
			for(i=1;i<=f;i++)
			{
				fact*=i;
			}
			System.out.println("Factorial of "+f+" = "+fact);
			
			ss.close();
			as.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}