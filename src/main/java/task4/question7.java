package task4;

public class question7    
{    
    public static void main(String[] args) { 
        
        /*7. Write a java program to check whether one string is a rotation of another.
    For example, If “JavaJ2eeStrutsHibernate” is a string then some rotated versions of this
    string are “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava“, “HibernateJavaJ2eeStruts“*/
    
        String str1 = "JavaJ2eeStrutsHibernate", str2 = "J2eeStrutsHibernateJava";    
            
        if(str1.length() != str2.length()){    
            System.out.println("Second string is not a rotation of first string");    
        }    
        else {    
            str1 = str1.concat(str1);    
            if(str1.indexOf(str2) != -1)    
                System.out.println("Second string is a rotation of first string");    
            else    
                System.out.println("Second string is not a rotation of first string");    
        }    
    }    
} 