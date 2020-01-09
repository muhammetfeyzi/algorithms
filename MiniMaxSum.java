package com.mfs.hackerrank;

import java.util.Scanner;

public class MiniMaxSum {
	
	static void miniMaxSum(int[] arr) {
        int sumMin = 0;
        int sumMax = 0;
        /*sorting*/
        for (int i = 0; i< arr.length; i++) {
            for(int k =0 ; k<=i ; k++){
                if(arr[k]> arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }   
        }
        /*mimValue*/
        for (int i = 0; i< arr.length-1; i++) {
         sumMin += arr[i];   
        }
        /*max value*/
        for (int j = 1; j <arr.length; j++) {
         sumMax += arr[j]; 
        }
        System.out.println(sumMin+ " " +sumMax);
       
    }
	 private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();

	}

}
