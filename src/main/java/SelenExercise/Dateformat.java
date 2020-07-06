package SelenExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date curdate = new Date();
		
		String text = sdf.format(curdate);
		
		System.out.println("Date"+text);
		
		//String time = now;

	}

}
