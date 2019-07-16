package com.tx.work;

import java.util.Scanner;

public class 砝码称重 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = f(n);
		System.out.println(str);
		sc.close();
		
	}

	//方法1：三进制处理
	private static String f(int w) {
		int i = 1;  
        while(i < w) i *= 3;  
          
        if (w == i) return i + "";  
          
        if (w <= i/2) return i/3 + "+" + f(w - i/3);  
          
        return i + "-" + f(i - w);  
	}
	
	
}
/*
 * 5个砝码

	用天平称重时，我们希望用尽可能少的砝码组合称出尽可能多的重量。
	如果只有5个砝码，重量分别是1，3，9，27，81。则它们可以组合称出1到121之间任意整数重量（砝码允许放在左右两个盘中）。
	本题目要求编程实现：对用户给定的重量，给出砝码组合方案。
	例如：
	用户输入：
	程序输出：
	9-3-1
	用户输入：
	程序输出：
	27-9+1
	
	要求程序输出的组合总是大数在前小数在后。
	可以假设用户的输入的数字符合范围1~121。
*/