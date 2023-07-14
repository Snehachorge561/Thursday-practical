package Question3;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args)   
	{  
	int num;  
	  
	Scanner scanner = new Scanner(System.in);  //taking input from the user
	System.out.println("Enter any number:");  
	
	num = scanner.nextInt(); 
	if(num%2==0) { // logic for checking whether the number is even or odd
		System.out.println("The number is Even");
	}else {
		System.out.println("The number is Odd");
	}
}
}
