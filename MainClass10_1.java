// Write a program to display the contents of a directory by displaying the subdirectory’s name first, then the file names.
import java.io.*;

class MainClass10_1{
    static void listall(String p){
        try{
            File f = new File(p);
            File[] fa=f.listFiles();
            for(File a: fa){
                if(a.isDirectory()){
                    System.out.println("Directory "+a);
                    listall(a.getPath());  
                }
            }
            for(File a: fa){
                if(a.isFile()){
                    System.out.println("File "+a);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String args[]){
        listall("E://AAA");
    }
}