package com.tx.work;

import java.util.Scanner;
public class ������ {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 long begin = System.currentTimeMillis();
		 getResult(n);
		 long end = System.currentTimeMillis();
		 System.out.println(count);
		 System.out.println(end - begin);
		 sc.close();
	}

	/*
	 * ����������ֺͷ�ĸ��Ȼ��������
	 */
	static int count = 0;
	static String[] arr = new String[]{"1","2","3","4","5","6","7","8","9"}; 
	private static void getResult(int n) {
		for (int i = 1; i < n; i++) {//�������ֵĿ���87
			if(isContainZero(i))continue;
			for (int j = 2; j < 10000; j++) {//��ĸ
				if(isContainZero(j))continue;
				int t = (n - i) * j;//����
				if(isContainZero(t))continue;
				String str = "" + i + j + t;
				if(str.length() != 9)continue;
				if(check(str)) {
//					System.out.println(n + " = " + i + " + " + t + "/" + j);
					count ++;
				}
			}
		}
	}
	private static boolean check(String str) {
		for (int i = 0; i < arr.length; i++) {
			if(str.indexOf(arr[i]) == -1)return false;
		}
		return true;
	}
	//����Ƿ����0
	private static boolean isContainZero(int i) {
		String str = i +"";
		if(str.indexOf("0") != -1)return true;
		return false;
	}
	
	
}
/*
 * 100 ���Ա�ʾΪ����������ʽ��100 = 3 + 69258 / 714�� �����Ա�ʾΪ��100 = 82 + 3546 / 197.
 * ע���������������У�����1~9�ֱ������ֻ����һ�Σ�������0���� ���������Ĵ�������100 �� 11 �ֱ�ʾ����
 */