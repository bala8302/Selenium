package SpAssessment;

import java.math.*;
import java.util.*;
import java.lang.*; 

public class question9{
    
       public static void main(String[] args) {
        double lat1 = 25;
        System.out.println("Value of lat1: " + lat1);
        double lon1 = 35;
        System.out.println("Value of lon1: " + lon1);
        double lat2 = 35.5;
        System.out.println("Value of lat2: " + lat2);
        double lon2 = 25.5;
        System.out.println("Value of lon2: " + lon2);
         lat1 = Math.toRadians(lat1);
        System.out.println("Value of lat1 to radians: " + lat1);
        lon1 = Math.toRadians(lon1);
        System.out.println("Value of lon1 to radians: " + lon1);
        lat2 = Math.toRadians(lat2);
        System.out.println("Value of lat2 to radians: " + lat2);
        lon2 = Math.toRadians(lon2);
        System.out.println("Value of lon2 to radians: " + lon2);

        double earthRadius = 6371.01; //Kilometers
        double Result = earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
        // Expected distance between those points is: 1480.0848451069087 km  
        System.out.println("The distance between two points is: " + Result + " km");
    }
}