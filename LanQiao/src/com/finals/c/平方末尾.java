package com.finals.c;

import java.util.HashSet;

/*
	�ܹ���ʾΪĳ��������ƽ�������ֳ�Ϊ��ƽ������
	���磬25,64
	��Ȼ�޷�����˵��ĳ������ƽ���������������Զ϶�ĳ��������ƽ������
	��Ϊƽ������ĩλֻ�����ǣ�[0, 1, 4,  5, 6, 9] ��6�������е�ĳ����
	���ԣ�4325435332��Ȼ����ƽ������
	
	�������һ��2λ��2λ���ϵ����֣����ܸ���ĩλ����λ���϶�������ƽ������
	�����һ�£�һ��2λ���ϵ�ƽ�����������λ�ж����ֿ����ԣ�
	ע�⣺��Ҫ�ύ����һ����������ʾ2λ���ϵ�ƽ���������λ�Ĳ�ͬ�������
	��Ҫ��д�κζ������ݣ����磬˵���������ֵȣ�
	�𰸣�22
 */
public class ƽ��ĩβ {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		for (int i = 10; i < 100; i++) {
			String str= i * i + "";
			System.out.println(str + " :" + i);
			hs.add(str.substring(str.length()-2));
		}
		System.out.println(hs.size());
		
	}
}
