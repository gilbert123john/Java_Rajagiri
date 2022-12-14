//reverse of a number using function
import java.io.*;
class FunctionHouse{
    public void rev(int n){
        int result =0;
        while(n>0){
            result=result*10+(n%10);
            n=n/10;
        }
        System.out.println("Reverse num is :"+result);
    }
}

public class ReversANumber{
    public static void main(String args[]){
        DataInputStream input = new DataInputStream(System.in);

        FunctionHouse functionHouse= new FunctionHouse();
        System.out.println("Enter the value to reverse :");
        try{
            functionHouse.rev(Integer.parseInt(input.readLine()));
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}