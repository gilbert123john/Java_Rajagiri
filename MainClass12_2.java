import java.io.*;
class Vehicle implements Serializable
{
    String type;
    String color;
    Vehicle(String type,String color)
    {
    this.type=type;
    this.color=color;
    }
}
class Maruti extends Vehicle
{
    int price;
    public Maruti(String type,String color,int price)
    {
    super(type,color);
    this.price=price;
    }
}
public class MainClass12_2
{
    public static void main(String[] args)
    {
        try
        {
        Maruti m1=new Maruti("car","red",5500);
        FileOutputStream fout=new FileOutputStream("demo.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(m1);
        out.flush();
        out.close();
        System.out.println("Success..................");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try{
            FileInputStream fis=new FileInputStream("demo.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Maruti s=(Maruti)ois.readObject();
            System.out.println("Type is "+s.type+" and color is "+ s.color+" and price is "+s.price);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}