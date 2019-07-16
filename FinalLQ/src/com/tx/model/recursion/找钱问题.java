package com.tx.model.recursion;

/*
 * 公园票价为5角。假设每位游客只持有两种币值的货币：5角、1元。
 再假设持有5角的有m人，持有1元的有n人。
 由于特殊情况，开始的时候，售票员没有零钱可找。
 我们想知道这m+n名游客以什么样的顺序购票则可以顺利完成购票过程。
 显然，m < n的时候，无论如何都不能完成；
 m>=n的时候，有些情况也不行。比如，第一个购票的乘客就持有1元。
 请计算出这m+n名游客所有可能顺利完成购票的不同情况的组合数目。
 注意：只关心5角和1元交替出现的次序的不同排列，持有同样币值的两名游客交换位置并不算做一种新的
 情况来计数。
 */
public class 找钱问题 {
	public static void main(String[] args) {
		System.out.println(f(3, 2));
		System.out.println(f(3, 2, 0));
	}

	/**
	 * 考虑最后一个人
	 * @param m 持有五角的人数
	 * @param n 持有一元的人数
	 * @return 不同情况的组合数
	 */
	private static int f(int m, int n) {
		if (m < n)
			return 0;
		if (m == 1 || n == 0)
			return 1;
		return f(m - 1, n) + f(m, n - 1);
	}

	// 考虑第一个人
	// t: 售票员手里有多少个5角的
	static int f(int m, int n, int t) {
		if (m + t < n)
			return 0;
		if (m == 1 || n == 0)
			return 1;

		int r = f(m - 1, n, t + 1);
		if (t > 0)
			r += f(m, n - 1, t - 1);
		return r;
	}
}
