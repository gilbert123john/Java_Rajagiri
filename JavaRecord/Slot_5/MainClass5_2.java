//program to demonstrate function overriding in java
import java.io.*;
import java.lang.*;
class Teacher{
    public Teacher(){
        System.out.println("Constructor Teacher");
    }
    public void book(){
        System.out.println("Teacher Teaches book");
    }

}
class Student extends Teacher{
    public Student(){
        System.out.println("Constructor Student");
    }
    public void book(){//function overriding implemented
        System.out.println("Student Study book");
    }
}
class MainClass5_2{
    public static void main(String args[]){
        int ch=0;
        DataInputStream dis = new DataInputStream(System.in);
        try{
            while(ch!=3){
                System.out.println("1.Teacher\n2.Student\n3.Exit");
                ch=Integer.parseInt(dis.readLine());
                switch(ch){
                    case 1:
                        Teacher t1=new Teacher();
                        t1.book();
                        break;
                    case 2:
                        Teacher s1=new Student();
                        s1.book();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break; 
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}