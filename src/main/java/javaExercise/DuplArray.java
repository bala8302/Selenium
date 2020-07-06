
package javaExercise;

import java.util.HashSet;
import java.util.Set;

public class DuplArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,3,3,2};
		
		Set<Integer> allset = new HashSet<Integer>();
		//System.out.println(a[1]);
		 
		/*for(int i=0; i<a.length; i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					
					System.out.println(a[i]);
			}
		}*/
		
		for(int s:a)
		{
			allset.add(s);
		}
		
		System.out.println(allset);

	}

}
