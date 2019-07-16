package com.lqb.cgroup;

import java.util.Scanner;

public class 移动距离 {
	private static Scanner in= new Scanner(System.in);

	/*
	 * X星球居民小区的楼房全是一样的，并且按矩阵样式排列。其楼房的编号为1,2,3...
	 *  当排满一行时，从下一行相邻的楼往反方向排号。
	 *  比如：当小区排号宽度为6时，开始情形如下：
	 *  1  2  3  4  5  6
	 *  12 11 10 9  8  7
	 *  13 14 15 .....
	 *  我们的问题是：已知了两个楼号m和n，需要求出它们之间的最短移动距离（不能斜线方向移动）
	 *  输入为3个整数w m n，空格分开，都在1到10000范围内
	 *  要求输出一个整数，表示m n 两楼间最短移动距离。 
	 *  例如： 
	 *  用户输入： 6 8 2 则，
	 *  程序应该输出： 4 
	 */
	public static void main(String[] args) {
		int w=in.nextInt();//宽度
		int m=in.nextInt();
		int n=in.nextInt();
		int mRow=0;
		int nRow=0;
		//计算m当前行
		if(m%w==0)mRow=m/w;
		else mRow=m/w+1;
		//计算n当前行
		if(n%w==0)nRow=n/w;
		else nRow=n/w+1;
		int mLine=0;
		int nLine=0;
		//计算m当前列
		if(mRow%2==0)mLine=w-m%w+1;//奇数行
		else mLine=m%w;//偶数行
		//计算n当前列
		if(nRow%2==0)nLine=w-n%w+1;//奇数行
		else nLine=n%w;//偶数行
		int shortPath=Math.abs(mRow-nRow)+Math.abs(mLine-nLine);
		System.out.println(shortPath);
	}
}
