package com.finals.c;

/*
 * 在七角星的14个节点上填入1~14 的数字，不重复，不遗漏。
 要求每条直线上的四个数字之和必须相等。
 图中已经给出了3个数字。
 请计算其它位置要填充的数字，答案唯一。
 填好后，请提交绿色节点的4个数字（从左到右，用空格分开）

 比如：12 5 4 8
 当然，这不是正确的答案
 */
public class 七星填数 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10, 12, 13 };
		f(arr, 0);
	}

	private static void f(int[] arr, int k) {
		if (arr.length - 1 == k) {
			getResult(arr);
			return;
		}

		for (int i = k; i < arr.length; i++) {
			// 试探
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
			f(arr, k + 1);
			// 回溯
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
	}

	private static void getResult(int[] arr) {
		int a = 6 + arr[0] + arr[1] + 11;
		int b = 11 + arr[2] + arr[3] + arr[4];
		int c = arr[4] + arr[5] + arr[6] + arr[7];
		int d = arr[7] + arr[8] + arr[0] + arr[9];
		int e = arr[9] + arr[1] + arr[2] + arr[10];
		int f = arr[10] + arr[5] + arr[3] + 14;
		int g = 14 + arr[6] + arr[8] + 6;

		if (a != b || a != c || a != d || a != e || a != f || a != g)
			return;
		if (b != c || b != d || b != e || b != f || b != g)
			return;
		if (c != d || c != e || c != f || c != g)
			return;

		if (d != e || d != f || d != g)
			return;
		if (e != f || e != g)
			return;
		if (f != g)
			return;
		System.out.println(arr[7] + " " + arr[8] + " " + arr[0] + " " + arr[9]);
	}
}
