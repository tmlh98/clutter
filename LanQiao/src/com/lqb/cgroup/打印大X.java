package com.lqb.cgroup;

import java.util.Scanner;

/*
 * С��ϣ�����Ǻ�ƴ�գ���ӡ��һ����X����Ҫ���ܹ����Ʊʻ��Ŀ�Ⱥ������ֵĸ߶ȡ�
 * Ϊ�˱��ڱȶԿո����еĿհ�λ�ö��Ծ��������档
 *
 *Ҫ��������������m n����ʾ�ʵĿ�ȣ�X�ĸ߶ȡ��ÿո�ֿ�(0<m<n, 3<n<1000, ��֤n������)
 *Ҫ�����һ����X
 *
 *���磬�û����룺
 *3 9
 *����Ӧ�������
  ***.....***
  .***...***.
  ..***.***..
  ...*****...
  ....***....
  ...*****...
  ..***.***..
  .***...***.
  ***.....***
 */
public class ��ӡ��X {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		//����һ����ά���飬Ĭ��ȫ��Ϊ.
		char[][] X=new char[n][n+m-1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n+m-1; j++) {
				X[i][j]='.';
			}
		}
		//�������
		for (int i = 0; i < n ; i++) {
			for (int j = i; j < i+m; j++) {
				X[i][j] = '*';
			}
		}
		
		for (int i = 0; i < n ; i++) {
			for (int j = n+m-1-i-m; j < n+m-1-i; j++) {
				X[i][j] = '*';
			}
		}

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n+m-1; j++) {
				System.out.print(X[i][j]);
			}
			System.out.println();
		}
	}
}
