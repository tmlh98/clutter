package com.lqb.agroup;
/*
 * �����һ����������ÿһλ��ƽ��������ͣ��õ�һ���µ���������
	���²���������������ͬ���Ĵ���
	���һ������ᷢ�֣����ܿ�ʼȡ����ʲô���֣�
	���������������1����������ͬһ��ѭ��Ȧ��
	��д�����ѭ��Ȧ�������Ǹ����֡�
	����д��������֡�
 */
public class ƽ����Ȧ {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(result(i));
		}
	}
	public static int result(int num){
		int j = 0;
		int count = 0;
		while(num!=0){
			j=num%10;
			count+=j*j;
			num/=10;
		}
		return count;
		
	}
}
