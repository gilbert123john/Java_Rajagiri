//  Write a program to implement Serialization and De-Serialization, for an object of Student Class.
import java.io.*;
public class SubClass12_1_Student implements Serializable{//saved in same folder so reusable
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