package assignment3;

public class CommonElementArray {

	public static void main(String[] args) {
		int[] arr1 = {2,4,7,8,9,12};
		int[] arr2 = {4,8,7,10,21,1};
		
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
