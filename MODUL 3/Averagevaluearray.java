package assignment;

import java.util.Scanner;

public class Averagevaluearray {
	 private static Scanner input;

	public static void main (String[] args) {  
	        input = new Scanner(System.in);
	        System.out.println("Enter the size of array:");
	        int n=input.nextInt();
	        double total=0;
	        double array[]=new double[n]; 
	        System.out.println("Enter the elements one by one:");
	        for (int s=0;s<array.length;s++){
	            array[s]=input.nextDouble();
	        }
	        for(int i=0;i<array.length;i++){
	            total=total+array[i];
	        }
	        double average=total/n;
	        System.out.println("The averag value is:"+average);
	        
	    }  

}
