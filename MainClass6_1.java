//6.1
//program to implement run time polymorphism in java using interface, with respet to calculating area of tringle
import java.io.*;
import java.lang.*;

 interface Tringle{
   public void getArea(int length,int breadth);
}

 class Area implements Tringle{
   public void getArea(int length,int breadth){
    double area=.5*length*breadth;
    System.out.println("The calculated area is "+area);
  }
}
public class MainClass6_1{
  public static void main(String args[]){
    int l,b;
    Tringle t;
    System.out.println("Enter the Values to get the area of Triangle");
    DataInputStream dis = new DataInputStream(System.in);
    try{
      System.out.println("Enter the Length");
      l=Integer.parseInt(dis.readLine());
      System.out.println("Enter the Breadth");
      b=Integer.parseInt(dis.readLine());
      t= new Area();
      t.getArea(l,b);
    }
    catch(IOException e){
        System.out.println(e);
    }
  }
}
