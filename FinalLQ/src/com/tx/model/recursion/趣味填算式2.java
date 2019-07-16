package com.tx.model.recursion;

public class Ȥζ����ʽ2 {
	// a: �μӼ����Ԫ��
	// k: Ŀǰ���ǵ�Ԫ���±�
	// so: �ϳɺõĽ����
	// goal: ����Ŀ��
	static void f(int[] a, int k, String so, int goal) {
		if (k == 0) {
			if (a[0] == goal) {
				System.out.println(a[0] + so);
			}
			return;
		}

		f(a, k - 1, "+" + a[k] + so, goal - a[k]);
		f(a, k - 1, "-" + a[k] + so, goal + a[k]);
		int old = a[k - 1]; // ��ס��ʷ
		a[k - 1] = Integer.parseInt("" + a[k - 1] + a[k]);
		f(a, k - 1, so, goal);
		a[k - 1] = old; // ����
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		f(a, 8, "", 110);
	}
}
