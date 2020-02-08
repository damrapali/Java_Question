package assignment1;

import java.util.Scanner;

public class questionfour {
	public static void main(String[] args) {
	//4.Write a program with a method named get Total that accepts two integers as an 
		//argument and return its sum. Call this method from main( ) and print the results.
		
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the first number:");
		num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		num2 = sc.nextInt();
		
		sum = gettotal(num1, num2);
		System.out.println(sum);
	}

	public static int gettotal(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
}
