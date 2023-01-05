package assignment;

import java.util.Scanner;

public class Pattern3 {
	 
	    public static void main(String ar[])  
	    {  
	        Scanner s = new Scanner(System.in);  
	   
	        /* accept number of rows for the pyramid */  
	   
	        System.out.println("Enter number of rows for the Pyramid:");  
	   
	        int nrows = s.nextInt();  
	   
	        /* Initialize the rowCount */  
	   
	        int rowCount = 1;  
	   
	        System.out.println("Pyramid Pattern: ");  
	   
	        /* Code for displaying the pyramid */  
	   
	        for (int i = nrows; i > 0; i--)  
	        {  
	            /* Print i empty spaces at the beginning of each row */  
	   
	            for (int j = 1; j <= i; j++)  
	            {  
	                System.out.print(" ");  
	            }  
	   
	            /* Print 'rowCount' value 'rowCount' times at the end of each row */  
	   
	            for (int j = 1; j <= rowCount; j++)  
	            {  
	                System.out.print(rowCount+" ");  
	            }  
	   
	            System.out.println();  
	   
	            /* Increment the rowCount */  
	   
	            rowCount++;  
	        }  
	    }  


}
