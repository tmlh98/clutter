package com.finals.c;

import java.util.Scanner;

public class ����оƬ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int R = sc.nextInt();
		boolean[] arr = new boolean [N];
		run(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			if(arr[i] && i >= L -1 && i <= R -1) count ++;
		System.out.println(count);
		sc.close();
	}
	private static void run(boolean[] arr) {
		for (int i = 1; i < arr.length; i++) 
			for (int j = 0; j < arr.length; j++) 
				if((j + 1) % (i + 1) == 0) 
					arr[j] = !arr[j]; 
	}
}

/*
 * X��ʿ�����о�һ������оƬ�����߼��ܼ��ȡ�������ԶԶ������ͨ�İ뵼��оƬ��
 * ��ʿ��оƬ������� n ��΢�͹�Դ��ÿ����Դ����һ�ξͻ�ı���״̬����������תΪ�رգ���ر�תΪ������
 * ��Щ��Դ�ı�Ŵ� 1 �� n����ʼ��ʱ�����й�Դ���ǹرյġ�
 * ��ʿ�ƻ���оƬ��ִ�����¶�����
 * ���б��Ϊ2�ı����Ĺ�Դ����һ�Σ�Ҳ���ǰ� 2 4 6 8 ... ����Ź�Դ��
 * ���б��Ϊ3�ı����Ĺ�Դ����һ��, Ҳ���Ƕ� 3 6 9 ... ����Ź�Դ������ע���ʱ6�Ź�Դ�ֹر��ˡ�
 * ���б��Ϊ4�ı����Ĺ�Դ����һ�Ρ�
 * .....
 * ֱ�����Ϊ n �ı����Ĺ�Դ����һ�Ρ�
 * X��ʿ��֪����������Щ������ĳ�������е���Щ��Դ�ǵ����ġ�
 * �������ʽ�� 3���ÿո�ֿ���������N L R (L<R<N<10^15) N��ʾ��Դ����L��ʾ�������߽磬R��ʾ������ұ߽硣
 * �������ʽ�� ���1����������ʾ�������в�����[L,R] �������ж��ٸ���Դ�ǵ����ġ�
 * ���磺 ���룺 5 2 3 ����Ӧ������� 2
 * �����磺 ���룺 10 3 6 ����Ӧ������� 3
 */