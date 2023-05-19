//  Write a program to implement object cloning of the class distance which has inch and feet as data members
import java.util.*;

class Distance implements Cloneable{
    int inch;
    int feet;
    Distance(int f){
      feet=f;
      inch=f*12;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class MainClass7_2{
    
    public static void main(String args[]) throws CloneNotSupportedException{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Feet to be converted to inch :");
      int feet = sc.nextInt();
        Distance d1 = new Distance(feet);
        
        Distance d2 = (Distance)d1.clone();
        
        System.out.println("Displaying d1 inch ="+d1.inch+" feet ="+d1.feet);
        System.out.println("Displaying d2 inch ="+d2.inch+" feet ="+d2.feet);
    }
}