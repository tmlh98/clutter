package com.jisuanke.nanti;

import java.util.Scanner;

public class 三值排序 {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		cal(arr);
		
		System.out.println(count);
		sc.close();
	}

	private static void cal(int[] arr) {
		int sum = 0;
		for ( ;  ; ) {
			for (int i = 0; i < arr.length -1; i++) {
				if(arr[i] > arr[i + 1]){//如果后一位小于当前，则于前面元素交换
					run(arr,i +1);
					count++;
					sum++;
				}
			}
			if(sum == 0)return;
			sum = 0;
		}
		
	}

	private static void run(int[] arr, int index) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[index] ){
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				break;
			}
		}
	}
}
/*
 * 排序是一种很频繁的计算任务。一个实际的例子是，当我们给某项竞赛的优胜者按金银铜牌排序的时候。
 * 在这个任务中可能的值只有三种1，2和3。我们用交换的方法把他排成升序的 。
 * 写一个程序计算出，计算出的一个包括1、2、3三种值的数字序列，排成升序所需的最少交换次数。
 *  输入第1行为类别的数量N（1≤N≤1000）
 * 输入第2行到第N+1行，每行包括一个数字（1或2或3）。 输出包含一行，为排成升序所需的最少交换次数。
 */