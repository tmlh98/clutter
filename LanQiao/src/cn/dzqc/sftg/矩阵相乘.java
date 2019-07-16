package cn.dzqc.sftg;

import java.util.Scanner;

public class 矩阵相乘 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		//　第一行，空格隔开的三个正整数m,s,n（均不超过200）
		int m=inScanner.nextInt();
		int s=inScanner.nextInt();
		int n=inScanner.nextInt();
		int [][]arr1=new int [m][s];
		int [][]arr2=new int [s][n];
		int [][]arr3=new int [n][s];
		//接下来m行，每行s个空格隔开的整数，表示矩阵A（i，j）。
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < s; j++) {
				arr1[i][j]=inScanner.nextInt();
			}
		}
		//接下来s行，每行n个空格隔开的整数，表示矩阵B（i，j）。
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < n; j++) {
				arr2[i][j]=inScanner.nextInt();
			}
		}
		//数组翻转90度
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < s; j++) {
				arr3[i][j]=arr2[j][i];
			}
		}
		int arr4[][]=rlt(m, s, n, arr1, arr3);
		//输出格式：m行，每行n个空格隔开的整数，输出相乘後的矩阵C（i，j）的值。
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.err.println();
		}
		
	}
	static int [][] rlt(int m,int s,int n,int [][]arr1,int [][]arr2){
		int [][]newarr=new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				//累加返回值
				for (int j1 = 0; j1 < s; j1++) {
					newarr[i][j]+=arr1[i][j1]*arr2[j][j1];
				}
			}
		}
		return newarr;
	}
	
}
