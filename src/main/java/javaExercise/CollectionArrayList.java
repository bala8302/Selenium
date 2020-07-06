package javaExercise;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> li = new ArrayList<String>();
		
		li.add("a");
		li.add("b");
		li.add("c");
		
		

	Iterator<String> itr = li.iterator();
	
	
	while(itr.hasNext())
	{
		System.out.println("While="+itr.next());
	}
				
		for (String lob : li) {
			
			if(lob == "c")
			{
				li.remove(lob);
			}
			
			System.out.println(lob);
		}

	}

}
