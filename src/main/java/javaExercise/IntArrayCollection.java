package javaExercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IntArrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numbers = {1, 1, 2, 1, 3, 4, 5};
		Set<Integer> uniqKeys = new HashSet<Integer>();
		//uniqKeys.addAll(Arrays.asList(numbers));
		
		//System.out.println("uniqKeys: " + uniqKeys);
	for(int a:numbers)
	{
		uniqKeys.add(a);
	}
	System.out.println(uniqKeys);
	}

}
