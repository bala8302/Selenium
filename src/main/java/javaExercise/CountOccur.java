package javaExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="amazonindiazzz";
		
		int cnt=1;
		s=s.toLowerCase();
		int len = s.length();
		
		
		Map<Character,Integer> coc = new TreeMap<Character,Integer>();
		//List<Character> occurrences = new ArrayList();
        int maxOccurring = 0;
		
		for (int i=0;i<len;i++)
		{
			char s1 = s.charAt(i);
			
			if (coc.containsKey(s1))
			{
				coc.put(s1, coc.get(s1)+1);
				//cnt++;
			}
			else
			{
				coc.put(s1, 1);
			}
			
			//if (coc.get(s1) > maxOccurring) {
	          //  maxOccurring = coc.get(s1);         // saves max occurring
	        //}
			}
			
		System.out.println(coc.entrySet());
		
		coc.clear();
		
		//System.out.println(maxOccurring);
		
		
	}

}
