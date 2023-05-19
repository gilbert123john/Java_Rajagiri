import java.io.*;
class stack{
	int top,st[],size;
	stack(int n){
		st=new int[n];
		size=n;
		top=-1;
	}
	void push(int e){
		if(top==size-1)
			System.out.println("STACK OVERFLOW!!!!!");
		else{
			top++;
			st[top]=e;
		}
	}
	void pop(){
		if(top==-1)
			System.out.println("STACK UNDERFLOW!!!!!");
		else{
			System.out.println(" deleted element:"+st[top]);
			top--;
		}
	}
	void disp(){
		int i;
		System.out.println("\n stack elements are:");
		for(i=top; i>=0; i--)
            System.out.println(st[i]);
	}
}
class MainClass4_4{
	public static void main(String args[]){
		try{
			int e,n,ch;
			DataInputStream br=new DataInputStream(System.in);
			System.out.println("Enter the Size of Stack : ");
			n=Integer.parseInt(br.readLine());
			stack s=new stack(n);
			do{
			System.out.println("MENU");
			System.out.println("======");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.DISPLAY");
			System.out.println("4.EXIT");
			System.out.println("Enter your choice:");
			ch=Integer.parseInt(br.readLine());
			switch(ch){
				case 1:System.out.println("Enter element:");
					   e=Integer.parseInt(br.readLine());
					   s.push(e);
					   break;
				case 2:s.pop();
					   break;
				case 3:s.disp();
					   break;	
			}
		}while(ch<=3);
		}catch(Exception e){}
	}
}