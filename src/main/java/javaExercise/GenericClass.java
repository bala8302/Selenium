package javaExercise;

public class GenericClass<T> {
	
	T tobj;
	
	public void add(T tobj)
	{
     
		this.tobj = tobj;
	}
  
	 public T put()
	 {
		 return tobj;
	 }

	public static void main(String args[])
	{
		GenericClass<Integer>  m = new GenericClass<Integer>();
		m.add(2);
		
		GenericClass<String>  m1 = new GenericClass<String>();
		m1.add("test");
		
		System.out.println(m.put());
		
		System.out.println(m1.put());
	}
	 
}
