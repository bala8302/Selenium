package java8;

interface tst
{
	public void test();
	
}

public class testLambda  {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tst t =()->
		{
			System.out.println("test");
		};
		t.test();
	}

}
