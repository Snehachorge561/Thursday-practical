package Question4;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)   
	{  
	int n,i, fact=1 ;  
	  
	Scanner scanner = new Scanner(System.in);  //taking input from the user
	System.out.println("Enter a number:");  
	n = scanner.nextInt(); 
	
	if(n<0) {   // negetive numbers are not acceptable in factorial
		System.out.println("Factorial of negetive numbers does not exist");
	}else {
		for(i=1;i<=n;i++) {   // logic for fulfilling the condition which user had given
			fact=fact*i; 
		}
		System.out.println("factorial of this number is:"+fact); // for printing the value
	}
	
	}
	
}
