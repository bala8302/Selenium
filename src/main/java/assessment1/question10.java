//Write a Java program to reverse a string
package assessment1;

public class question10 {
    public static void main(String[] args){
        String str = " The quick brown fox ";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("reverse string is:"+sb.toString());
    }
}
