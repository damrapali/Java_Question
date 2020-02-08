package assignment3;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		int num;
		Random r = new Random();
		
		for (num=1; num <=10; num++){
			System.out.println(r.nextInt(100));
		}
		

	}
	
}
