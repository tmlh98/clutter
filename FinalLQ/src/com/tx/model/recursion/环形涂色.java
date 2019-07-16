package com.tx.model.recursion;

import java.util.HashMap;

/*
 * 如图，组成环形的格子需要涂3种颜色。
 * 	它们的编号分别是1~14
 * 	相邻的格子不能用相同的颜色。
 * 	涂色方案的数目是： 16386
 * 	当格子数目为50的时候，求涂色方案总数。
 */
public class 环形涂色 {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			System.out.println(f(i));
		}
	}
	static HashMap<Integer, Long> hs = new HashMap<Integer, Long>();
	private static long f(int n) {
		if(hs.containsKey(n)){
			return hs.get(n);
		} 
		
		if(n == 1) return 3;
		if(n == 2 || n == 3) return 6;
		hs.put(n,  (f(n - 2) * 2 + f(n -1)));
		return hs.get(n);
	}
}
