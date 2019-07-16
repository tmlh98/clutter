package cn.java.ss;

import java.util.Scanner;

/*
 *  X星球居民小区的楼房全是一样的，并且按矩阵样式排列。其楼房的编号为1,2,3...
	当排满一行时，从下一行相邻的楼往反方向排号。
	比如：当小区排号宽度为6时，开始情形如下：
		1  2  3  4  5  6
		12 11 10 9  8  7
		13 14 15 .....
	我们的问题是：已知了两个楼号m和n，需要求出它们之间的最短移动距离（不能斜线方向移动）
	输入为3个整数w m n，空格分开，都在1到10000范围内
	要求输出一个整数，表示m n 两楼间最短移动距离。
	例如：
	用户输入：
		6 8 2
	则，程序应该输出：
		4
 */
public class 移动距离 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int w = sc.nextInt();//每一列宽度
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int m1 = (m % w) == 0?m / w:(m / w)+ 1;//如果余数不为0，则需要进1
		int n1 = (n % w) == 0?n / w:(n / w)+ 1;
		
		int m2 = m1%2 == 1?(m % w == 0?w:m%w):(m % w == 0?m % w + 1:w -m % w + 1);
		
		int n2 = n1%2 == 1?(n % w == 0?w:n%w):(n % w == 0?n % w + 1:w -n % w + 1);
		
		System.out.println(m1 + " " +m2);
		System.out.println(n1 + " " +n2);
		System.out.println(Math.abs(m1 -n1) + Math.abs(m2 -n2));
		sc.close();
	}
}
