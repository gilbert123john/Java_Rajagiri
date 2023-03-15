import java.io.*;
class Engine implements Serializable
{
	String type;
	float power;
	Engine(String t,float p)
	{
		type=t;
		power=p;
	}
	void dispEngDetails()
	{
		System.out.println("Engine Type : "+type);
		System.out.println("Engine power : "+power);
	}
}
class Bike implements Serializable
{
	String name;
	int displacement;
	Engine e;
	Bike(String name,int disp,Engine e1)
	{
		this.name=name;
		displacement=disp;
		e=e1;
	}
	void dispBikeDetails()
	{
		System.out.println("Bike : "+name);
		System.out.println("Displacement : "+displacement);
		e.dispEngDetails();
	}
}
class MainClass12_3
{
	public static void main(String args[]) throws Exception
	{
		Engine en = new Engine("Single",27.33F);
		Bike b = new Bike("JAWA",293,en);
		FileOutputStream fos = new
		FileOutputStream("engine.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		System.out.println("Serialization of Engine object successful");
		oos.close();
		fos.close();
		System.out.println("\nDeserializing and displaying Engine object:");
		FileInputStream fis = new FileInputStream("engine.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Bike b1 = (Bike)ois.readObject();
		b1.dispBikeDetails();
		ois.close();
		fis.close();
	}
}