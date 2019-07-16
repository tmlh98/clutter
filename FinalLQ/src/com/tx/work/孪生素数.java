package com.tx.work;

import java.util.Scanner;

/*
 * 			描述 
 * 写一个程序，找出给出素数范围内的所有孪生素数的组数。
 * 一般来说，孪生素数就是指两个素数距离为2，近的不能再近的相邻素数。
 * 有些童鞋一看到题就开始写程序，不仔细看题，咱们为了遏制一下读题不认真仔细的童鞋，规定，两个素数相邻为1的也成为孪生素数。
	输入
	第一行给出N(0<N<100)表示测试数据组数。
	接下来组测试数据给出m，表示找出m之前的所有孪生素数。
	(0<m<1000000)
	输出
	每组测试数据输出占一行，该行为m范围内所有孪生素数组数。
	样例输入
	1
	14
	样例输出
	4
 */
public class 孪生素数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			System.out.println(f(n));
		}
		sc.close();
	}
// 2 3 5 7 11 13 
	private static int f(int n) {
		int[] sum = new int [n];
		int index = 0;
		for (int i = 2; i < n; i++) {
			if(check(i)){
				sum[index ++] = i;
			}
		}
		int count = 0;
		 
		for (int i = 0; i < sum.length; i++) {
			if(sum[i +1] - sum[i] == 1 ||sum[i +1] - sum[i] == 2  )count++;
			if(sum[i + 1] == 0)break;
		}
		
		return count ;
	}

	private static boolean check(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if(n % i == 0)return false;
		}
		return true;
	}
}
