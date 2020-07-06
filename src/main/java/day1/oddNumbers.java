package day1;

public class oddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag;
		for (int i=1;i<=20;i++)
		{
			flag=true;
			while (i%2==0)
			{
				flag=false;
				break;
			
			}
			if(flag)
			{
				System.out.println("odd numbers:"+i);
			}
		}
		
	}

}
