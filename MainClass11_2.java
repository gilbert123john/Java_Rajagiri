// Write a program to implement a generic method, which can display the elements of various arrays of different data type, and find the length of each array.
class MainClass11_2 {
    static <G> void genericMethod(G []arr)//making a generic array and <G> is the name given 
    {
        int count= 0;
        for(G a:arr){//using of for each loop
            System.out.print(a +"\t");
            count++;
        }
        System.out.println("\n Length of the array is :"+count);
    }
  
    public static void main(String[] args)
    {
        Integer[] intArr = {1,5,3,2,45};//here we can only use int values
        Double[] douArr = {2.1,3.5,5.3,2.6,1.45};// now only double is possible
        String[] strArr = {"My","Name","is","Jo"};// only string accepted

        genericMethod(intArr);
        genericMethod(douArr);
        genericMethod(strArr);
    }
}