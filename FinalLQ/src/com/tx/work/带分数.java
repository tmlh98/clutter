package com.tx.work;

import java.util.Scanner;
public class 带分数 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 long begin = System.currentTimeMillis();
		 getResult(n);
		 long end = System.currentTimeMillis();
		 System.out.println(count);
		 System.out.println(end - begin);
		 sc.close();
	}

	/*
	 * 穷举整数部分和分母，然后计算分子
	 */
	static int count = 0;
	static String[] arr = new String[]{"1","2","3","4","5","6","7","8","9"}; 
	private static void getResult(int n) {
		for (int i = 1; i < n; i++) {//整数部分的可能87
			if(isContainZero(i))continue;
			for (int j = 2; j < 10000; j++) {//分母
				if(isContainZero(j))continue;
				int t = (n - i) * j;//分子
				if(isContainZero(t))continue;
				String str = "" + i + j + t;
				if(str.length() != 9)continue;
				if(check(str)) {
//					System.out.println(n + " = " + i + " + " + t + "/" + j);
					count ++;
				}
			}
		}
	}
	private static boolean check(String str) {
		for (int i = 0; i < arr.length; i++) {
			if(str.indexOf(arr[i]) == -1)return false;
		}
		return true;
	}
	//检查是否包含0
	private static boolean isContainZero(int i) {
		String str = i +"";
		if(str.indexOf("0") != -1)return true;
		return false;
	}
	
	
}
/*
 * 100 可以表示为带分数的形式：100 = 3 + 69258 / 714。 还可以表示为：100 = 82 + 3546 / 197.
 * 注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。 类似这样的带分数，100 有 11 种表示法。
 */