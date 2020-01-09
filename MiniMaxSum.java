package com.mfs.hackerrank;

import java.util.Scanner;

public class MiniMaxSum {

public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        
        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;
        for(int i=0; i<5; i++)
        {
            long curr = in.nextLong();  
            if(max < curr)
            {
                max = curr;
            }
            if(min > curr)
            {
                min = curr;
            }
            
            sum += curr;
        }
	long maxSum = sum - min;
        long minSum = sum - max;
        System.out.println(minSum + " " + maxSum);
    }

}
