package task4;

import java.util.*;
public class question1 {  
    
        /*1. Write a java program to find duplicate characters and their count in a given string.
    For example, in a string “Better Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2*/

    
    public static void main(String[] args) {  
    String str = "Better Butter";
        char[] chr = str.toCharArray();
        Map<Character, Integer> dup = new HashMap<Character, Integer>() ;
            for(Character ch : chr){
                if(dup.containsKey(ch))
                    dup.put(ch,dup.get(ch)+1);
                else
                    dup.put(ch,1);
            }
            Set<Character> keys = dup.keySet();
            for(Character ch : keys){
                if(dup.get(ch)>1)
                    System.out.println(ch +" is repeated " + dup.get(ch) + " times");
            }
  
    }  
}  