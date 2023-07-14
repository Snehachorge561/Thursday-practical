package Question2;

import java.util.Scanner;

public class Switchcase{
	public static void main(String[] args) {
		char operator;
		double value1, value2, answer;
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);  

		System.out.println("Enter a value ");
		value1 = scanner.nextInt();
		value1 = scanner.nextInt(); 

		System.out.println("Enter a Operator");
		operator = scanner.next().charAt(0);
		System.out.println("Enter another value ");
		value2 = scanner.nextDouble();
		switch (operator) {
		
		case '+':
			answer = value1 + value2;
			System.out.println(value1 + "+" + value2 + "= " + answer); // For addition of values
			break;
		
		case '-':
			answer = value1 - value2;
			System.out.println(value1 + "-" + value2 + "=" + answer); // For substraction of values
			break;
		
		case '*':
			answer = value1 * value2;
			System.out.println(value1 + "*" + value2 + " = " + answer); // For addition of values
			break;
		
		case '/':
			answer = value1 / value2;
			System.out.println(value1 + "/" + value2 + "= " + answer); // For addition of values
		
		default:
			System.out.println("No operator selected"); //default case
			break;
		}
	}
}
	

