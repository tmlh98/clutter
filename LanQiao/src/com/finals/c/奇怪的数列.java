package com.finals.c;

import java.util.Scanner;

/*
 * ��X�ǽػ�һ�ݵ��룬��һЩ���֣����£�
	13
	1113
	3113
	132113
	1113122113
	....
	
	YY��ʿ����ҹ�о��������˹��ɣ�
	��һ�е����������ʲô���Ժ�ÿһ�ж��Ƕ���һ�С���������
	�����2�У��ǶԵ�1�е���������˼�ǣ�1��1��1��3�������ǣ�1113
	��3�У���˼�ǣ�3��1,1��3�������ǣ�3113
	
	�����дһ�����򣬿��Դӳ�ʼ���ֿ�ʼ���������������ı任��
	
	���ݸ�ʽ��
	
	��һ������һ��������ɵĴ���������100λ
	�ڶ��У�һ������n����ʾ��Ҫ�������任���ٴΣ�n������20
	
	���һ��������ʾ���һ�α任��Ľ����
	
	���磺
	�û������
	5
	7
	
	�����Ӧ�������
	13211321322115
 */
public class ��ֵ����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			s = f(s);
		}
		System.out.println(s);
		sc.close();
	}

	private static String f(String s) {
		String str = "";
		int count = 1; 
		for (int i = 0; i < s.length() -1; i++) {
			if(s.charAt(i)==s.charAt(i + 1)){
				count ++;
			}else{
				str = str + count +  s.charAt(i);
				count = 1;
			}
		}
		return str +  count +  s.charAt(s.length() -1 );
	}
}
