package com.tx.work;

public class ��״�� {

	public static void main(String[] args) {
		f(0, 0, 2, "");
		System.out.println(count);
	}

	static int count = 0;

	// a:������Ĵ��� b:�����Ĵ���
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
 * һ�죬�����žƺ����Ӽ���������ƺ����о�2���������߱߳��� ���½����ߣ����ȥ��ơ� ����һ����������һ����
 * ��һ·�ϣ���һ��������5�Σ�������10�Σ���֪���һ���������ǻ��������ðѾƺȹ��ˡ�
 * ����������������ͻ��Ĵ��򣬿��԰������Ϊa��������Ϊb����babaabbabbabbbb ���Ǻ���Ĵ���
 * �������Ĵ�һ���ж����أ������������п��ܷ����ĸ�����������Ŀ�����ģ���
 */ 