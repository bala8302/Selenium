package Codility;
import java.util.ArrayList;
import java.util.HashSet;

public class CodilityMissingInteger {

	 public int solution(int[] A) 
	 {
	        int num = 1;
	        HashSet<Integer> hset = new HashSet<Integer>();
	        
	        //ArrayList<Integer> lis = new ArrayList<Integer>();

	        for (int i = 0 ; i < A.length; i++) {
	            hset.add(A[i]);   
	           

	            while (hset.contains(num)) {
	                num++;
	            }
	        }

	        return num;
	    }
	 
	 public static void main(String[] args)
	 {
		 CodilityMissingInteger c  = new CodilityMissingInteger();
		 
		 int [] A = {1,2,4,5,6};
		 c.solution(A);
		 
	 }

}
