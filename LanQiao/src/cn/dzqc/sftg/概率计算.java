package cn.dzqc.sftg;

import java.util.Scanner;

/*
 * 生成n个∈[a,b]的随机整数，输出它们的和为x的概率。
 * 输出一行包2 1 3 4
 * 样例输出0.3333
 */
public class 概率计算 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int x = in.nextInt();
		System.out.println(getResult(n, a, b, x));
		in.close();
	}

	private static double getResult(int n, int a, int b, int x) {
		
		
		return 0.0;
	}

}
