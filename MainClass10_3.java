//  Write a program to search for a given file name in a directory (including its subdirectory) content.
import java.io.*;
import java.util.*;

class MainClass10_3{
    static void listall(String p,String name){
        try{
            File f = new File(p);
            File[] fa=f.listFiles();
            for(File a: fa){
                if(a.isDirectory()){
                    listall(a.getPath(),name);  
                }
                else{
                    System.out.println("File "+a);
                    // StringBuilder nameOfFile= new StringBuilder(a).toString();
                    // System.out.println("StringBuilder "+nameOfFile);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String args[]){
        String path,searchName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the file to be Searched :");
        searchName=sc.nextLine();
        System.out.println("Enter the Drive Name (C,D,E ?) :");
        path=sc.nextLine();
        listall(path,searchName);
    }
}