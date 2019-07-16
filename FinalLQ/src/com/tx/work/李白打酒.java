package com.tx.work;

public class 李白打酒 {

	public static void main(String[] args) {
		f(0, 0, 2, "");
		System.out.println(count);
	}

	static int count = 0;

	// a:遇到店的次数 b:遇花的次数
	private static void f(int a, int b, int jiu, String s) {
		if (a == 5 && b == 9 && jiu == 1) {
			System.out.println(s);
			count++;
		}
		if (a < 5)
			f(a + 1, b, jiu * 2, s + "a");
		if (b < 9)
			f(a, b + 1, jiu - 1, s + "b");
	}

}
/*
 * 一天，他提着酒壶，从家里出来，酒壶中有酒2斗。他边走边唱： 无事街上走，提壶去打酒。 逢店加一倍，遇花喝一斗。
 * 这一路上，他一共遇到店5次，遇到花10次，已知最后一次遇到的是花，他正好把酒喝光了。
 * 请你计算李白遇到店和花的次序，可以把遇店记为a，遇花记为b。则：babaabbabbabbbb 就是合理的次序。
 * 像这样的答案一共有多少呢？请你计算出所有可能方案的个数（包含题目给出的）。
 */ 