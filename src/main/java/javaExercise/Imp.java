package javaExercise;

import java.util.HashSet;
import java.util.Iterator;

public class Imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1,2,4,6};
		
		HashSet <Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
			
		}
	Iterator itr = hs.iterator();
		
		
		while(hs.contains(1))
		{
			//
			
			//return 2;
		}
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	*/	
	}

}
