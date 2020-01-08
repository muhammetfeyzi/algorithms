package com.mfs.hackerrank;

import java.util.Scanner;

/**
 * 
 * @author msaglam
 * 
 */
public class PlusMinus {

	static void plusMinus(int[] arr) {
		double positiveCount = 0;
		double negativeCount = 0;
		double zeroCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negativeCount += 1;
			} else if (arr[i] > 0) {
				positiveCount += 1;
			} else {
				zeroCount += 1;
			}
		}
		System.out.println((positiveCount / arr.length));
		System.out.println((negativeCount / arr.length));
		System.out.println((zeroCount / arr.length));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}

}
