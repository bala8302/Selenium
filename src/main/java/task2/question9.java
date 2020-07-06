package task2;

public class question9{

     public static void main(String []args){

//9. Write a Java Program to Convert Character to String and Vice-Versa 

        String input = "Character";
        String str = "" ;
        for(int i=0; i<input.length();i++){
            char ch = input.charAt(i);
            System.out.println("Character at "+i+" Position: "+ch);
            System.out.println();
            str= String.valueOf(ch);
            System.out.println("String is: "+str);
    }
     }
}