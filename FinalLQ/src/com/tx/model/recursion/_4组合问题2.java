package com.tx.model.recursion;

//"AABBBC" ȡ3��, ��Щȡ����
//����ȡ�� 2 3 1
//��ǰȡ��   a b c  ��֤ a + b + c = 3, a<=2, b<=3, c<=1
public class _4�������2 {
	static void work(int[] x) {
		for (int i = 0; i < x.length; i++) {
			for (int k = 0; k < x[i]; k++) {
				System.out.print((char) ('A' + i));
			}
		}
		System.out.println();
	}

	// data: ����, ��������
	// x: ȡ��
	// k: ��ǰ���ǵ�λ��
	// goal: ����Ŀ���ʣ������
	static void f(int[] data, int[] x, int k, int goal) {
		if (k == x.length) {
			if (goal == 0)
				work(x);
			return;
		}

		for (int i = 0; i <= Math.min(data[k], goal); i++) {
			x[k] = i;
			f(data, x, k + 1, goal - i);
		}
		x[k] = 0; // ����
	}

	public static void main(String[] args) {
		int[] data = { 2, 3, 1 }; // ÿ��Ԫ�ص�������
		int[] x = new int[data.length]; // ÿ��Ԫ��ȡ����

		f(data, x, 0, 3);
	}
}
