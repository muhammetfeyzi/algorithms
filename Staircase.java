package com.mfs.hackerrank;

import java.util.Scanner;

public class Staircase {

	static void staircase(int n) {
		for (int j = 0; j < n; j++) {
			for (int i = 1; i <= n; i++) {
				System.out.print(i < n - j ? " " : "#");
			}
			System.out.println("");
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}

}
