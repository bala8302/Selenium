package Codility;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 1,2,3,8,7,6,7};
		
		int b[] = Arrays.copyOf(a, a.length);
		
		Arrays.sort(b);
		
		
		for (int i=0;i<b.length;i++)
		{
				
			if(a[i]== b[i+1])
			{
			System.out.println(a[i]);	
			}
		}

	}

}
