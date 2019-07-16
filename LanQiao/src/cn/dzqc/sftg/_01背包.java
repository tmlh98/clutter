package cn.dzqc.sftg;

import java.util.Scanner;

/**
 *给定N个物品,每个物品有一个重量W和一个价值V.你有一个能装M重量的背包.问怎么装使得所装价值最大.每个物品只有一个.
 *输入的第一行包含两个整数n, m，分别表示物品的个数和背包能装重量。
 *以后N行每行两个数Wi和Vi,表示物品的重量和价值
 */
public class _01背包 {
	static int[] weights ;//已知物品的重量
	static int[] values ;//物品的价值
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
		double[] xjb = new double[n];//性价比数组
		int[] index = new int[n];//用于排序存放下标
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
			int v1 =  values[index[i]] + getResult(index, i + 1, max - weights[index[i]]);//可以选择拿
			int v2 =  getResult(index, i + 1, max);//可以选择不拿
			return v1 > v2 ? v1 : v2;
		}
		return 0;
	}
}
