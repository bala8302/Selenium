package day2;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,j=1,k;
		
		System.out.print(+ i);
		System.out.print(+ j);
		
		for (int ii=2;ii<10;ii++)
		{
			k=i+j;
			System.out.print(+ k);
			i=j;
			j=k;
			
		}
		
	}

}
