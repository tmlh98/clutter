package com.lqb.agroup;

import java.util.Scanner;

/*
 * 
	当你输入信用卡号码的时候，有没有担心输错了而造成损失呢？其实可以不必这么担心，
	因为并不是一个随便的信用卡号码都是合法的，它必须通过Luhn算法来验证通过。
	该校验的过程：
	1、从卡号最后一位数字开始，逆向将奇数位(1、3、5等等)相加。
	2、从卡号最后一位数字开始，逆向将偶数位数字，先乘以2（如果乘积为两位数，则将其减去9），再求和。
	3、将奇数位总和加上偶数位总和，结果应该可以被10整除。
	例如，卡号是：5432123456788881
	
	则，奇数位和=35
	偶数位乘以2（有些要减去9）的结果：1 6 2 6 1 5 7 7，求和=35。
	最后35+35=70 可以被10整除，认定校验通过。
	
	请编写一个程序，从键盘输入卡号，然后判断是否校验通过。通过显示：“成功”，否则显示“失败”。
	比如，用户输入：356827027232780
	程序输出：成功
	
	【参考测试用例】
	356406010024817     成功
	358973017867744     成功
	356827027232781     失败
	306406010024817     失败
	358973017867754     失败
 */
public class 信用卡号的验证 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		result(num);
		sc.close();
		
	}

	private static void result(String num) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = num.length()-1; i >0; i-=2) {
			if(i>=0)
				sum1 += Integer.valueOf(num.charAt(i)) ;
			if(i>=1){
				int ou= Integer.valueOf(num.charAt(i-1));
				if(ou>=5)
					sum2+=ou*2-9;
				else
					sum2+=ou*2;
			}
		}
		if((sum1+sum2)%10==0)
			System.out.println("成功");
		else
			System.out.println("失败");
		
	}
}
