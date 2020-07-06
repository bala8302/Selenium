package PracticeTest;

public class Inherittwo extends Inherone {
	
	public void overtest()
	{
		System.out.println("TestSecond");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inherone aa = new Inherone();
		
		Inherittwo bb = new Inherittwo();
		
		Inherone cc = new Inherittwo();
		
		int c=cc.sal;
		
		
		aa.overtest();
		bb.overtest();
		
		cc.overtest();

	}

}
