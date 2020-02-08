package assignment1;

public class question6 {
	public static void main(String[] args) {
//		6. Write Java statements that do the following:
//			a) Declare an array numArray of 15 elements of type int. 
//			b) Output the value of the tenth element of the array alpha. 
//			c) Set the value of the fifth element of the array alpha to 35. 
//		d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
//			e) Get the average of all the items in the array and display it.
//					

		int[] numArray = new int[15];
		
		numArray[0] = 1;
		numArray[1] = 2;
		numArray[2] = 3;
		numArray[3] = 4;
		numArray[4] = 5;
		numArray[5] = 6;
		numArray[6] = 7;
		numArray[7] = 8;
		numArray[8] = 9;
		numArray[10] = 11;
		numArray[11] = 12;
		numArray[12] = 13;
		numArray[13] = 14;
		numArray[14] = 35;
		numArray[9] = numArray[6]+numArray[13];
			

		System.out.println(numArray[10]);
		System.out.println(numArray[9]);

			int avg = 0;
	
		int total = 0;
		for (int element : numArray) {
			
			total += element;
			System.out.println(total);
		}
			if (numArray.length >0){
				avg = total/numArray.length; 
				System.out.println(avg);
			}
		}
		
		
		
		
	}

//}
