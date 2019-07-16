package com.tx.work;
/*
 * 小明被劫持到X赌城，被迫与其他3人玩牌。
 * 一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
 * 这时，小明脑子里突然冒出一个问题：
 * 如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？
 */
public class 牌型种数_DFS {

	private static  int count = 0;
	
	public static void main(String[] args) {
		dfs(0 , 0);
		System.out.println(count);
	}

	/*
	 * dfs的深搜的是牌的类型，每种牌可以选0~4种，选的牌的总数相加==13
	 * type 表示牌的点数   sum 表示牌选了几张
	 */
	private static void dfs(int type , int n) {
		if(type > 13)return;
		if(n > 13)return;
		if(type == 13 && n == 13){
			count ++;
			return;
		}
		for (int i = 0; i < 5; i++) {
			dfs(type + 1 , n  + i);
		}
	} 
}
