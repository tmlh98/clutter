package com.tx.work;

import java.util.Scanner;

/*
 * ����˵���ǹȲ�����
	����������������� 5�� ���Ǵ�����ʼ�����¹�����㣺
	�����ż���������2������������������3�ټ�1.
	���ѭ�������ձػ�õ���1�� !
	
	���� 5 �Ĵ�������ǣ�
	16 8 4 2 1
	
	һ���������������ٲ����ܱ��1�� ��Ϊ�ǹȲ�����
	����5���ԣ�����Ҳ��5
	����1������Ϊ0
	
	�����Ҫ���ǣ��ӱ�׼�������һ������n��1<n<300����ʾ�ǹȲ���
	����������ǹȲ�������С��������
 */
public class �ǹȲ��� {
	
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getResult(n);		
		System.out.println(count);		
		sc.close();
		
	}

	private static void getResult(int n) {
		while( n >1 ){
			if(n % 2 == 0)n /= 2;
			else n = n * 3 + 1;
			count ++;
		}
	}
}
