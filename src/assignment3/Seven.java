package assignment3;

import java.util.Arrays;

public class Seven {
public static void main(String[] args) {
	int [] arr = {2,3,2,5,3,1};
	//System.out.println(Arrays.toString(arr));
	//System.out.println(arr.length);
	
	for(int i=0; i<arr.length;i++){
		for(int j=(arr.length-1); j>=0;i--){
			if(arr[i] == arr[j]) {
				System.out.println(arr[i]);
			}
		}
	}
	
}
}
