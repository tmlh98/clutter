package cn.java.ss;

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
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0,count =0;
		while(a >= 3){
			count += a;
			b += a % 3;
			a = a/3 + b/3;
		}
		while(b >= 3){
			a = b / 3;
			b = b % 3 + a;
			count += a;
		}
		System.out.println(count);
		sc.close();
	}
}
