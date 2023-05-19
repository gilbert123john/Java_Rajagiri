//Write a program to reverse a string 
import java.util.*;
import java.io.*;

class MainClass7_4{
  public static void main (String args[]){
    String s;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string to be reversed");
    s=sc.nextLine();
    StringBuilder rev= new StringBuilder(s);
    rev.reverse();
    System.out.println(rev.toString());
  }
}
