package com.tx.work;

import java.math.BigInteger;
import java.util.Scanner;

import javax.jws.Oneway;

/*
 *  为什么1小时有60分钟，而不是100分钟呢？这是历史上的习惯导致。
 *  但也并非纯粹的偶然：60是个优秀的数字，它的因子比较多。
 *  事实上，它是1至6的每个数字的倍数。即1,2,3,4,5,6都是可以除尽60。
 *  我们希望寻找到能除尽1至n的的每个数字的最小整数。
 *  不要小看这个数字，它可能十分大，比如n=100, 则该数为：
 *  69720375229712477164533808935312303556800
 *  请编写程序，实现对用户输入的 n （n<100）求出1~n的最小公倍数。
 *  
 *  例如：
 *  用户输入：
 *  6
 *  程序输出：
 *  60
 * 
 *  用户输入：
 *  10
 *  程序输出：
 *  2520
 */
public class 连续数的公倍数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		BigInteger bg = BigInteger.ONE;
		
		for (int i = 2; i <= n; i++) {
			BigInteger gcd = bg.gcd(new BigInteger("" + i));//2
			bg = bg.multiply(new BigInteger("" + i ));//24
			bg = bg.divide(gcd);//12
		}
		System.out.println(bg);
		sc.close();
	}
}
