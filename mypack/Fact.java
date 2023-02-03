package mypack;

public class Fact{
    public static int getFact(int val){
        if(val>0){
            return(val*getFact(val-1));
        }
        else
            return 1;
    }
}