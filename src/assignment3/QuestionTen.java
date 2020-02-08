package assignment3;

public class QuestionTen {
	public static void main(String[] args) {
		int [] arr = {2,3,4,6,5,4,3,4,6,4};
		int first = 0;
		int last = arr.length-1;
		
		int temp= 0;
		while(first<last){
			if(((arr[first] + arr[last]) % 2) == 0)
				first++;
		}
		
	}
	
	
	

}
