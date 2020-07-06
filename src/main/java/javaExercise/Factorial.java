package javaExercise;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact =5;
		int n1=0;
		int n2=fact;
		
		for(int i=fact-1;i>0;--i)
		{
			fact=fact*i;
			System.out.println(fact);
		}

		System.out.println("Fact"+fact);
	}

}
