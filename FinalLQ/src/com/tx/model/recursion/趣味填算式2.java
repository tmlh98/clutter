package com.tx.model.recursion;

public class 趣味填算式2 {
	// a: 参加计算的元素
	// k: 目前考虑的元素下标
	// so: 合成好的结果串
	// goal: 计算目标
	static void f(int[] a, int k, String so, int goal) {
		if (k == 0) {
			if (a[0] == goal) {
				System.out.println(a[0] + so);
			}
			return;
		}

		f(a, k - 1, "+" + a[k] + so, goal - a[k]);
		f(a, k - 1, "-" + a[k] + so, goal + a[k]);
		int old = a[k - 1]; // 记住历史
		a[k - 1] = Integer.parseInt("" + a[k - 1] + a[k]);
		f(a, k - 1, so, goal);
		a[k - 1] = old; // 回溯
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		f(a, 8, "", 110);
	}
}
