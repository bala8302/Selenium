package javaExercise;

import java.util.Map;
import java.util.TreeMap;

public class fgg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*String mon = "$123";
		mon.replace('$', ' ');
		System.out.println(mon);
		
		mon.split("$");
		System.out.println(mon.split("\\$")[1]);
		System.out.println("ttee"+mon.split("\\$")[0]);
		
		String act = mon.split("\\$")[1].replaceAll("\\s+", "");
		String exp = "\\d{3}".replaceAll("\\s+", "");
		System.out.println(act);
		System.out.println(exp);
		
		
		//assertTrue();
		System.out.println(act.matches(exp));*/
		
		String actual = "transactionid:23343453,provider:AJB,cardType:GiftCard,receiptDisplay:APPROVED 45555";
		String expected = "transactionid:[0-9]+,provider:AJB,cardType:GiftCard,receiptDisplay:APPROVED [0-9]+";
		//System.out.println(data.matches(regex));
		
		Map<String,String> ms = new  TreeMap<String,String>();
		String arr[]= actual.split(",");
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			String af = arr[i];
			String[] aff = af.split(":");
			String key = aff[0];
			String val = aff[1];
			if(!ms.containsKey(key))
			{
				ms.put(key, val);
			}
			
		
			System.out.println(ms.entrySet());
			
		}
		Map<String,String> ms1 = new  TreeMap<String,String>();
		
		String arr1[]= expected.split(",");
		System.out.println(arr1.length);
		for(int i=0;i<arr1.length;i++)
		{
			String af = arr1[i];
			String[] aff = af.split(":");
			String key = aff[0];
			String val = aff[1];
			if(!ms1.containsKey(key))
			{
				ms1.put(key, val);
			}
			
		
			System.out.println(ms1.entrySet());
			
		}
		
		//System.out.println(ms.equals(ms1));
		
		boolean res = fgg.mapsAreEqual(ms, ms1);
		
		System.out.println(res);
		

	}
	
	public static boolean mapsAreEqual(Map<String, String> mapA, Map<String, String> mapB) {

	    try{
	        for (String k : mapB.keySet())
	        	
	        {
	        	if(k.equalsIgnoreCase("transactionid")|| k.equalsIgnoreCase("receiptDisplay"))
	        	{
	        		if(!mapA.get(k).matches(mapB.get(k)))
	        		{
	        			return false;
	        		}
	        	}
	        	
	        	else
	        	{
	        	if (!mapA.get(k).equals(mapB.get(k))) {
	                return false;
	            }
	        	}
	        } 
	        for (String y : mapA.keySet())
	        {
	            if (!mapB.containsKey(y)) {
	                return false;
	            }
	        } 
	    } catch (NullPointerException np) {
	        return false;
	    }
	    return true;
	}

}
