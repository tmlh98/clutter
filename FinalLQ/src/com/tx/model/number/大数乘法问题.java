package com.tx.model.number;

import java.math.BigInteger;

/*
 * 用串的形式表示大数的乘法。
 * 即求类似： “23234845847839461464158174814792” * “6457847285617487843234535”
 * 要求结果返回一个串。
 */
public class 大数乘法问题 {
	static String zero(int n) {
		if (n == 0)
			return "";
		if (n == 1)
			return "0";
		return zero(n / 2) + zero(n / 2) + zero(n % 2);
	}

	static String add(String a, String b) {
		if (a.length() <= 8 && b.length() <= 8)
			return Integer.parseInt(a) + Integer.parseInt(b) + "";
		String a1 = "0";
		String a2 = a;
		if (a.length() > 8) {
			a1 = a.substring(0, a.length() - 8);
			a2 = a.substring(a.length() - 8);
		}

		String b1 = "0";
		String b2 = b;
		if (b.length() > 8) {
			b1 = b.substring(0, b.length() - 8);
			b2 = b.substring(b.length() - 8);
		}

		String t = add(a2, b2);
		while (t.length() < 8)
			t = "0" + t;
		if (t.length() > 8)
			return add(add(a1, b1), "1") + t.substring(1);
		return add(a1, b1) + t;
	}

	static String multi(String a, String b) {
		if (a.length() <= 4 && b.length() <= 4)
			return Integer.parseInt(a) * Integer.parseInt(b) + "";
		if (a.length() > 4) {
			int k = a.length() / 2;
			String a1 = a.substring(0, k);
			String a2 = a.substring(k);

			return add(multi(a1, b) + zero(a2.length()), multi(a2, b));
		}

		return multi(b, a);
	}

	public static void main(String[] args) {
		System.out.println(multi("1234567890987654321666",
				"1234567890123456789555"));

		System.out.println(new BigInteger("1234567890987654321666")
				.multiply(new BigInteger("1234567890123456789555")));
	}
}
