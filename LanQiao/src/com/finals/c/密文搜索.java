package com.finals.c;

import java.util.HashSet;
import java.util.Scanner;

/*
 * ����Ħ˹��X���յ�һ�����ϣ�ȫ����Сд��ĸ��ɡ�
	���������ṩ����һ�����ϣ���೤��Ϊ8�������б�
	����Ħ˹���֣���Щ�����Ǳ����Һ���������ǰ�Ƿ������еġ�
	�����дһ�����򣬴ӵ�һ�������������������������λ�á�Ҫ����������������п����ԡ�
	���ݸ�ʽ��
	
	�����һ�У�һ���ַ���s��ȫ����Сд��ĸ��ɣ�����С��1024*1024
	������һ����һ������n,��ʾ������n�����룬1<=n<=1000
	��������n���ַ���������Сд��ĸ��ɣ����ȶ�Ϊ8
	
	Ҫ�������
	һ������, ��ʾÿ�����������������s��ƥ��������ܺ͡�
	���磺
	�û����룺
	aaaabbbbaabbcccc
	2
	aaaabbbb
	abcabccc
	
	�����Ӧ�������
	4
	
	������Ϊ����һ������ƥ����3�Σ��ڶ�������ƥ����1�Σ�һ��4�Ρ�
 */
public class �������� {
	
	static HashSet<String> hs = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			char[] c = sc.next().toCharArray();
			f(c , 0);
		}
		int count = 0;
		
		for (String string : hs) {
			if(s.contains(string))
				count ++;
		}
		System.out.println(count);
		sc.close();
	}
	//�������ִ�����
	private static void f(char[] c,int k) {
		if(c.length -1 == k){
			hs.add(new String(c));//ȥ���ظ�
			return;
		}
		for (int i = k; i < c.length; i++) {
			swap(c , i , k);
			f(c, k + 1);
			swap(c , i , k);
		}
	}

	//����
	private static void swap(char[] c, int i, int k) {
		char temp = c[i];
		c[i] = c[k];
		c[k] = temp;
	}

		
}
