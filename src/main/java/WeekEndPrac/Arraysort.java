package WeekEndPrac;

import java.util.Arrays;
import java.util.Collections;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]= new int[]{2,4,3,5};
		
		
		Integer[] a = {3,6,2,1,5};
		

		int b[] = {3,6,2,1,5};
		
		Arrays.sort(a,Collections.reverseOrder());
		
		Arrays.sort(b,1,4);

		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(b));
		

	}

}
