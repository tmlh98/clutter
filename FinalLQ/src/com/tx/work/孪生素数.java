package com.tx.work;

import java.util.Scanner;

/*
 * 			���� 
 * дһ�������ҳ�����������Χ�ڵ���������������������
 * һ����˵��������������ָ������������Ϊ2�����Ĳ����ٽ�������������
 * ��ЩͯЬһ������Ϳ�ʼд���򣬲���ϸ���⣬����Ϊ�˶���һ�¶��ⲻ������ϸ��ͯЬ���涨��������������Ϊ1��Ҳ��Ϊ����������
	����
	��һ�и���N(0<N<100)��ʾ��������������
	��������������ݸ���m����ʾ�ҳ�m֮ǰ����������������
	(0<m<1000000)
	���
	ÿ������������ռһ�У�����Ϊm��Χ��������������������
	��������
	1
	14
	�������
	4
 */
public class �������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			System.out.println(f(n));
		}
		sc.close();
	}
// 2 3 5 7 11 13 
	private static int f(int n) {
		int[] sum = new int [n];
		int index = 0;
		for (int i = 2; i < n; i++) {
			if(check(i)){
				sum[index ++] = i;
			}
		}
		int count = 0;
		 
		for (int i = 0; i < sum.length; i++) {
			if(sum[i +1] - sum[i] == 1 ||sum[i +1] - sum[i] == 2  )count++;
			if(sum[i + 1] == 0)break;
		}
		
		return count ;
	}

	private static boolean check(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if(n % i == 0)return false;
		}
		return true;
	}
}
