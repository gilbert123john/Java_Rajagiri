//  Write a program to implement Serialization and De-Serialization, for an object of Student Class.
import java.io.*;
public class SubClass12_1_Student implements Serializable{
    String name;
    int age;
    int rno;

    public SubClass12_1_Student(String name,int age,int rno){
        this.name=name;
        this.age=age;
        this.rno=rno;
    }
    public void display(){
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
        System.out.println("Roll no  is :"+rno);
    }
}

import java.io.*;
class MainClass12_1_Serialization {
    public static void main(String[] args)
    {
       SubClass12_1_Student s = new SubClass12_1_Student("abcd",22,121);
       SubClass12_1_Student ss = new SubClass12_1_Student("gil",24,123);
       try{
        FileOutputStream fout = new FileOutputStream("E:\\Java\\s.txt");//creation of file
        ObjectOutputStream oss = new ObjectOutputStream(fout);//saving the object
        oss.writeObject(s);
        oss.writeObject(ss);
        System.out.println("Serialization happened");
       } 
       catch(IOException e){
        System.out.println(e);
       }
    }
}

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
       }
       catch(IOException e){
        System.out.println(e);
       }
       catch(ClassNotFoundException f){
        System.out.println(f);
       }
    }
}