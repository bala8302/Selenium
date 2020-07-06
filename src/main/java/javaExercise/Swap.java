package javaExercise;

public class Swap {
	
	public static void main(String args[])
	{
		
		String x = "test1";
		String y = "test2";
		
		//using temp
		/*String temp="";
		temp=x;
		x=y;
		y=temp;*/
		
		x=x+y;
		//System.out.println("X=="+x);
		y=x.substring(0,x.length()-y.length());
		//System.out.println("Y=="+y);
		x=x.substring(y.length());
		
		
		System.out.println("Xvalue "+x);
		System.out.println("Yvalue "+y);
	}

}
