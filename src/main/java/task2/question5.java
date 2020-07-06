package task2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class question5 {

        public static void main(String []args){
//5. Write a Java Program to Calculate Difference Between Two Time Periods 

            Scanner s = new Scanner(System.in);
            String StartDate,EndDate;
            System.out.println("Enter the Start Date in the format of DD/MM/YYYY HH:MM:SS");
            StartDate=s.nextLine();
            System.out.println("Enter the End Date in the format of DD/MM/YYYY HH:MM:SS");
            EndDate=s.nextLine();
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date SDate=null;
            Date EDate=null;
            try{
                SDate=sdf.parse(StartDate);
                EDate=sdf.parse(EndDate);
                long diff=EDate.getTime()-SDate.getTime();
                long diffSeconds = diff/1000%60;
                long diffMinutes = diff/(60*1000)%60;
                long diffHours = diff/(60*60*1000)%24;
                long diffDays = diff/(24*60*60*1000);
                System.out.println("The Period of Time is: "+diffDays+" Days "+diffHours+" Hours "+diffMinutes+" Minutes "+diffSeconds+" Seconds ");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

