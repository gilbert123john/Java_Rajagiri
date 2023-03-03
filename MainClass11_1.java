import java.io.*;
import java.util.Scanner;
class Operations
{
	void createFile(String fileName) throws Exception
	{
		RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
		raf.close();
	}
	void readFile(String fileName)
	{
		try {
			byte[] b = new byte[1024];
			RandomAccessFile raf = new
			RandomAccessFile(fileName,"r");
			raf.seek(0);
			raf.read(b);
			String str = new String(b);
			System.out.println("The contents of the file is: \n"+str);
			raf.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void write(String fileName,String str ){
		try {
			byte[] b = str.getBytes();
			RandomAccessFile raf = new
			RandomAccessFile(fileName,"rw");

			raf.write(b);
			System.out.println("Write successful");
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void append(String fileName,String str ){
		try {
			byte[] b = str.getBytes();
			RandomAccessFile raf = new
			RandomAccessFile(fileName,"rw");
			raf.seek(raf.length());
			raf.write(b);
			System.out.println("Write successful");
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public class MainClass11_1 {
public static void main(String[] args) {
	try {
		Operations fo = new Operations();
		int ch;
		do
		{
			System.out.println("\nFile Menu");
			System.out.println("1. Create file");
			System.out.println("2. Read file");
			System.out.println("3. Write file");
			System.out.println("4. Append file");
			System.out.println("5. Delete file");
			System.out.println("6. Exit");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your option: ");
			ch= Integer.parseInt(sc.nextLine());
			switch(ch)
			{
			case 1:
				fo.createFile("Pgm11_1.txt");
				System.out.println("File created Pgm11_1.txt");
				break;
			case 2:
				fo.readFile("Pgm11_1.txt");
				break;
			case 3:
				System.out.print("Enter the content to be written: ");
				String str =sc.nextLine();
				fo.write("Pgm11_1.txt", str);
				break;
			case 4:
				System.out.print("Enter the content to be appended: ");
				str =sc.nextLine();
				fo.append("Pgm11_1.txt", str);
				break;
			case 5:
				File demo = new
				File("Pgm11_1.txt");
				if(demo.delete())
					System.out.println("File Pgm11_1.txt deleted");
				else
					System.out.println("File Pgm11_1.txt NOT deleted");
				break;
			case 6:
				break;
			}
		}while(ch!=6);

	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}