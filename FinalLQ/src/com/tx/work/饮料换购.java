package com.tx.work;

import java.util.Scanner;

/*
 * ���������ϳ����ھٰ�һ�δ����Żݻ��������C�����ϣ�ƾ3��ƿ�ǿ����ٻ�һƿC�����ϣ����ҿ���һֱѭ����ȥ�������������ˡ�
	�������һ�£����С�����˷�ƿ�ǣ������زμӻ����ô����������ʼ�����nƿ���ϣ������һ���ܵõ�����ƿ���ϡ�
	
	���룺һ������n����ʾ��ʼ���������������0<n<10000��
	�����һ����������ʾʵ�ʵõ���������
	
	���磺
	�û����룺
	100
	����Ӧ�������
	149
	
	�û����룺
	101
	����Ӧ�������
	151
 */
public class ���ϻ��� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = getResult(n);
		
		System.out.println(result);
		sc.close();
	}
	
	//3��ƿ�ǿ��Ի�һƿ
	private static int getResult(int n) {
		int count = n;//ʵ�ʵõ���������
		
		int pg = n;//ƿ�ǵ�����
		
		while(pg >= 3){
			count += pg /3; 
			pg = pg / 3 + pg % 3;//��99������ƿ��ȡ�� 33��ƿ�Ǽ���   ���µ�һ��ƿ��
		}
		
		return count;
		
	}
}	
