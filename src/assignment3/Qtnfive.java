package assignment3;

public class Qtnfive {
	public static void main(String[] args) {
		//6) Given an array of integers move all even numbers to the beginning of the array.
		
		int[] Arr = {1,5,2,4,3,8,10};
		
		int temp = 0;
		
		for(int i=1; i<= Arr.length; i++){
			if (Arr[i-1] % 2 == 0) {
				temp = Arr[i-1];
				Arr[i-1] = Arr[i];
				Arr[i]= temp;
				System.out.println(Arr[i]);
			}
			
			} 
		
	}
}
