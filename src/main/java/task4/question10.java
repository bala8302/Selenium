package task4;

import java.util.*;
public class question10 { 
    public static void main(String[] args) { 
        
      /*10. Given a string, your code must find out the first repeated as well as non-repeated character in that string.
    For example, if “JavaConceptOfTheDay” is the given string,
    then ‘J’ is a first non-repeated character and ‘a’ is a first repeated character */
    
        String str = "JavaConceptOfTheDay";
        char[] chr = str.toCharArray();
        Map<Character, Integer> dup = new HashMap<Character, Integer>() ;
        for(Character ch : chr){
            if(dup.containsKey(ch))
                dup.put(ch,dup.get(ch)+1);
            else
                dup.put(ch,1);
        }
        for(Character ch : chr){
            if(dup.get(ch)>1) {
                System.out.println(ch + " is a first repeated character");
                break;
            }
        }
        for(Character ch : chr) {
            if (dup.get(ch) == 1) {
                System.out.println(ch + " is a first non-repeated character");
                break;
            }
        }
}

  
    }    