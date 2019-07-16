package com.tx.model.recursion;

public class 最大公约数 {
	/**
	 * 利用欧几里得定理
	 * (m > n )m和n的最大公约数 = n和 m%n 的最大公约数
	 * @param m
	 * @param n
	 */
	private static int gcd(int m, int n) {
		if (n == 0) {
			return m;
		}

		return gcd(n, m % n);
	}

	public static void main(String[] args) {
		System.out.println(gcd(23234244, 334534556));
	}
}
