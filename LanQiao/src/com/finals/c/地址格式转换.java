package com.finals.c;

import java.util.Scanner;

public class ��ַ��ʽת�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(getResult(str));
		sc.close();
	}

	private static String getResult(String str) {
		String a = "";
		int b = 0;
		for (int i = 2; i < str.length(); i++) {
			if(str.charAt(i) == 'C'){
				a = str.substring(1,i);
				b = Integer.valueOf(str.substring(i +1));
				break;
			}
		}
		String result = "";
		while(b /26 >0){
			result = (char)(64 + b % 26) + result;
			b /= 26;
		}
		if(b < 26)result += (char)(64 + b);
		return result + a;
	}
}
/*
	Excel����õİ칫�����ÿ����Ԫ����Ψһ�ĵ�ַ��ʾ��
	���磺��12�е�4�б�ʾΪ����D12������5�е�255�б�ʾΪ��IU5����
	��ʵ�ϣ�Excel�ṩ�����ֵ�ַ��ʾ����������һ�ֱ�ʾ������RC��ʽ��ַ��
	 ��12�е�4�б�ʾΪ����R12C4������5�е�255�б�ʾΪ��R5C255����
	��������ǣ���д����ʵ�ִ�RC��ַ��ʽ�������ַ��ʽ��ת����
	�����롢�����ʽҪ��
	�û�������һ������n��n<100������ʾ��������n���������ݡ�
	���������n��������RC��ʽ��Excel��Ԫ���ַ��ʾ����
	���������n�����ݣ�ÿ����ת����ĳ����ַ��ʾ����
	���磺�û����룺
	R12C4
	R5C255
	�����Ӧ�������
	D12
	IU5
*/