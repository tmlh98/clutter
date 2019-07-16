package com.lqb.cgroup;

public class 生成回文数 {
	/*
	 * 
	 * 所谓回文数就是左右对称的数字，比如：585,5885,123321...当然，单个的数字也可以算作是对称的。
	 * 
	 * 小明发现了一种生成回文数的方法：比如，取数字19，把它与自己的翻转数相加：19 + 91 = 110，如果不是回文数，就再进行这个过程：110 +
	 * 011 = 121 这次是回文数了。
	 * 
	 * 200以内的数字中，绝大多数都可以在30步以内变成回文数，只有一个数字很特殊，就算迭代了1000次，它还是顽固地拒绝回文！
	 * 
	 * 请你提交该顽固数字，不要填写任何多余的内容。
	 */
	public static long Reverse(long n) {
		//数字翻转
		int len = new String("" + n).length();
		long[] A = new long[len];
		int i = 0;
		while (n > 0) {
			A[i++] = n % 10;
			n = n / 10;
		}
		long result = 0;
		for (i = 0; i < len; i++)
			result = result * 10 + A[i];
		return result;
	}

	public static void main(String[] args) {
		for (long i = 0; i <= 200; i++) {
			int count = 0;
			long a = i;
			long b = Reverse(a);
			while (a != b) {
				a = a + b;
				b = Reverse(a);
				count++;
				if (count > 1000) {
					System.out.println("i = " + i + ", a = " + a + ", b = " + b);
					break;
				}
			}
		}
	}

}
