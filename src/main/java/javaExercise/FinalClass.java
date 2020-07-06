package javaExercise;

public class FinalClass {
	
	
	final int i=0;
	
   final void test()
  {
	  int j;
	  
	  j=i;
	  
	  System.out.println(j);
  }
	
   final int test1()
   {
	 int k= 2;
	  
	 k=k+i;
	  return k;
	  
   }
   
	
  public static void main(String args[])
  {
	FinalClass f=  new FinalClass();
	
	f.test();
	
	int l = f.test1();
	
	System.out.println(l);
	

  }
}
