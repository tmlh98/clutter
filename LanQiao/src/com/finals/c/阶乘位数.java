package com.finals.c;

import java.math.BigInteger;

public class �׳�λ�� {
	
	public static void main(String[] args) {
		
		BigInteger bg = BigInteger.ONE;
		for (int i = 50; i > 1; i--) {
			BigInteger bg2 = new BigInteger(i + "");
			bg = bg.multiply(bg2);
		}
		int length = (new BigInteger(bg.toString(), 10).toString(2)).toString().length();

		System.out.println(length);
	}
}
/*
9�Ľ׳˵��ڣ�362880
���Ķ����Ʊ�ʾΪ��1011000100110000000
������ֹ���19λ��
������㣬9999 �Ľ׳˵Ķ����Ʊ�ʾһ���ж���λ��
ע�⣺��Ҫ�ύ����һ����������Ҫ��д�κ��޹����ݣ�����˵�����͵ȣ�
�𰸣�118445
*/