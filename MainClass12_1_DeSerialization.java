//  Write a program to implement Serialization and De-Serialization, for an object of Student Class.
import java.io.*;
class MainClass12_1_DeSerialization {
    public static void main(String[] args)
    {
       SubClass12_1_Student s1 = null;
       try{
        FileInputStream fin = new FileInputStream("E:\\Java\\s.txt");//file reading 
        ObjectInputStream ois = new ObjectInputStream(fin);//reading object 
        s1= (SubClass12_1_Student)ois.readObject();//assigning value
        System.out.println("De-Serialization done");
        System.out.println("Name is :"+s1.name);
        System.out.println("Age is :"+s1.age);
        System.out.println("Roll no  is :"+s1.rno);
        // s1.display(); // both are possible
       }
       catch(IOException e){
        System.out.println(e);
       }
       catch(ClassNotFoundException f){
        System.out.println(f);
       }
    }
}

