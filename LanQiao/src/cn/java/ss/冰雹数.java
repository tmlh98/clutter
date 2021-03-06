package cn.java.ss;

import java.util.Scanner;
/*
 * 任意给定一个正整数N，
	如果是偶数，执行： N / 2
	如果是奇数，执行： N * 3 + 1
	
	生成的新的数字再执行同样的动作，循环往复。
	
	通过观察发现，这个数字会一会儿上升到很高，
	一会儿又降落下来。
	就这样起起落落的，但最终必会落到“1”
	这有点像小冰雹粒子在冰雹云中翻滚增长的样子。
	
	比如N=9
	9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
	可以看到，N=9的时候，这个“小冰雹”最高冲到了52这个高度。
	
	输入格式：
	一个正整数N（N<1000000）
	输出格式：
	一个正整数，表示不大于N的数字，经过冰雹数变换过程中，最高冲到了多少。
	
	例如，输入：
	10 
	程序应该输出：
	52
 */
public class 冰雹数 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = 0;
		for (int i = 1; i <= N; i++) {
			int max = f(i);
			if(m < max) m =max;
		}
		System.out.println(m);
		sc.close();
	}

	private static int f(int n) {
		int max = n;
		while(n != 1){
			if(n % 2 == 0) n /= 2;
			else n = n*3 + 1;
			
			if(n > max) max = n;
		}
		return max;
	}
	
}
