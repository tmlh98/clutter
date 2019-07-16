package cn.java.ss;

import java.util.Scanner;

/*
 *  幸运数是波兰数学家乌拉姆命名的。它采用与生成素数类似的“筛法”生成。
 首先从1开始写出自然数1,2,3,4,5,6,....
 1 就是第一个幸运数。
 我们从2这个数开始。把所有序号能被2整除的项删除，变为：
 1 _ 3 _ 5 _ 7 _ 9 ....
 把它们缩紧，重新记序，为：
 1 3 5 7 9 .... 。这时，3为第2个幸运数，然后把所有能被3整除的序号位置的数删去。
 注意，是序号位置，不是那个数本身能否被3整除!! 删除的应该是5，11, 17, ...
 此时7为第3个幸运数，然后再删去序号位置能被7整除的(19,39,...) 
 最后剩下的序列类似：
 1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 
 49, 51, 63, 67, 69, 73, 75, 79, ...
 本题要求：
 输入两个正整数m n, 用空格分开 (m < n < 1000*1000)
 程序输出 位于m和n之间的幸运数的个数（不包含m和n）。
 例如：
 用户输入：
 1 20
 程序输出：
 5
 */
public class 幸运数 {
	static int a[] = new int[500000 + 1];

	static void lucky(int start, int a[], int len) {
		int k = start, num = a[start];
		for (int i = k; i < len; i++)
			if (i % num != 0)
				a[k++] = a[i];
		if (num < len)
			lucky(start + 1, a, k);
	}

	public static void main(String[] args) {
		int len = 500000, kinds = 0;
		for (int i = 1; i < len; i++)
			a[i] = 2 * i - 1;
		lucky(2, a, len);
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		for (int i = 1; i < len; i++) {
			if (a[i] >= n || a[i] == a[i - 1])
				break;
			if (a[i] > m && a[i] < n)
				kinds++;
		}
		System.out.println(kinds);
		// System.out.println(System.currentTimeMillis()-sta);//时间
	}
}
