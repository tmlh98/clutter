package cn.java.eight;

import java.util.Scanner;

/*
 * ����һ������ΪN�����У�A1, A2, �� AN���������һ��������������
 * Ai, Ai+1, �� Aj(i <= j)֮����K�ı��������Ǿͳ��������[i, j]��K�����䡣 
	��������������ܹ��ж��ٸ�K�������� 
	����
	��һ�а�����������N��K��(1 <= N, K <= 100000) 
	����N��ÿ�а���һ������Ai��(1 <= Ai <= 100000) 
	���
	���һ������������K���������Ŀ�� 
	���磬 
	���룺 
	5 2 
	1 
	2 
	3 
	4 
	5 
	����Ӧ������� 
	6
 */
public class k������ {
	static int [] arr;
	static int K;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		K = sc.nextInt();
		arr = new int [N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		run();
		System.out.println(count);
	}
	private static void run() {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
//				System.out.print(count );
				if(sum % K ==0)count++;
			}
			System.out.println();
		}
		
	}
}
