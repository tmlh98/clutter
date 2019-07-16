package cn.dzqc.lqb;

import java.util.Scanner;

public class 最小公倍数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int m=inScanner.nextInt();
		int n=inScanner.nextInt();
		System.out.println(minMiM(m, n));

	}
	static int minMiM(int m,int n){
		for (int i = m; i < m*n; i++) {
			if(i%m==0&&i%n==0){
				return i;
			}
		}
		return m*n;
	}
}
