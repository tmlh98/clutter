package cn.java.ss;

import java.util.Scanner;

/*
 * С���������Ŀ����������3�������顣���ڽ������춼�ڼӰ��ء�Ϊ����ʿ����С�Ŵ����ÿ���鷢һ�����ң��ݴ����ܲ��ԣ�������Ҫ���ǣ�

 1. ����ĺ�������������ͬ
 2. �����ڱ�����ƽ�ֺ��ң���Ȼ�ǲ��ܴ���ģ�
 3. �����ṩ����1,2��������С��������Լ�ָ����

 ����ӱ�׼������룺
 a b c
 a,b,c��������������ʾÿ�������ڼӰ���������ÿո�ֿ���a,b,c<30��

 ���������
 һ������������ʾÿ�����ҵ�������

 ���磺
 �û����룺
 2 4 5

 ���������
 20

 */
public class ���ҵ����� {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(getResult(a, getResult(c, b)));
		sc.close();
	}
	static int getResult(int a,int b){
		for (int i = a; i <= a*b; i++) {
			if(i%a==0&&i%b==0){
				return i;
			}
		}
		return a*b;
	}
}
