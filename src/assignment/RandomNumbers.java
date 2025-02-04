package assignment;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		//Generating Random numbers
		Random rnd = new Random();
		
		int random1 = rnd.nextInt();
		int random2 = rnd.nextInt(50);
		int random3 = rnd.nextInt(1000, 2000);
		
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		
		System.out.println(randomNumbers(10, 50));

	}
	
	public static int randomNumbers () {
		Random rn = new Random();
		int rnd = rn.nextInt(1000, 9999);
		return rnd;
		
	}
	public static int randomNumbers (int a, int b) {
		Random rn = new Random();
		int rnd = rn.nextInt(a, b);
		return rnd;
		
	}

}
