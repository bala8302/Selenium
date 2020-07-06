package InterviewPreparation;

public class Stringarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	  
		int s = Stringarr.getSumOfIntegersInString("1 2 3");
		
		System.out.println(s);
		
		
		
	  
	 //System.out.println(s2);
	 
	}
	
	public static int getSumOfIntegersInString(String string) {
	    /*Split the String*/
	    String[] stringArray = string.split(" ");
	    int sum=0;
	    int temp=0;
	    for(int i=0;i<stringArray.length;i++){
	        try{
	            /*Convert the numbers in string to int*/
	            temp = Integer.parseInt(stringArray[i]);
	            sum += temp;
	        }catch(Exception e){
	            /*ignore*/
	        }
	    }
	    return sum;
	}
	   

}
