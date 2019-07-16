package cn.java.ss;

import java.util.Scanner;
/*
 * �������һ��������N��
	�����ż����ִ�У� N / 2
	�����������ִ�У� N * 3 + 1
	
	���ɵ��µ�������ִ��ͬ���Ķ�����ѭ��������
	
	ͨ���۲췢�֣�������ֻ�һ����������ܸߣ�
	һ����ֽ���������
	��������������ģ������ձػ��䵽��1��
	���е���С���������ڱ������з������������ӡ�
	
	����N=9
	9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
	���Կ�����N=9��ʱ�������С��������߳嵽��52����߶ȡ�
	
	�����ʽ��
	һ��������N��N<1000000��
	�����ʽ��
	һ������������ʾ������N�����֣������������任�����У���߳嵽�˶��١�
	
	���磬���룺
	10 
	����Ӧ�������
	52
 */
public class ������ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = 0;
		for (int i = 1; i <= N; i++) {
			int max = f(i);
			if(m < max) m =max;
		}
		System.out.println(m);
		sc.close();
	}

	private static int f(int n) {
		int max = n;
		while(n != 1){
			if(n % 2 == 0) n /= 2;
			else n = n*3 + 1;
			
			if(n > max) max = n;
		}
		return max;
	}
	
}
