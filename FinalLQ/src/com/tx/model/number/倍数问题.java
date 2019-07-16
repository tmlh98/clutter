package com.tx.model.number;

import java.util.Scanner;


public class 倍数问题 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int [n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int result  = getResult(sort(a) , k);
		System.out.println(result);
		sc.close();
	}


	private static int getResult(int[] a, int k) {
		int num1 = a[0]; 
		int num2 = a[1]; 
		int num3 = a[2]; 
		if((num1 + num2 + num3)% k == 0 )return num1 + num2 + num3;
		
		return 0;
	}
	private static int[] sort(int[] a) {
		for (int i = 0; i < a.length -1; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i] < a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}

/*
 * 众所周知，小葱同学擅长计算，尤其擅长计算一个数是否是另外一个数的倍数。但小葱只擅长两个数的情况，
 * 当有很多个数之后就会比较苦恼。现在小葱给了你 n 个数，希望你从这 n 个数中找到三个数，
 * 使得这三个数的和是 K 的倍数，且这个和最大。数据保证一定有解。

	【输入格式】
	从标准输入读入数据。
	
	第一行包括 2 个正整数 n, K。
	第二行 n 个正整数，代表给定的 n 个数。
	
	【输出格式】
	输出到标准输出。
	输出一行一个整数代表所求的和。
	
	【样例入】
	4 3
	1 2 3 4
	
	【样例输出】
	9
	
	【样例解释】
	选择2、3、4。
	提交程序时，注意选择所期望的语言类型和编译器类型。
*/