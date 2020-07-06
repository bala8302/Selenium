package PracticeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Countnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {2,3,4,5,4,4,3};
		
		int len = a.length;
		
		ArrayList<Integer> lis = new ArrayList<Integer>();
		
		ArrayList<Integer> lis1 = new ArrayList<Integer>();
		
		int cnt=1;
		
		Map<Integer,Integer> mp = new TreeMap<Integer,Integer>();
		
		for (int i:a)
		{
			
			if(mp.containsKey(i))
			{
				mp.put(i, ++cnt);
				//lis.add(i);
			}
			
			else
			{
				mp.put(i, cnt);
				
				//lis1.add(i);
			}
		}
		
		//System.out.println(mp.entrySet());
		
	/*	for (int i : mp.keySet()) {
			   System.out.println(i+":"+mp.get(i));
			}
		*/
		for(Map.Entry m:mp.entrySet())
		{
			System.out.println(m.getKey()+ "=" + m.getValue());
			
		}

	}

}
