package com.tx.work;

import java.util.Scanner;

public class �򲻵�����Ŀ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = getNum(a ,b);
		System.out.println(result);
		sc.close();
	}
	//Q = ax + by
	private static int getNum(int a, int b) {
		int[] arr = new int [1000000];
		
		for (int i = 0; i < a * b; i++) {
			for (int j = 0; j < a * b; j++) {
				if(i * a + j * b >= 1000000)break;
				arr[i * a + j * b] ++;
			}
		}
		
		for (int i = a * b - 1; i >= 0; i--) {
			if(arr[i] == 0){
				return i; 
			}
			}
		return 0;
		
	}
	 
}
/*
 * С������һ���ǹ��ꡣ������Ĳã���ˮ���ǰ���4��һ����7��һ�������֡��ǹ����ܲ������
 * С���������ǵ�ʱ�������������ְ�װ����ϡ���Ȼ��Щ�ǹ���Ŀ���޷���ϳ����ģ�����Ҫ�� 10 ���ǡ�
 * ������ü��������һ�£������ְ�װ����£�������򵽵�������17������17���κ����ֶ�������4��7��ϳ�����
 * �����Ҫ���������֪������װ������ʱ�����������ϳ������֡�
 */