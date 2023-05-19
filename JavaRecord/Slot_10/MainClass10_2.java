// Write a program to display the contents of a given directory(take the directory path through the keyboard)  including its subdirectory content using recursive function.
import java.io.*;
import java.util.*;

class MainClass10_2{
    static void listall(String p){
        try{
            File f = new File(p);
            File[] fa=f.listFiles();
            for(File a: fa){
                if(a.isDirectory()){
                    System.out.println("Directory "+a);
                    listall(a.getPath());  
                }
                else{
                    System.out.println("File "+a);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String args[]){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the File Location :");
        s=sc.nextLine();
        listall(s);
    }
}