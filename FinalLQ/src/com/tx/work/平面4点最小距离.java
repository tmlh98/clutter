package com.tx.work;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 已知平面上若干个点的坐标。
 * 需要求出在所有的组合中，4个点间平均距离的最小值（四舍五入，保留2位小数）。
 * 比如有4个点：a,b,c,d, 则平均距离是指：ab, ac, ad, bc, bd, cd 这6个距离的平均值。
 * 每个点的坐标表示为：横坐标,纵坐标坐标的取值范围是：1~1000
 * 例如，如果程序输入：
 * 10,10
 * 20,20
 * 80,50
 * 10,20
 * 20,10
 * 则程序应该输出：
 * 11.38
 */
public class 平面4点最小距离 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(sc.hasNext()){
			list.add(sc.next());
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		sc.close();
	}
}
