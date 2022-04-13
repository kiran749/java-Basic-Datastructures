package question1;

import java.util.Scanner;
public class Assignment1Q1 {

	public static void main(String[] args) 
	{
		ArmstrongOrNot armstrong=new ArmstrongOrNot();
		int num;   
		Scanner scanner= new Scanner(System.in);  
		System.out.println("Enter a number to check whether armstrong or not: ");    
		num=scanner.nextInt();  
		scanner.close();
		
		if(armstrong.armstrongCheck(num))  
		{  
		System.out.println("It is an Armstrong");  
		}  
		else   
		{  
		System.out.println("This is not an Armstrong");  
		}  
		}   
		 
	}