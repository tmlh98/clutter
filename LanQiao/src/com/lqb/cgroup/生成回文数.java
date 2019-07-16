package com.lqb.cgroup;

public class ���ɻ����� {
	/*
	 * 
	 * ��ν�������������ҶԳƵ����֣����磺585,5885,123321...��Ȼ������������Ҳ���������ǶԳƵġ�
	 * 
	 * С��������һ�����ɻ������ķ��������磬ȡ����19���������Լ��ķ�ת����ӣ�19 + 91 = 110��������ǻ����������ٽ���������̣�110 +
	 * 011 = 121 ����ǻ������ˡ�
	 * 
	 * 200���ڵ������У����������������30�����ڱ�ɻ�������ֻ��һ�����ֺ����⣬���������1000�Σ���������̵ؾܾ����ģ�
	 * 
	 * �����ύ��������֣���Ҫ��д�κζ�������ݡ�
	 */
	public static long Reverse(long n) {
		//���ַ�ת
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
