package com.java;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Prime number");
		} else
			System.out.println("Not a prime number");
	}

}
