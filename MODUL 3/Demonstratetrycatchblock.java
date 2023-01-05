package assignment;

public class Demonstratetrycatchblock {
	 public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/3; //may throw exception   
	                         // if exception occurs, the remaining statement will not exceute  
	        System.out.println("rest of the code");  
	        }  
	             // handling the exception   
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	          
	    }  

}
