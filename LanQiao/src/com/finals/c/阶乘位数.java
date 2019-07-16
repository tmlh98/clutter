package com.finals.c;

import java.math.BigInteger;

public class 阶乘位数 {
	
	public static void main(String[] args) {
		
		BigInteger bg = BigInteger.ONE;
		for (int i = 50; i > 1; i--) {
			BigInteger bg2 = new BigInteger(i + "");
			bg = bg.multiply(bg2);
		}
		int length = (new BigInteger(bg.toString(), 10).toString(2)).toString().length();

		System.out.println(length);
	}
}
/*
9的阶乘等于：362880
它的二进制表示为：1011000100110000000
这个数字共有19位。
请你计算，9999 的阶乘的二进制表示一共有多少位？
注意：需要提交的是一个整数，不要填写任何无关内容（比如说明解释等）
答案：118445
*/