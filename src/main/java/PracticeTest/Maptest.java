package PracticeTest;

import java.util.HashMap;
import java.util.Map;

public class Maptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "dghfd";
		String revstr = "";
		
		int len = s.length();

		Map<Character,Integer> m = new HashMap<Character,Integer>();
		int cnt=1;
		for(int j=0;j<len;j++)
		{
			char ss = s.charAt(j);
			
			if (m.containsKey(ss))
			{
				m.put(ss, ++cnt);
			}
			
			else
			{
				m.put(ss, 1);
			}
		}
		
		System.out.println(m.entrySet());
		
		for(Map.Entry mm:m.entrySet())
		{
			System.out.println(mm.getKey()+ "=" +mm.getValue());
		}
		
		for(int i=len-1;i>0;--i)
		{
		 char t = s.charAt(i);
		 
		 revstr+=t;
			
		}
		
		if(s.equals(revstr))
		{
			System.out.println("equal");
		}
		
		else
		{
			System.out.println("not equal");
		}
		}
	}


