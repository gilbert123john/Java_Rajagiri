//Write a program to print the row wise and column wise sum of a 2D array.
import java.io.*;
import java.lang.*;
class SumArray{
    int a[][],rSum[],cSum[],i,j;
    DataInputStream dis = new DataInputStream(System.in);
    void getArray(int r,int c){
        a= new int[r][c];
        System.out.println("Enter the values to array"); 
         try{
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
				a[i][j]=Integer.parseInt(dis.readLine());
            }
		}
        displaySum(r,c);
        rowSum(r,c);
        columnSum(r,c);
        
         }
         catch(IOException e){
            System.out.println(e);
        }
        
    }
    void rowSum(int r,int c){
        
        rSum = new int[r];
        for(i=0;i<r;i++){
            int total =0;
            for(j=0;j<c;j++){
				total=total+a[i][j];
            }
            rSum[i]=total;
		}
         System.out.println("Row sum is : ");
        for(i=0;i<r;i++){
            System.out.println(rSum[i]);
		}

    }
    void columnSum(int r,int c){
        
        cSum = new int[c];
        for(j=0;j<c;j++){
            int total =0;
            for(i=0;i<r;i++){
				total=total+a[i][j];
            }
            cSum[j]=total;
		}
        System.out.println("column sum is : \n");
        for(i=0;i<c;i++){
            System.out.print("\t"+cSum[i]);
		}
    }
    void displaySum(int r,int c){
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
				System.out.print("\t"+a[i][j]);
            }
            //System.out.print("\t"+rSum[i]+"\n");
            System.out.print("\n");
		}
    }

}
class TwoDArray{
    public static void main(String args[]){
        int r,c;
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter th e num of rows and Column");
        try{
        r=Integer.parseInt(dis.readLine());
        c=Integer.parseInt(dis.readLine());
        SumArray s=new SumArray();
        s.getArray(r,c);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }    
}