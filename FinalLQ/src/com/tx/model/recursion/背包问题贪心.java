package com.tx.model.recursion;

import java.util.Scanner;

public class 背包问题贪心 {
	
	static int MAX_Weight = 0;//背包的最大可容重量
	static int[] weights ;//已知物品的重量
	static int[] values ;//物品的价值
	
	private static void greed(){
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
		int value = getResult(index , 0 , MAX_Weight);
		/*int max = MAX_Weight;
		//开始装配
		for (int i = 0; i < index.length; i++) {
			if(weights[index[i]] < max){
				max -= weights[index[i]];
				value += values[index[i]];
			}
		}*/
		System.out.println(value);
		
	}

	private static int getResult(int[] index, int i ,int max) {
		//每次可以选择拿，也可以选择不拿
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






	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		MAX_Weight = sc.nextInt();
		weights = new int [N];
		values = new int [N];
		for (int i = 0; i < N; i++) {
			 weights[i] = sc.nextInt();
			 values[i] = sc.nextInt();
		}
		greed();
		sc.close();
	}
	
	
}
