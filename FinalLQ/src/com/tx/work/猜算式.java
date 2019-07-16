package com.tx.work;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
/*
 * □ □ x □ □ = □ □ x □ □ □
	它表示：两个两位数相乘等于一个两位数乘以一个三位数。
	如果没有限定条件，这样的例子很多。
	但目前的限定是：这9个方块，表示1~9的9个数字，不包含0。
	该算式中1至9的每个数字出现且只出现一次！
	比如：
	46 x 79 = 23 x 158
	54 x 69 = 27 x 138
	54 x 93 = 27 x 186
	.....
	请编程，输出所有可能的情况！
	注意：左边的两个乘数交换算同一方案，不要重复输出！
 */
public class 猜算式 {
	
	public static void main(String[] args) {
		int[] arr = new int []{1,2,3,4,5,6,7,8,9};
		dfs(arr , 0);
		Set<String> keySet = hm.keySet();
		for (String string : keySet) {
			
			System.out.println(hm.get(string) + " = "+string);
		}
	}
	
	static HashMap<String, String> hm = new HashMap<String, String>();
	
	private static void dfs(int[] arr, int k) {
		 if(arr.length == k){
			 int a = arr[0] * 10 + arr[1];
			 int b = arr[2] * 10 + arr[3];
			 int c = arr[4] * 10 + arr[5];
			 int d = arr[6] * 100 + arr[7] * 10 + arr[8];
			 if(a * b == c * d){
				 
				 hm.put(c + "*" + d, a + "*" + b);
			 }
			 return;
		 }
		 for (int i = k; i < arr.length; i++) {
			swap(arr , i ,k);
			dfs(arr, k + 1);
			swap(arr , i ,k);   
		}
	}

	private static void swap(int[] arr, int i, int k) {
		int temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
		
	}
}
