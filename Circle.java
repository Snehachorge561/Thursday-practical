package Question1;

import java.util.Scanner;

public class Circle {
	
public static void main(String[] args) {
	 double radius, area, circumference;
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Enter Radius of Circle:");
	 radius = scanner.nextDouble();
	 
	
	 
	 area = (22* radius * radius)/7;     // formula to calculate area of circle 
	 circumference = (2 * 22 * radius)/7; //formula to calculate circumference of circle
	 
	 System.out.println("Area of Circle : " + area);  //to display area 
	 System.out.println("Circumference of Circle : " + circumference); // to display circumference
	    }
	 
	}
	
	
	

