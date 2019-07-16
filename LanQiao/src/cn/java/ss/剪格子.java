package cn.java.ss;

import java.util.Scanner;
/*
 *  	+--*--+--+
 		|10* 1|52|
 		+--****--+
 		|20|30* 1|
 		*******--+
 		| 1| 2| 3|
 		+--+--+--+
 ��������ͼ�е��Ǻ��߼������õ��������֣�ÿ�����ֵ����ֺͶ���60��
 �����Ҫ������������ж����Ը�����m x n �ĸ����е��������Ƿ���Էָ�Ϊ�������֣�ʹ����������������ֺ���ȡ�
 ������ڶ��ֽ��������������ϽǸ��ӵ��Ǹ���������ĸ��ӵ���С��Ŀ��
 ����޷��ָ����� 0��
 �����ʽ
 �����ȶ����������� m n �ÿո�ָ� (m,n<10)��
 ��������n�У�ÿ��m�����������ÿո�ֿ���ÿ������������10000��
 �����ʽ
 ���һ����������ʾ�����н��У��������Ͻǵķָ������ܰ�������С�ĸ�����Ŀ��
 */
public class ������ {
	static int m , n;
	static int min  ;//��С�ĸ�����
	static int[][] gezi;
	static int[][] ed = new int [n][m];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int sum = 0;//��ͼ���������ƽ��ֵ
		gezi = new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				gezi[i][j] = sc.nextInt();
				sum += gezi[i][j];
			}
		}
		getter(0, 0, sum / 2, 0, new int[n][m]);
		System.out.println(min);
		sc.close();
	}

	private static void getter(int nn, int mm, int s, int c, int[][] ed) {
		//�ﵽƽ��ֵ
		if( s == 0)min = c;
		if(s < 0)return;//��������
		//�������������
		if(mm < m && nn < n && mm >= 0 && nn >= 0){
			if(ed[nn][mm] == 0){
				s -= gezi[nn][mm];
				ed[nn][mm] = 1;//���Ϊ1��ʱ
				getter(nn + 1, mm, s, c + 1, ed);
				getter(nn - 1, mm, s, c + 1, ed);
				getter(nn, mm + 1, s, c + 1, ed);
				getter(nn, mm - 1, s, c + 1, ed);
				ed[nn][mm] = 0;
			}
		}
		return ;
	}
}
