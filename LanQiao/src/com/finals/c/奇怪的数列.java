package com.finals.c;

import java.util.Scanner;

/*
 * 从X星截获一份电码，是一些数字，如下：
	13
	1113
	3113
	132113
	1113122113
	....
	
	YY博士经彻夜研究，发现了规律：
	第一行的数字随便是什么，以后每一行都是对上一行“读出来”
	比如第2行，是对第1行的描述，意思是：1个1，1个3，所以是：1113
	第3行，意思是：3个1,1个3，所以是：3113
	
	请你编写一个程序，可以从初始数字开始，连续进行这样的变换。
	
	数据格式：
	
	第一行输入一个数字组成的串，不超过100位
	第二行，一个数字n，表示需要你连续变换多少次，n不超过20
	
	输出一个串，表示最后一次变换完的结果。
	
	例如：
	用户输出：
	5
	7
	
	则程序应该输出：
	13211321322115
 */
public class 奇怪的数列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			s = f(s);
		}
		System.out.println(s);
		sc.close();
	}

	private static String f(String s) {
		String str = "";
		int count = 1; 
		for (int i = 0; i < s.length() -1; i++) {
			if(s.charAt(i)==s.charAt(i + 1)){
				count ++;
			}else{
				str = str + count +  s.charAt(i);
				count = 1;
			}
		}
		return str +  count +  s.charAt(s.length() -1 );
	}
}
