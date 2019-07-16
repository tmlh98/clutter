package com.lqb.cgroup;

import java.util.Scanner;

/*
 * 小明希望用星号拼凑，打印出一个大X，他要求能够控制笔画的宽度和整个字的高度。
 * 为了便于比对空格，所有的空白位置都以句点符来代替。
 *
 *要求输入两个整数m n，表示笔的宽度，X的高度。用空格分开(0<m<n, 3<n<1000, 保证n是奇数)
 *要求输出一个大X
 *
 *例如，用户输入：
 *3 9
 *程序应该输出：
  ***.....***
  .***...***.
  ..***.***..
  ...*****...
  ....***....
  ...*****...
  ..***.***..
  .***...***.
  ***.....***
 */
public class 打印大X {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		//构造一个二维数组，默认全部为.
		char[][] X=new char[n][n+m-1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n+m-1; j++) {
				X[i][j]='.';
			}
		}
		//具体操作
		for (int i = 0; i < n ; i++) {
			for (int j = i; j < i+m; j++) {
				X[i][j] = '*';
			}
		}
		
		for (int i = 0; i < n ; i++) {
			for (int j = n+m-1-i-m; j < n+m-1-i; j++) {
				X[i][j] = '*';
			}
		}

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n+m-1; j++) {
				System.out.print(X[i][j]);
			}
			System.out.println();
		}
	}
}
