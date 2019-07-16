package com.finals.c;

import java.util.HashSet;

public class ��ƽ���� {
	
	static HashSet<String> hs = new HashSet<String>();
	
	public static void main(String[] args) {
		int[] A = {0,1,2,3,4,5,6,7,8,9};
		f(A , 0);
	}

	private static void f(int[] a, int k) {
		if(a.length == k){
			long[] B = new long[a.length];
			return;
		}
		
		for (int i = k; i < a.length; i++) {
			swap(a , i , k);
			f(a, k + 1);
			swap(a , i , k);
		}
		
	}

	private static void swap(int[] a, int i, int k) {
		int temp = a[i];
		a[i] = a[k];
		a[k] = temp;
	}
	
}
/*
	��0~9��10�����֣��ֳɶ���飬ÿ����ǡ����һ��ƽ�����������ܹ��쵽�ġ�
	���磺0, 36, 5948721
	
	�ٱ��磺
	1098524736
	1, 25, 6390784
	0, 4, 289, 15376
	�ȵ�...
	ע�⣬0������Ϊ���������֣���������Ϊ��λ���ֵĿ�ʼ��
	����ʱ�������������е����֣������ظ���������©��
	������ƽ�С�������ݵ��Ⱥ�˳�������ж����ֲ�ͬ�ķ��鷽����
	
	ע�⣺��Ҫ�ύ����һ����������Ҫ��д�������ݡ�
	
	�𰸣�300
*/
