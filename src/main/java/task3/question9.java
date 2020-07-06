package task3;

public class question9 {  
    
        //9. Write a Java Program to find the longest repeating sequence in a string 

      public static String input(String s, String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }
    
    public static void main(String[] args) {  
    String str = "spsuchithrasp";
        String str1 = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String str3 = input(str.substring(i, n), str.substring(j, n));
                if (str3.length() > str1.length()) str1 = str3;
            }
        }
        System.out.println("Longest repeating sequence: " + str1);
  
    }  
}  