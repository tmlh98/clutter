package cn.java.eight;

import java.util.Scanner;

/*
 * ��ͯ��������KλС���ѵ�С�������͡�С���ó�����ص��ɿ����д�С�����ǡ� 
	С��һ����N���ɿ��������е�i����Hi x Wi�ķ�����ɵĳ����Ρ�
	Ϊ�˹�ƽ�����С����Ҫ���� N ���ɿ������г�K���ɿ����ָ�С�����ǡ��г����ɿ�����Ҫ���㣺
	1. ��״�������Σ��߳�������  
	2. ��С��ͬ  
	����һ��6x5���ɿ��������г�6��2x2���ɿ�������2��3x3���ɿ�����
	��ȻС�����Ƕ�ϣ���õ����ɿ��������ܴ����ܰ�СHi��������ı߳��Ƕ���ô��
	���� 
	��һ�а�����������N��K��(1 <= N, K <= 100000) 
	����N��ÿ�а�����������Hi��Wi��(1 <= Hi, Wi <= 100000) 
	���뱣֤ÿλС���������ܻ��һ��1x1���ɿ����� 
	��� 
	����г����������ɿ��������ܵı߳���
	�������룺 
	2 10 
	6 5 
	5 6 
	��������� 
	2
 */
public class ���ɿ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] qkl = new int [n][2];
		for (int i = 0; i < n; i++) {
			qkl[i][0] = sc.nextInt();
			qkl[i][1] = sc.nextInt();
		}
		System.out.println(run(qkl , k));
		
	}

	private static int run(int[][] b, int k) {
		int max = 0;
		for (int i = 2;; i++) {//����1*1�����Դ�2��ʼ,������ɵĿ���
			int x = 0;
			for (int j = 0; j < b.length; j++) {
				if(b[j][0]/i>0&&b[j][1]/i>0)
					x += (b[j][0]/i)*(b[j][1]/i);//�ܿ��� 
			}
			if(x < k){
				max = i -1;
				break;
			}
		}
		return max;
	}
}
