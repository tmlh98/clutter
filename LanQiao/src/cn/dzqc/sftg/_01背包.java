package cn.dzqc.sftg;

import java.util.Scanner;

/**
 *����N����Ʒ,ÿ����Ʒ��һ������W��һ����ֵV.����һ����װM�����ı���.����ôװʹ����װ��ֵ���.ÿ����Ʒֻ��һ��.
 *����ĵ�һ�а�����������n, m���ֱ��ʾ��Ʒ�ĸ����ͱ�����װ������
 *�Ժ�N��ÿ��������Wi��Vi,��ʾ��Ʒ�������ͼ�ֵ
 */
public class _01���� {
	static int[] weights ;//��֪��Ʒ������
	static int[] values ;//��Ʒ�ļ�ֵ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int MAX_Weight = sc.nextInt();
		weights = new int [N];
		values = new int [N];
		for (int i = 0; i < N; i++) {
			 weights[i] = sc.nextInt();
			 values[i] = sc.nextInt();
		}
		int val = greed(weights , values , MAX_Weight);
		System.out.println(val);
		sc.close();
	}

	private static int greed(int[] weights, int[] values, int MAX_Weight) {
		int n = weights.length;
		double[] xjb = new double[n];//�Լ۱�����
		int[] index = new int[n];//�����������±�
		for (int i = 0; i < xjb.length; i++) {
			xjb[i] = (double)values[i] / weights[i];
			index[i] = i;
		}
		
		for (int i = 0; i < index.length -1; i++) {
			for (int j = i; j < index.length -1; j++) {
				if(xjb[i] < xjb[j]){
					double temp = xjb[i];
					xjb[i] = xjb[j];
					xjb[j] = temp;
					int temp2 = index[i];
					index[i] = index[j];
					index[j] = temp2;
				}
			}
		}
		return getResult(index , 0 , MAX_Weight);
	}

	private static int getResult(int[] index, int i, int max) {
		if(i >= index.length){
			return 0;
		}
		
		if(weights[index[i]] <= max){
			int v1 =  values[index[i]] + getResult(index, i + 1, max - weights[index[i]]);//����ѡ����
			int v2 =  getResult(index, i + 1, max);//����ѡ����
			return v1 > v2 ? v1 : v2;
		}
		return 0;
	}
}
