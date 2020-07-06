package javaExercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExpe {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		Date d1 = sdf.parse("2017-01-25");
		
		Date d2 = sdf.parse("2017-05-20");

	  System.out.println(d1);
		
		if (d1.after(d2))
		{
			System.out.println("d1greater");
		}
		if(d1.before(d2))
		{
			System.out.println("d2greater");
		}
	    
		

	}

}
