package cn.java.ss;

import java.util.Scanner;

/*
 *  �������ǲ�����ѧ������ķ�����ġ��������������������Ƶġ�ɸ�������ɡ�
 ���ȴ�1��ʼд����Ȼ��1,2,3,4,5,6,....
 1 ���ǵ�һ����������
 ���Ǵ�2�������ʼ������������ܱ�2��������ɾ������Ϊ��
 1 _ 3 _ 5 _ 7 _ 9 ....
 ���������������¼���Ϊ��
 1 3 5 7 9 .... ����ʱ��3Ϊ��2����������Ȼ��������ܱ�3���������λ�õ���ɾȥ��
 ע�⣬�����λ�ã������Ǹ��������ܷ�3����!! ɾ����Ӧ����5��11, 17, ...
 ��ʱ7Ϊ��3����������Ȼ����ɾȥ���λ���ܱ�7������(19,39,...) 
 ���ʣ�µ��������ƣ�
 1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 
 49, 51, 63, 67, 69, 73, 75, 79, ...
 ����Ҫ��
 ��������������m n, �ÿո�ֿ� (m < n < 1000*1000)
 ������� λ��m��n֮����������ĸ�����������m��n����
 ���磺
 �û����룺
 1 20
 ���������
 5
 */
public class ������ {
	static int a[] = new int[500000 + 1];

	static void lucky(int start, int a[], int len) {
		int k = start, num = a[start];
		for (int i = k; i < len; i++)
			if (i % num != 0)
				a[k++] = a[i];
		if (num < len)
			lucky(start + 1, a, k);
	}

	public static void main(String[] args) {
		int len = 500000, kinds = 0;
		for (int i = 1; i < len; i++)
			a[i] = 2 * i - 1;
		lucky(2, a, len);
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		for (int i = 1; i < len; i++) {
			if (a[i] >= n || a[i] == a[i - 1])
				break;
			if (a[i] > m && a[i] < n)
				kinds++;
		}
		System.out.println(kinds);
		// System.out.println(System.currentTimeMillis()-sta);//ʱ��
	}
}
