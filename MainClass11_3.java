//not completed
//  Write a program to implement a Generic class, and display the types of various parameters passed

class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) {// constructor
        this.obj = obj;
    } 
    public T getObject() {
        return this.obj; 
    }
}
  
// Driver class to test above
class MainClass11_3 {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Test<String> sObj
            = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}