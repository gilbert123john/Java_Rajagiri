//6.2
/* Create an interface Shape having 2 property disp() and calc() , to display the shape calculated area respectively.
Create 2 classes circle and rectangle which implements the above interface .
In main function create a reference of shape depending on the user-choice*/
import java.io.*;
interface Shape {
    final double pi = 3.14;
    public void calc(int length, int breadth);
    public void calc(int radius);
    public void disp();
}

class Circle implements Shape {
  double area;
    public void calc(int radius) {
      area = pi * radius * radius;
    }
    public void disp() {
        System.out.println("The calculated area of circle is " + area);
    }
}
class Rectangle implements Shape {
    double area;
    public void calc(int length, int breadth) {
        area = length * breadth;
    }
    public void disp() {
        System.out.println("The calculated area of Rectangle is " + area);
    }
}
public class MainClass {
    public static void main(String args[]) {
        int l, b, r, ch = 0;
        Shape s;
        DataInputStream dis = new DataInputStream(System.in);
        while (ch != 3) {

            try {
                System.out.println("1.Circle\n2.Rectangle\n3.Exit\n\tEnter your choice to find area :");
                ch = Integer.parseInt(dis.readLine());
                switch (ch) {
                    case 1:
                        s = new Circle();
                        System.out.println("Enter the Radius:");
                        r = Integer.parseInt(dis.readLine());
                        s.calc(r);
                        s.disp();
                        break;
                    case 2:
                        s = new Rectangle();
                        System.out.println("Enter the Length");
                        l = Integer.parseInt(dis.readLine());
                        System.out.println("Enter the Breadth");
                        b = Integer.parseInt(dis.readLine());
                        s.calc(l, b);
                        s.disp();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Not a valid option----");
                        break;
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}