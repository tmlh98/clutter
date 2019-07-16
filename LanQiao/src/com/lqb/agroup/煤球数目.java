package com.lqb.agroup;
/*
 * 有一堆煤球，堆成三角棱锥形。具体：
	第一层放1个，
	第二层3个（排列成三角形），
	第三层6个（排列成三角形），
	第四层10个（排列成三角形），
	....
	如果一共有100层，共有多少个煤球？
	
	请填表示煤球总数目的数字
*/
public class 煤球数目 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			count += result(i);
		}
		System.out.println(count);
		
	}
	public static int result(int n){
		if(n==1) return 1;
		return result(n-1) +n;
	}
}
