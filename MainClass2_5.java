//Write a program to print the row wise and column wise sum of a 2D array.
import java.io.*;
import java.lang.*;
public class RowAndColSumOfTwoDimAarray{
	public static void main(String args[]){
        int a[][];
        int r,c;
        DataInputStream input = newe DataInputStream(System.in);

        try{
            System.out.println("Enter the row count :");
            r=Integer.parseInt(input.readLine());
            System.out.println("Enter the column count :");
            c=Integer.parseInt(input.readLine());

            a=new int[r][c];
            for(int i =0;i<r;i++){
                for(int j=0;j<c;j++){
                    a[i][j]=Integer.parseInt(input.readLine());
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}