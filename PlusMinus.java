package com.mfs.hackerrank;

import java.util.Scanner;

/**
 * 
 * @author msaglam
 * 
 */
public class PlusMinus {

	static void plusMinus(int[] arr) {
		int positiveCount  = 0;
		int negativeCount = 0;
		int zeroCount = 0 ;
		int sayi = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <0) {
				negativeCount += 1;
			}else if (arr[i]>0) {
				positiveCount +=1;
			}else {
				zeroCount += 1;
			}
		}
		System.out.println((float)(positiveCount/sayi));
		System.out.println((float)(negativeCount/sayi));
		System.out.println((float)(zeroCount/sayi));
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
