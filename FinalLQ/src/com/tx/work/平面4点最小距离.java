package com.tx.work;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ��֪ƽ�������ɸ�������ꡣ
 * ��Ҫ��������е�����У�4�����ƽ���������Сֵ���������룬����2λС������
 * ������4���㣺a,b,c,d, ��ƽ��������ָ��ab, ac, ad, bc, bd, cd ��6�������ƽ��ֵ��
 * ÿ����������ʾΪ��������,�����������ȡֵ��Χ�ǣ�1~1000
 * ���磬����������룺
 * 10,10
 * 20,20
 * 80,50
 * 10,20
 * 20,10
 * �����Ӧ�������
 * 11.38
 */
public class ƽ��4����С���� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(sc.hasNext()){
			list.add(sc.next());
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		sc.close();
	}
}
