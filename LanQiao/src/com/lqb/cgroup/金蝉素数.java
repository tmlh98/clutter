package com.lqb.cgroup;

/*
 考古发现某古墓石碑上刻着一个数字：13597，后研究发现：
 这是一个素数！
 并且，去掉首尾数字仍是素数！
 并且，最中间的数字也是素数！
 这样特征的数字还有哪些呢？通过以下程序的帮助可以轻松解决。请仔细阅读代码，并填写划线部分缺失的代码。
 */
public class 金蝉素数 {
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void f(int[] x, int k) {
		if (k == x.length) { // 填空位置
			if (isPrime(x[0] * 10000 + x[1] * 1000 + x[2] * 100 + x[3] * 10
					+ x[4])
					&& isPrime(x[1] * 100 + x[2] * 10 + x[3]) && isPrime(x[2]))
				System.out.println("" + x[0] + x[1] + x[2] + x[3] + x[4]);
			return;
		}

		for (int i = k; i < x.length; i++) {
			{
				int tmp = x[k];
				x[k] = x[i];
				x[i] = tmp;
			}
			f(x, k + 1);
			{
				int tmp = x[k];
				x[k] = x[i];
				x[i] = tmp;
			}
		}
	}

	static void test() {
		int[] x = { 1, 3, 5, 7, 9 };
		f(x, 0);
	}

	public static void main(String[] args) {
		test();
	}
}
