package com.finals.c;

import java.util.Scanner;

public class 生物芯片 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int R = sc.nextInt();
		boolean[] arr = new boolean [N];
		run(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			if(arr[i] && i >= L -1 && i <= R -1) count ++;
		System.out.println(count);
		sc.close();
	}
	private static void run(boolean[] arr) {
		for (int i = 1; i < arr.length; i++) 
			for (int j = 0; j < arr.length; j++) 
				if((j + 1) % (i + 1) == 0) 
					arr[j] = !arr[j]; 
	}
}

/*
 * X博士正在研究一种生物芯片，其逻辑密集度、容量都远远高于普通的半导体芯片。
 * 博士在芯片中设计了 n 个微型光源，每个光源操作一次就会改变其状态，即：点亮转为关闭，或关闭转为点亮。
 * 这些光源的编号从 1 到 n，开始的时候所有光源都是关闭的。
 * 博士计划在芯片上执行如下动作：
 * 所有编号为2的倍数的光源操作一次，也就是把 2 4 6 8 ... 等序号光源打开
 * 所有编号为3的倍数的光源操作一次, 也就是对 3 6 9 ... 等序号光源操作，注意此时6号光源又关闭了。
 * 所有编号为4的倍数的光源操作一次。
 * .....
 * 直到编号为 n 的倍数的光源操作一次。
 * X博士想知道：经过这些操作后，某个区间中的哪些光源是点亮的。
 * 【输入格式】 3个用空格分开的整数：N L R (L<R<N<10^15) N表示光源数，L表示区间的左边界，R表示区间的右边界。
 * 【输出格式】 输出1个整数，表示经过所有操作后，[L,R] 区间中有多少个光源是点亮的。
 * 例如： 输入： 5 2 3 程序应该输出： 2
 * 再例如： 输入： 10 3 6 程序应该输出： 3
 */