package com.finals.c;

public class 埃及分数 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 10000; i++) {
			for (int j = 1; j < 10000; j++) {
				if( i == j)continue;
				if(i *j * 2 == (i + j) *45){
					System.out.println("1/"+i +" + "+" 1/" + j);
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}
/*
 * 古埃及曾经创造出灿烂的人类文明，他们的分数表示却很令人不解。古埃及喜欢把一个分数分解为类似： 1/a + 1/b 的格式。 这里，a 和 b
 * 必须是不同的两个整数，分子必须为 1 比如，2/15 一共有 4 种不同的分解法（姑且称为埃及分解法）： 
 * 1/8 + 1/120
 * 1/9 + 1/45
 * 1/10 + 1/30 
 * 1/12 + 1/20 那么， 2/45 一共有多少个不同的埃及分解呢（满足加法交换律的算同种分解）？
 * 请直接提交该整数（千万不要提交详细的分解式！）。
 */