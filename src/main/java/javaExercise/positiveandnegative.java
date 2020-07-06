package javaExercise;

import java.util.ArrayList;
import java.util.List;

public class positiveandnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] intarray = new int[] {1,-3,4,56};
		
		int arr[] = {1,2};
		
		int[] a = {1,3};
		
		//int[] sk = {1,2,3};
		
		int len = intarray.length;
		
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> negative = new ArrayList<Integer>();
		
		int poscnt=0;
		int negcnt=0;
		
		for (int i=0;i<len;i++)
		{
		   if (intarray[i] >0)
		   {
			   li.add(intarray[i]);
			   poscnt++;

		   }
		   else
		   {
			   negative.add(intarray[i]);
			   negcnt++;
		   }
		}
		
		System.out.println("positive="+li);
		System.out.println(poscnt);
		System.out.println("nagative="+negative);
		System.out.println(negcnt);
		
		
	}

}
