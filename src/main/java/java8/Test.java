package java8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MathOperation mobj  = (int a,int b)-> a + b;

	}
	
	interface MathOperation {
	      int operation(int a, int b);
	   }
	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
}
