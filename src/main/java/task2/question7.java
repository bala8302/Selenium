package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class question7{

     public static void main(String []args) throws Exception{

//7. Write a Java Program to Convert String to Date

        String date="15/04/2020";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println(date+"\t"+date1);
    }
}