package com.lqb.cgroup;

import java.util.Scanner;

/*
 * �������һ��������N��
 �����ż����ִ�У� N / 2
 �����������ִ�У� N * 3 + 1

 ���ɵ��µ�������ִ��ͬ���Ķ�����ѭ��������

 ͨ���۲췢�֣�������ֻ�һ����������ܸߣ�һ����ֽ���������
 ��������������ģ������ձػ��䵽��1�����е���С���������ڱ������з������������ӡ�

 ����N=9 9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
 ���Կ�����N=9��ʱ�������С��������߳嵽��52����߶ȡ�

 �����ʽ��
 һ��������N��N<1000000��
 �����ʽ��
 һ������������ʾ������N�����֣������������任�����У���߳嵽�˶��١�
 ���磬���룺 10 ����Ӧ������� 52
 */
public class ������ {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int no = getResult(num);
		System.out.println(no);
		sc.close();
	}

	private static int getResult(int num) {
		int max = 0;
		while (num != 1) {
			System.out.print(num+" ");
			if(num %2 == 0){
				num = num / 2;
				max = Math.max(num, max);
			}else{
				num = num * 3 + 1;
				max = Math.max(num, max);
			} 
		}
		
		return max;
	}
}
