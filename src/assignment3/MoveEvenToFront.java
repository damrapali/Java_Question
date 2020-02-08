package assignment3;

import java.util.Arrays;

public class MoveEvenToFront {
	
	public static int[] arrange(int [] arr) {
	int left = 0;
	int right = arr.length -1;
	
	while(left<right) {
		if (arr[left] % 2 == 0)
			left++;
		else if (arr[right] % 2 != 0)
			right--;
		else{
			//swap left and right element
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

	
	}
	
	return arr;
	
	}
	public static void main (String[] args) {
		int [] arr = {1,3,6,8,2,4,6,7,3,12};
		System.out.println("Printing the even number first:");
		arr = arrange(arr);
		System.out.print(Arrays.toString (arr));
	}	
} 

