import java.io.*;
import java.lang.*;

class Comp{
	int r,i;
	void read(){
		DataInputStream dis= new DataInputStream(System.in);
		try{
			System.out.println("Enter the real part ->");
			r=Integer.parseInt(dis.readLine());
			System.out.println("Enter the imaginary part ->");
			i=Integer.parseInt(dis.readLine());
		} 
		catch(Exception e){
			System.out.println(e);
		}
	}
	void disp(){
		System.out.println("Entered value is ->"+r+" + "+i+"i");
	}
    void add(Comp c2){
        Comp c = new Comp();
        c.r=this.r+c2.r;
        c.i=this.i+c2.i;
        System.out.println("Sum value is ->"+c.r+" + "+c.i+"i");
    }

}
public class ReadTwoComplexVal{
	public static void main(String args[]){
		Comp c1 = new Comp();
		c1.read();
		c1.disp();

		Comp c2 = new Comp();
        c2.read();
		c2.disp();

        //Comp c3 = new Comp();
        c1.add(c2);
	}
}