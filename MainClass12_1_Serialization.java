//  Write a program to implement Serialization and De-Serialization, for an object of Student Class.
import java.io.*;
class MainClass12_1_Serialization {
    public static void main(String[] args)
    {
       SubClass12_1_Student s = new SubClass12_1_Student("abcd",22,121);
       SubClass12_1_Student ss = new SubClass12_1_Student("gil",24,123);
       try{
        FileOutputStream fout = new FileOutputStream("s.txt");//creation of file
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