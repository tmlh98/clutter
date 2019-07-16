package com.tx.model.number;

import java.util.Scanner;


public class �������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int [n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int result  = getResult(sort(a) , k);
		System.out.println(result);
		sc.close();
	}


	private static int getResult(int[] a, int k) {
		int num1 = a[0]; 
		int num2 = a[1]; 
		int num3 = a[2]; 
		if((num1 + num2 + num3)% k == 0 )return num1 + num2 + num3;
		
		return 0;
	}
	private static int[] sort(int[] a) {
		for (int i = 0; i < a.length -1; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i] < a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}

/*
 * ������֪��С��ͬѧ�ó����㣬�����ó�����һ�����Ƿ�������һ�����ı�������С��ֻ�ó��������������
 * ���кܶ����֮��ͻ�ȽϿ��ա�����С�и����� n ������ϣ������� n �������ҵ���������
 * ʹ�����������ĺ��� K �ı������������������ݱ�֤һ���н⡣

	�������ʽ��
	�ӱ�׼����������ݡ�
	
	��һ�а��� 2 �������� n, K��
	�ڶ��� n ������������������� n ������
	
	�������ʽ��
	�������׼�����
	���һ��һ��������������ĺ͡�
	
	�������롿
	4 3
	1 2 3 4
	
	�����������
	9
	
	���������͡�
	ѡ��2��3��4��
	�ύ����ʱ��ע��ѡ�����������������ͺͱ��������͡�
*/