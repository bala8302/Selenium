package PracticeTest;

public class Exce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =989;
		
		int temp;
		
		temp=num;
		
		int r,sum=0;
		
		while(num>0)
		{
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		
		if (temp==sum)
		{
			System.out.println("equql");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
