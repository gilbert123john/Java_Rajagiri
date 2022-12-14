//Find factorial of a number using recursive function;
class CalcFact
{
	public int fact(int val){
		if(val>0){
            return(val*fact(val-1));
        }
        else
            return 1;
	}
	
	
}
class FactorialOfNumber{
	public static void main(String args[]){
		CalcFact f=new CalcFact();
		int a=3,b;
		b=f.fact(a);
        System.out.println("Fact is "+b);
	}
}