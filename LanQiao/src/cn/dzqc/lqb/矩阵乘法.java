package cn.dzqc.lqb;

import java.util.Scanner;

public class 矩阵乘法 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		//　第一行，空格隔开的三个正整数m,s,n（均不超过200）
		int ai=inScanner.nextInt();
		int aj=inScanner.nextInt();
		int [][]arr1=new int [ai][aj];
		//接下来2行，每行s个空格隔开的整数，表示矩阵A（i，j）。
		for (int i = 0; i < ai; i++) {
			for (int j = 0; j < aj; j++) {
				arr1[i][j]=inScanner.nextInt();
			}
		}
		int bi=inScanner.nextInt();
		int bj=inScanner.nextInt();
		int [][]arr2=new int [bi][bj];
		//接下来2行，每行n个空格隔开的整数，表示矩阵B（i，j）。
		for (int i = 0; i < bi; i++) {
			for (int j = 0; j < bj; j++) {
				arr2[i][j]=inScanner.nextInt();
			}
		}
		int [][]arr3=new int [bj][bi];
		//数组翻转90度
		for (int i = 0; i < bj; i++) {
			for (int j = 0; j < bi; j++) {
				arr3[i][j]=arr2[j][i];
			}
		}
		int arr4[][]=rlt(ai, bj,bi, arr1, arr3);
		//输出格式：m行，每行n个空格隔开的整数，输出相乘後的矩阵C（i，j）的值。
		for (int i = 0; i < ai; i++) {
			for (int j = 0; j < bj; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	static int [][] rlt(int m,int s,int c,int [][]arr1,int [][]arr2){
		int [][]newarr=new int[m][s];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < s; j++) {
				//累加返回值
				for (int j1 = 0; j1 < c; j1++) {
					newarr[i][j]+=arr1[i][j1]*arr2[j][j1];
				}
			}
		}
		return newarr;
	}
	
}
