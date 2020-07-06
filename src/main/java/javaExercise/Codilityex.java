package javaExercise;

public class Codilityex {

	
	public  Codilityex(int[] A) 
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);	
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,3,5};
		Codilityex  ex = new Codilityex(a);
	}
}
