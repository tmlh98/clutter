package com.jisuanke.nanti;

import java.util.Scanner;

public class ��ֵ���� {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		cal(arr);
		
		System.out.println(count);
		sc.close();
	}

	private static void cal(int[] arr) {
		int sum = 0;
		for ( ;  ; ) {
			for (int i = 0; i < arr.length -1; i++) {
				if(arr[i] > arr[i + 1]){//�����һλС�ڵ�ǰ������ǰ��Ԫ�ؽ���
					run(arr,i +1);
					count++;
					sum++;
				}
			}
			if(sum == 0)return;
			sum = 0;
		}
		
	}

	private static void run(int[] arr, int index) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[index] ){
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				break;
			}
		}
	}
}
/*
 * ������һ�ֺ�Ƶ���ļ�������һ��ʵ�ʵ������ǣ������Ǹ�ĳ�������ʤ�߰�����ͭ�������ʱ��
 * ����������п��ܵ�ֵֻ������1��2��3�������ý����ķ��������ų������ ��
 * дһ�������������������һ������1��2��3����ֵ���������У��ų�������������ٽ���������
 *  �����1��Ϊ��������N��1��N��1000��
 * �����2�е���N+1�У�ÿ�а���һ�����֣�1��2��3���� �������һ�У�Ϊ�ų�������������ٽ���������
 */