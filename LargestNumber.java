package Question3;
import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args)   
	{  
	int a, b, c, largest, comp;  
	  
	Scanner sc = new Scanner(System.in);  //taking input from the user
	
	System.out.println("Enter the first number:");  
	a = sc.nextInt();  
	
	System.out.println("Enter the second number:");  
	b = sc.nextInt();  
	
	System.out.println("Enter the third number:");  
	c = sc.nextInt();  
	  
	comp=a>b?a:b; //comparing a and b and storing temprory value in comp  
	  
	largest=c>comp?c:comp;// again comparing temporary value stored in comp with c.  
	
	System.out.println("The largest number is: "+largest);  
	}  
	}  

