package com.tx.model.recursion;

/*
 * ��԰Ʊ��Ϊ5�ǡ�����ÿλ�ο�ֻ�������ֱ�ֵ�Ļ��ң�5�ǡ�1Ԫ��
 �ټ������5�ǵ���m�ˣ�����1Ԫ����n�ˡ�
 ���������������ʼ��ʱ����ƱԱû����Ǯ���ҡ�
 ������֪����m+n���ο���ʲô����˳��Ʊ�����˳����ɹ�Ʊ���̡�
 ��Ȼ��m < n��ʱ��������ζ�������ɣ�
 m>=n��ʱ����Щ���Ҳ���С����磬��һ����Ʊ�ĳ˿;ͳ���1Ԫ��
 ��������m+n���ο����п���˳����ɹ�Ʊ�Ĳ�ͬ����������Ŀ��
 ע�⣺ֻ����5�Ǻ�1Ԫ������ֵĴ���Ĳ�ͬ���У�����ͬ����ֵ�������οͽ���λ�ò�������һ���µ�
 �����������
 */
public class ��Ǯ���� {
	public static void main(String[] args) {
		System.out.println(f(3, 2));
		System.out.println(f(3, 2, 0));
	}

	/**
	 * �������һ����
	 * @param m ������ǵ�����
	 * @param n ����һԪ������
	 * @return ��ͬ����������
	 */
	private static int f(int m, int n) {
		if (m < n)
			return 0;
		if (m == 1 || n == 0)
			return 1;
		return f(m - 1, n) + f(m, n - 1);
	}

	// ���ǵ�һ����
	// t: ��ƱԱ�����ж��ٸ�5�ǵ�
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
