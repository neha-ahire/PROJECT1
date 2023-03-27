package copaAssingnments;
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
import java.util.*;

public class PositiveNum 
{
 public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	 int num = sc.nextInt();
	  
	 if(num%2!=0)
	 {
		 System.out.println("The Number is prime");
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("the multipliacation is "+ num*i);
			
		}
		
	 }
	 else if(num==2)
		 for(int i=1;i<=10;i++)
			{
				System.out.println("the multipliacation is "+ num*i);
				
			}
		 
	 else 
		 System.out.println("You enter something wrong");
 }
}
