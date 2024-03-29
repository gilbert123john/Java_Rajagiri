//  Write a program to search for a given file name in a directory (including its subdirectory) content.
import java.io.*;
import java.util.*;

class MainClass10_3{
    static void listall(String p,String name){
        try{
            File f = new File(p);
            File[] fa=f.listFiles();
            for(File a: fa){
                String s =a.toString();
                boolean found= s.contains(name);
                if(found){
                    System.out.println("File found at location "+a);
                }
                if(a.isDirectory()){
                    listall(a.getPath(),name);  
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
        System.out.println("Enter the Drive Name (C://,D://,E:// and folder if any ?) :");
        path=sc.nextLine();
        listall(path,searchName);
    }
}