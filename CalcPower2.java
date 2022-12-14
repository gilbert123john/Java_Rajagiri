
class SqrtAndCube
{
	public void cb(int val){
		int p = val*val;
		System.out.println("cube is "+p);
	}
	public void sq(int val){
		int p = val*val;
		cb(p);
		System.out.println("sqrt is "+p);
		
	}
	
}
class CalcPower2{
	public static void main(String args[]){
		SqrtAndCube calc= new SqrtAndCube();
		int a=10;
		calc.sq(a);
	}
}