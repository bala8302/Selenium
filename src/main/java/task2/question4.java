package task2;

import java.util.*;
public class question4{

     public static void main(String []args){

// 4. Write a Java Program to Find the Frequency of Character in a String 

        String str = "Java J2EE Java JSP J2EE";
        char[] chr = str.toCharArray();
        Map<Character, Integer> dup = new HashMap<Character, Integer>() ;
        for(Character ch : chr){
            if(dup.containsKey(ch)){
                dup.put(ch,dup.get(ch)+1);
            }
            else
                dup.put(ch,1);
        }
        Set<Character> keys = dup.keySet();
        for(Character ch : keys){
            if(dup.get(ch)>1) {
                    System.out.println(ch + " is " + dup.get(ch) + " times repeated");
            }
              else
                System.out.println(ch + " is " + dup.get(ch) + " time repeated");
        }     System.out.println("String is: "+str);
    }

}