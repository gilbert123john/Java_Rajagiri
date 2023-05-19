import java.io.*;
class employee{
	int eno;
	String ename;
	float esal;
	void read(int eno,String ename,float esal){
		this.eno=eno;
		this.ename=ename;
		this.esal=esal;
	}
	void disp(){
		System.out.println("Employee no:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esal);		
	}
}
class MainClass5_3{
    public static void main(String args[]){
		int n,i,en;
		try{
			DataInputStream br=new DataInputStream(System.in);
			System.out.println("Enter limit:");
		    n=Integer.parseInt(br.readLine());
			employee em[]=new employee[n];
		     for(i=0;i<n;i++){
			    employee e=new employee();
			    System.out.println("Enter details of employee "+(i+1));
				System.out.println("Enter eno:");
				int eno=Integer.parseInt(br.readLine());
				System.out.println("Enter name:");
				String ename=br.readLine();
				System.out.println("Enter salary:");
				float esal=Float.parseFloat(br.readLine());
				e.read(eno,ename,esal);
				em[i]=e;
				}
				for(i=0;i<n;i++){
					System.out.println("*****Employee "+(i+1)+"*****");
					em[i].disp();
				}
				System.out.println("Enter eno:");
				en=Integer.parseInt(br.readLine());	
				for(i=0;i<n;i++){
					if(em[i].eno==en){
						em[i].disp();
					}
				}
		}catch(Exception e){}
	}
}