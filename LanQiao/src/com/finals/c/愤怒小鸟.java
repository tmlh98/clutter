package com.finals.c;

/*
 * X�����ŭ��С��ϲ��ײ�𳵣�
 һ��ƽֱ�����������𳵼���� 1000 ��
 ���� ��������A��B�� ��ʱ�� 10��/�� �����ʻ��

 ��ŭ��С���A��������ʱ��50��/�룬ײ��B����
 Ȼ�󷵻�ȥײA�����ٷ���ȥײB�����������....
 ���������1�״�ͣ����

 �ʣ����ڼ��ŭ��С��ײ B �����ٴΣ�
 ע�⣺��Ҫ�ύ����һ����������ʾײB���Ĵ���������Ҫ��д�κ��������ݡ�
 */
public class ��ŭС�� {
	public static void main(String[] args) {
		double path=1000;
		int count = 0;
		while(path >= 1){
			path-=(path/60)*20;//��a��b
			path-=(path/60)*20;//��b��a
			count++;
		}
		System.out.println(count);
	}
}
