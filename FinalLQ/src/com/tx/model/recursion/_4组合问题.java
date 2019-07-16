package com.tx.model.recursion;

public class _4组合问题 {
	// m个不同的球中，取n个（不放回），有多少种取法
	// 假想有一个特殊的“红球”
	// 任务划分为： 1.如果红球必须取，多少种
	// 2. 如果红球必须不取，多少种
	
	public static int f(int m , int n){
		if(n == 1 || n == m) return 1;
		return f(m -1, n) + f(m -1, n -1);
	}
	public static void main(String[] args) {
		System.out.println(f(5, 2));
		
		// 固定数目的组合问题
		// ABCDE 中取3个
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = (char)(i + 1); j <= 'E'; j++) {
				for (char k = (char)(j + 1); k <= 'E'; k++) {
					System.out.println(i+""+j+""+k);
				}
			}
		}
	}
}
