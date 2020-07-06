package javaExercise;

public class ConstructorEx {
	
	public int balance;
	
	ConstructorEx(int a)
	{
		balance=a;
		System.out.println(""+balance);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx obj = new ConstructorEx(100);

	}

}
