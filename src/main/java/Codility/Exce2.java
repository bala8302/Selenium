package Codility;

public class Exce2 {
	
	
	 
	 public static void main(String[] args) {
		 
		 Exce2 exc = new Exce2();
		 
		 int a[]={1,4,-1,3,2};
		 exc.solution(a);
		 
		 
		 
	 }
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        
	        int length=1;
	        int k,i=0;
	        for(int j=0; j<A.length; j++)
	        {
	            k=A[i];
	            if(k<0 || k>=A.length)
	                return length;
	            else
	                length++;
	            i=k;
	        }
           
	        System.out.println(length);
	        return length;
	        
	    }
}
