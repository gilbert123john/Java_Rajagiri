//  menu driven program to find length of a string, compare equality ,get substring ,convert upper case to lower case.
import java.util.*;
class Menu{
  Scanner sc = new Scanner(System.in);

  int getMenu(){
    System.out.println("------------------------------------------------------------------------------------------");
    System.out.println("\t\t\tSelect your required operation");
    System.out.println("\t\t\t1.Find the Length of the Entered String");
    System.out.println("\t\t\t2.Compare Equality of the string with new string");
    System.out.println("\t\t\t3.Get the substring from the given String");
    System.out.println("\t\t\t4.Convert the UPPER case to lower case");
    System.out.println("\t\t\t5.Exit");
    System.out.println("------------------------------------------------------------------------------------------");
    System.out.print("\t\t\tEnter your choice:");
    return (sc.nextInt());

  }
}
class StringOperations extends Menu{

  Scanner sc = new Scanner(System.in);

  void getLength(String s){
    System.out.println("the Length is "+s.length());
  }
  void checkEquality(String s1,String s2){
    boolean eql = s1.equals(s2);
    if(eql)
      System.out.println("The Strings are Equal");
    else
      System.out.println("The Strings are not Equal");
  }
  void getSubString(String s){
    System.out.println("Enter your Starting Index");
    int start = sc.nextInt();
    System.out.println("Are you specifying Ending Index y/n ?");
    char ch = sc.next().charAt(0);
    try{
      if(ch=='y'){
      System.out.println("Enter your Ending Index");
      int ending = sc.nextInt();
      System.out.println("Your output is :"+s.substring(start,ending));
      }
      else{
        System.out.println("Your output is :"+s.substring(start));
      }
    }
    catch(StringIndexOutOfBoundsException e){
        e.printStackTrace();
    }
    
  }
}

class MainClass7_3{
  public static void main(String args[]){
    String s;
    
    Scanner sc = new Scanner(System.in);
    StringOperations stringOperations = new StringOperations();

    System.out.println("Enter the string :");
    s= sc.nextLine();
    try{

    
    for(int ch=stringOperations.getMenu();ch!=5;ch=stringOperations.getMenu()){
      switch(ch){
        case 1:
          stringOperations.getLength(s);
          break;
        case 2:
          System.out.println("Enter your second string which need to be compared:");
          String s2=sc.nextLine();
          stringOperations.checkEquality(s,s2);
          break;
        case 3:
          stringOperations.getSubString(s);
          break;
        case 4:
          System.out.println("the convertd string is :"+s.toLowerCase());
          break;
        default:
          System.out.println("The Data is not proper.");
          break;
      }
    }
    }
    catch(InputMismatchException e){
      System.out.println(e);
    }
  }
}
