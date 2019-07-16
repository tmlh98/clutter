package com.finals.c;

import java.util.HashSet;

public class 凑平方数 {
	
	static HashSet<String> hs = new HashSet<String>();
	
	public static void main(String[] args) {
		int[] A = {0,1,2,3,4,5,6,7,8,9};
		f(A , 0);
	}

	private static void f(int[] a, int k) {
		if(a.length == k){
			long[] B = new long[a.length];
			return;
		}
		
		for (int i = k; i < a.length; i++) {
			swap(a , i , k);
			f(a, k + 1);
			swap(a , i , k);
		}
		
	}

	private static void swap(int[] a, int i, int k) {
		int temp = a[i];
		a[i] = a[k];
		a[k] = temp;
	}
	
}
/*
	把0~9这10个数字，分成多个组，每个组恰好是一个平方数，这是能够办到的。
	比如：0, 36, 5948721
	
	再比如：
	1098524736
	1, 25, 6390784
	0, 4, 289, 15376
	等等...
	注意，0可以作为独立的数字，但不能作为多位数字的开始。
	分组时，必须用完所有的数字，不能重复，不能遗漏。
	如果不计较小组内数据的先后顺序，请问有多少种不同的分组方案？
	
	注意：需要提交的是一个整数，不要填写多余内容。
	
	答案：300
*/
