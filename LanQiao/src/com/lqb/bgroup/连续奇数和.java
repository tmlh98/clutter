package com.lqb.bgroup;

/*
 * 小明看到一本书上写着：任何数字的立方都可以表示为连续奇数的和。
 比如：
 2^3 = 8 = 3 + 5
 3^3 = 27 = 7 + 9 + 11
 4^3 = 64 = 1 + 3 + ... + 15
 虽然他没有想出怎么证明，但他想通过计算机进行验证。
 请你帮助小明写出 111 的立方之连续奇数和表示法的起始数字。如果有多个表示方案，选择起始数字小的方案。
 */
public class 连续奇数和 {
	public static void main(String[] args) {
		int num = 111 * 111 * 111;
		for (int i = 1; i < 10000000; i+=2) {
			int count = 0;
			for (int j = i; j < 10000000; j+=2) {
				count += j;
				if(count  == num){
					System.out.println(i);
				}
			}
		}
	}
}
