package assignment;

import java.util.Scanner;

public class DisplayGrades {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in) ;
	      System.out.println("enter the marks out of 100");
		int a = in.nextInt();
		if(a>=91 && a<=100) {
			System.out.println("Grade : AA");
		}else if (a>=81 && a<=90) {
			System.out.println("Grade : AB");
		}else if (a>=71 && a<=80) {
			System.out.println("Grade : BB");
		}else if (a>=61 && a<=70) {
			System.out.println("Grade : BC");
        }else if(a>=51 && a<=60) {
			System.out.println("Grade : CD");
        }else if (a>=41 && a<=50) {
			System.out.println("Grade : DD");
        }else {
        	System.out.println("Fail");
        }
	}
}
	  
	       
	
	
	
