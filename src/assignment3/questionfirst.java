package assignment3;

import java.util.Scanner;

public class questionfirst {
	public static void main(String[] args) {
			
//		array = {1,4,5,6}
//		reverse array= {6,5,4,1}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the size of an array:");
//		int size = sc.nextInt();
//		int arr[] = new int[size];
//		
//		System.out.println("Enter the array: ");
//		
//		for(int i=0; i<=size; i++) {
//			arr[i] =sc.nextInt();
//		}
		
		int[] arr = {2,4,5,6};
		
		System.out.println("Printing the reverse value:");
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}		
	}

	
}
