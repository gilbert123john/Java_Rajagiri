import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class SerDownload {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss=new ServerSocket(1234);
			System.out.println("Waiting for connection from client");
			Socket as=ss.accept();
			System.out.println("Made Connection");
			DataInputStream din=new DataInputStream(as.getInputStream());
			String str = (String)din.readLine();
			String s1 = str.substring(str.indexOf("=") + 1);
			s1.trim();
			System.out.println("The message is "+s1);
			System.out.println("File downloaded");
			ss.close();
			as.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class CliDownload {

	public static void main(String[] args) {
		try
		{
			Socket s=new Socket("localhost",1234);
			System.out.println("Sending a request to server");
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("Enter data u want to send");
			String st=din.readLine();
			dout.writeUTF(st);
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
