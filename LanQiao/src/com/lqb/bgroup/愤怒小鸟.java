package com.lqb.bgroup;

public class ��ŭС�� {
/*
 * һ��ƽֱ�����������𳵼���� 1000 ��
	���� ��������A��B�� ��ʱ�� 10��/�� �����ʻ��
	
	��ŭ��С���A��������ʱ��50��/�룬ײ��B����
	Ȼ�󷵻�ȥײA�����ٷ���ȥײB�����������....
	���������1�״�ͣ����
	
	�ʣ����ڼ��ŭ��С��ײ B �����ٴΣ�
 */
	public static void main(String[] args) {
		double path=1000;
		int count = 0;
		while(path >= 1){
			path-=(path/60)*20;//��a��b
			count++;
			path-=(path/60)*20;//��b��a
		}
		System.out.println(count);
	}
}
