//Write a program to implement throw and finally.
import java.util.*;

class PalindromeExc extends Exception{
    PalindromeExc(String msg){
        super(msg);
    }
}
class MainClass8_3{
    public static void main(String args[]){
        String name;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String Value :");
        name=sc.nextLine();
        StringBuffer revString = new StringBuffer(name);
        StringBuffer actualString = new StringBuffer(name);
        revString=revString.reverse();
        try{
            if(name.equals(revString.toString())){
                System.out.println("The Entered string is a palindrome");
            }
            else{
                throw new PalindromeExc("The Entered String is not acceptable");
            }
        }
        catch(PalindromeExc p){
            System.out.println(p);
        }
        finally{
            System.out.println("The Entered string is "+name);
        }
        
    }
}