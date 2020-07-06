package javaExercise;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.*;

import com.graphbuilder.struc.LinkedList;

public class HashTabMapIterListVect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashTabMapIterListVect  v = new HashTabMapIterListVect();
		v.listwithforeac();
		v.listwithitera();
		v.Testmap();
		v.hastable();
		
	}
	
	public void listwithforeac()
	{
		ArrayList<String> lis = new ArrayList<String>();
		lis.add("t1");
		lis.add("t2");
		lis.add("t3");
		
		for(String li:lis)
		{
			System.out.println(li);
		}
		
	}
	
	public void listwithitera()
	{
		 
		java.util.LinkedList<String> ll = new java.util.LinkedList<String>();
	
		ArrayList<String> lis = new ArrayList<String>();
		lis.add("t1");
		lis.add("t2");
		lis.add("t3");
		
		Iterator itr = lis.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	public void Testmap()
	{
		Map<Character,Integer> ms = new   TreeMap<Character,Integer>();
		
		String trg ="teddd";
		char s;
		for (int i =0; i<(trg.length()-1); i++)
		{
		 s = trg.charAt(i);
		if(ms.containsKey(s))
		{
			ms.put(s,2);
		}
		
		else
		{
			ms.put(s, 1);
		}
		}
		System.out.println(ms.entrySet());
		
		for(Map.Entry m: ms.entrySet())
		{
			System.out.println(m.getKey()+"+" + m.getValue() );
		}
	}
	

	public void hastable()
	{
		Hashtable<Integer,String> hs = new Hashtable<Integer,String>();
		
		hs.put(1,"test");
		hs.put(2, "test1");
		hs.put(3, "test3");
		
		for(Map.Entry m:hs.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());  
		}
		}
	
	public void vect()
	{
		Vector<String> v = new Vector<String>();
		v.add("umms");
		v.addElement("fg");
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
		
	
}

