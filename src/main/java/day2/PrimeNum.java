package day2;

public class PrimeNum {

	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		 int num =11;
		 int flag=0;
		 
		 for (int i=2;i<num;i++)
		 {
			if (num%i==0)
			{
				System.out.print("Given number" + num + "is not a prime number");
				flag =1;
			break;
			}
		 }
			if (flag==0)
			{
				System.out.print("Given number" + num + "is  a prime number");
			}
		 
	}
}

