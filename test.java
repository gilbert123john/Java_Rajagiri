// package set1;
import java.lang.*;
class student implements Cloneable{
	int sid;
	String name;
	student(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	public Object clone(){
    try{
      return super.clone();
    }catch(CloneNotSupportException e){

    }
		
	}
}

public class test {
	public static void main(String []args){
		try {
			student s = new student(120,"dads");
			student s2 = (student)s.clone();
		}
		catch (CloneNotSupportException e) {
			
		}
		
	}
}
