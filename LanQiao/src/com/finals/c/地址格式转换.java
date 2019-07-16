package com.finals.c;

import java.util.Scanner;

public class 地址格式转换 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(getResult(str));
		sc.close();
	}

	private static String getResult(String str) {
		String a = "";
		int b = 0;
		for (int i = 2; i < str.length(); i++) {
			if(str.charAt(i) == 'C'){
				a = str.substring(1,i);
				b = Integer.valueOf(str.substring(i +1));
				break;
			}
		}
		String result = "";
		while(b /26 >0){
			result = (char)(64 + b % 26) + result;
			b /= 26;
		}
		if(b < 26)result += (char)(64 + b);
		return result + a;
	}
}
/*
	Excel是最常用的办公软件。每个单元格都有唯一的地址表示。
	比如：第12行第4列表示为：“D12”，第5行第255列表示为“IU5”。
	事实上，Excel提供了两种地址表示方法，还有一种表示法叫做RC格式地址。
	 第12行第4列表示为：“R12C4”，第5行第255列表示为“R5C255”。
	你的任务是：编写程序，实现从RC地址格式到常规地址格式的转换。
	【输入、输出格式要求】
	用户先输入一个整数n（n<100），表示接下来有n行输入数据。
	接着输入的n行数据是RC格式的Excel单元格地址表示法。
	程序则输出n行数据，每行是转换后的常规地址表示法。
	例如：用户输入：
	R12C4
	R5C255
	则程序应该输出：
	D12
	IU5
*/