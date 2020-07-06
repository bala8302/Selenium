package javaExercise;

public class Statoverload {
	
	
	public static void test()
	{
		System.out.println("ts");
	}
	
	public static void test1(int i)
	{
		System.out.println("ts1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statoverload.test();
		Statoverload a = new Statoverload();
		
		//Statoverload.test1(10);
		
		a.test1(10);
	}

}
