package task4;

import java.util.*;
public class question3{

     public static void main(String []args){

 /* 3. Write a java program to count the number of occurrences of each character in a given string.
    For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of each character in this
    string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5 */

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