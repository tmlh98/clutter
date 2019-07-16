package com.jisuanke.nanti;

import java.util.Scanner;

public class 最大子阵列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getMaxValue(arr));
		sc.close();
	}

	private static int getMaxValue(int[] arr) {
		 int max = arr[0],count = 0;
		 for (int i = 0; i < arr.length; i++) {
			count += arr[i];
			if(max < count )max = count ;
			if(count <0) count =0;
		}
		
		
		return max;
	}
}
/*
	在一个数组中找出和最大的连续几个数。（至少包含一个数）
	例如：
	数组A[] = [−2, 1, −3, 4, −1, 2, 1, −5, 4]，
	则连续的子序列[4,−1,2,1]有最大的和6.
	输入格式
	第一行输入一个不超过1000的整数n。
	第二行输入n个整数A[i]。
	输出格式
	第一行输出一个整数，表示最大的和。
*/