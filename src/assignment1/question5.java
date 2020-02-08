package assignment1;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
//		
	//		5 Write a method named isEven that accepts an int argument. 
	//		The method should return true if the argument is even, or false otherwise. 
	//				Also write a program to test your method.
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		num = sc.nextInt();
		
		if (isEven(num)) {
			//The number is even.
			System.out.println("The entered number is even.");
		} else{
			//The number is odd.
			System.out.println("The entered number is odd.");
		}
	}

	public static boolean isEven (int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}	
}


