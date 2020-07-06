package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class lambdaexer {
	
	class Product{  
	    int id;  
	    String name;  
	    float price;  
	    public Product(int id, String name, float price) {  
	        super();  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	
	/*public static void main(String[] args) {  
		List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));
          
	}*/
	

	//Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);


}