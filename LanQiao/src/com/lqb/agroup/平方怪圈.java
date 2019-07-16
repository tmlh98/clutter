package com.lqb.agroup;
/*
 * 如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
	对新产生的正整数再做同样的处理。
	如此一来，你会发现，不管开始取的是什么数字，
	最终如果不是落入1，就是落入同一个循环圈。
	请写出这个循环圈中最大的那个数字。
	请填写该最大数字。
 */
public class 平方怪圈 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(result(i));
		}
	}
	public static int result(int num){
		int j = 0;
		int count = 0;
		while(num!=0){
			j=num%10;
			count+=j*j;
			num/=10;
		}
		return count;
		
	}
}
