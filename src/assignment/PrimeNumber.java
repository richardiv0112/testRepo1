package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Use code to determine prime numbers
		//print a list of numbers 1-20
		System.out.println("Type one number and see if it's prime");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		
		
		for(int j = a; j >= 1; j--) {
			if(a%j == 0) {
				count = count + 1;
			}
			
		}
		if(count == 2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("not prime");
		}
		System.out.println("modified");

	}

}
