package assignment;

public class Greatestnumber {
	public static void main(String[] args) {

        int num1 = 21, num2 = 48, num3 = 27;

        if(num1 >= num2) {
            if(num1 >= num3)
                System.out.println(num1 + " is the greatest number.");
            else
                System.out.println(num3 + " is the greatest number.");
        } else {
            if(num2 >= num3)
                System.out.println(num2 + " is the greatest number.");
            else
                System.out.println(num3 + " is the greatest number.");
        }
    }

}
