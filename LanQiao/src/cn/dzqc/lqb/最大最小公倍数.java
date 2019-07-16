package cn.dzqc.lqb;

import java.util.Scanner;

public class 最大最小公倍数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。1 <= N <= 1000000。
		Scanner inScanner=new Scanner(System.in);
		long n = inScanner.nextLong();
		long num = 0;
		if (n<=2) {
			num=n;
		}else if (n%2==1) {//你是奇数
			num = n*(n-1)*(n-2);
		}else {
			if (n%3==0) {//n是3的倍数
				num = (n-1)*(n-2)*(n-3);
			}else {//8
				num=n*(n-1)*(n-3);
			}
		}
		System.out.println(num);

	}

}
