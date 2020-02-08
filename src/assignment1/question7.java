package assignment1;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		// Write a program that creates an array of 10 elements size. 
		//Your program should prompt the user to input numbers in array and 
		//then display the sum of all array elements.
		
//		int[] array = new int [10];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		array[0] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[1] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[2] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[3] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[4] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[5] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[6] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[7] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[8] = sc.nextInt();
//		System.out.println("Enter a number: ");
//		array[9] = sc.nextInt();
//		System.out.println(array[1]);
//		
//		int sum=0;
//		for(int elements : array){
//			sum += elements;
//		System.out.println("Sum of all array elements is:" + sum);	
//			
//		}
//		
		
		int size = 10;
		int[] elements = new int[size];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter" + size + "numbers");
			
			for (int i = 0;  i <= size; i++)		{
		elements[i] = sc.nextInt();
			} 
		
	}

}
