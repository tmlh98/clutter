package com.tx.work;

import java.util.Scanner;
/*
 * 思路:首先对全排列1-9进行 ,然后计算各部分的值
 */
public class 带分数最优解 {

	static int n = 0;
	static int count = 0;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 
		 int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		 dfs(arr , 0);
		 System.out.println(count);
		 sc.close();
	}

	private static void dfs(int[] arr, int k) {
		if(arr.length == k){
			for (int i = 1; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					int a = get(arr , 0 , i);//整数部分的值
					int b = get(arr , i , j);//分母部分的值
					int c = get(arr , j , 9);//分子部分的值
					if(b % c != 0)continue;
					if(n == a + b /c){
						count ++;
						System.out.println(a +" " + b + " "+c);
					} 
				}
			}
			return;
		}
		for (int i = k; i < arr.length; i++) {
			swap(arr , i ,k);
			dfs(arr, k +1);
			swap(arr , i ,k);
			
		}
		
	}

	private static int get(int[] arr, int i, int j) {
		int num = 0;
		for (int j2 = i; j2 < j; j2++) {
			num = arr[j2]+ num*10;
		}
		return num;
	}

	private static void swap(int[] arr, int i, int k) {
		int temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
	}

 
	
}
 