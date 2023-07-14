package Question3;

import java.util.Scanner;

public class Eligibility {
	
	public static void main(String[] args) {
		int age;
		
		Scanner scanner =new Scanner(System.in); //for taking input from users using scanner class
		
		System.out.println("Enter your Age:");  
		age=scanner.nextInt(); 
		
		if (age >= 18) {  // if age is greater than eqauls to 18
			System.out.println("You are eligible for voting");
		} else {
			 System.out.println("You are not eligible for voting");
		}
		
	}
}
