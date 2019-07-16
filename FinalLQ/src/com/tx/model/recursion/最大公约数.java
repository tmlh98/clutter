package com.tx.model.recursion;

public class ���Լ�� {
	/**
	 * ����ŷ����ö���
	 * (m > n )m��n�����Լ�� = n�� m%n �����Լ��
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
