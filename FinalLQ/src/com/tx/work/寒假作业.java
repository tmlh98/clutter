package com.tx.work;

public class 寒假作业 {

	public static void main(String[] args) {
			
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		f(arr , 0);
		System.out.println(count);
	}
	
	static int count = 0 ;
	private static void f(int[] arr, int k) {
		if(arr.length -1 == k){
			if(arr[0] + arr[1] != arr[2])return;
			if(arr[3] - arr[4] != arr[5])return;
			if(arr[6] * arr[7] != arr[8])return;
			if(arr[11] + arr[10] != arr[9])return;
			count ++;
		}
		
		for (int i = k; i < arr.length; i++) {
			swap(arr , i , k);
			f(arr, k +1);
			swap(arr , i , k);
		}
	}

	private static void swap(int[] arr, int i, int k) {
		int temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
		
	}
}
/*
	现在小学的数学题目也不是那么好玩的。
	看看这个寒假作业：
	
s	   □ + □ = □
	   □ - □ = □
	   □ × □ = □
	   □ ÷ □ = □
	   
	每个方块代表1~13中的某一个数字，但不能重复。
	比如：
	 6  + 7 = 13
	 9  - 8 = 1
	 3  * 4 = 12
	 10 / 2 = 5
	
	以及： 
	 7  + 6 = 13
	 9  - 8 = 1
	 3  * 4 = 12
	 10 / 2 = 5
	
	就算两种解法。（加法，乘法交换律后算不同的方案）
	你一共找到了多少种方案？
	请填写表示方案数目的整数。
*/