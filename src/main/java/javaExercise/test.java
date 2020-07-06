package javaExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String tes = "balab";
		
		char s;
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		
		int len = tes.length();
		
		int val=1;
		
		for (int i=0;i<=len-1;i++)
		{
			s= tes.charAt(i);
			
			if(map.containsKey(s))
			{
				map.put(s, val+1);
			}
			
			else
			{
				map.put(s, val);
			}
		}
		
		System.out.println(map.entrySet());
	}

}
