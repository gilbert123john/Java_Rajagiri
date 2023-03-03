import java.io.*;
import java.util.*;
class Employee implements Serializable
{
    String sid;
    transient String name;
    int age;
    String course;
    void getDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter EID: ");
        sid=sc.nextLine();
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter age: ");
        age=Integer.parseInt(sc.nextLine());
        System.out.print("Enter Designation: ");
        course=sc.nextLine();
    }
    void dispDetails()
    {
    System.out.println("EID : "+sid);
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
    System.out.println("Course : "+course);
    }
}
class MainClass12_4
{
    public static void main(String args[]) throws Exception
    {
        Employee e1 = new Employee();
        e1.getDetails();
        FileOutputStream fos = new
        FileOutputStream("D:\\My_Folder\\Java\\newFile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e1);
        System.out.println("\nEmployee object is serialized");
        fos.close();
        oos.close();
        System.out.println("Deserializing the student object.(Name field declaredtransient).\n");
        FileInputStream fis = new FileInputStream("D:\\My_Folder\\Java\\newFile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e2 = (Employee)ois.readObject();
        e2.dispDetails();
        fis.close();
        oos.close();
    }
}