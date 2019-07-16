package com.finals.template;

import java.util.Scanner;

/*
 * ����һ�����󣬶�����ͨ�������������ڣ�����ֵ��ͬ��
	���������һ�ŵ�ͼ����ͬ������Ϳ�Բ�ͬ��ɫ��
	���룺
	����N, (N<50)��ʾ�����������
	������N�У�ÿ��N���ַ����������е�Ԫ��
	������һ������M��(M<1000)��ʾѯ����
	������M�У�ÿ�д���һ��ѯ�ʣ�
	��ʽΪ4��������y1,x1,y2,x2��
	��ʾ(��y1��,��x1��) �� (��y2��,��x2��) �Ƿ���ͨ��
	��ͨ���true������false
	
	���磺
	10
	0010000000
	0011100000
	0000111110
	0001100010
	1111010010
	0000010010
	0000010011
	0111111000
	0000010000
	0000000000
	3
	0 0 9 9
	0 2 6 8
	4 4 4 6
	
	����Ӧ�������
	false
	true
	true
 */
public class ����ͨ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] data = new char[n][];
		for (int i = 0; i < n; i++) {
			data[i] = sc.next().toCharArray();
		}
		
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int y1 = sc.nextInt();
			int x1 = sc.nextInt();
			int y2 = sc.nextInt();
			int x2 = sc.nextInt();
			
			System.out.println(f(data,y1,x1,y2,x2));
		}
		sc.close();
		
	}
	 
	private static boolean f(char[][] data, int y1, int x1, int y2, int x2) {
		if(y1 == y2 && x1 == x2) return true;
		char old = data[y1][x1];
		data[y1][x1] = '*';//���
		try{
			if(y1>0 && data[y1-1][x1] ==old && f(data, y1 -1, x1, y2, x2))return true;
			if(y1<data.length -1 && data[y1+1][x1] ==old && f(data, y1+1, x1, y2, x2))return true;
			if(x1>0 && data[y1][x1 -1] ==old && f(data, y1, x1 -1, y2, x2))return true;
			if(x1<data.length-1 && data[y1][x1 + 1] ==old && f(data, y1, x1 + 1, y2, x2))return true;
		}finally{
			data[y1][x1] = old;
		}
		return false;
	}
}
