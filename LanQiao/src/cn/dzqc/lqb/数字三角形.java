package cn.dzqc.lqb;

import java.util.Scanner;

public class Êý×ÖÈý½ÇÐÎ {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int n=inScanner.nextInt();	
		int [][]twoarr=new int [n][n];
		for (int i = 0; i < twoarr.length; i++) {
			for (int j = 0; j <=i; j++) {
				twoarr[i][j]=inScanner.nextInt();		
			}
		}
		System.out.println(maxSum(twoarr));
	}
	
	static int maxSum(int[][]arr){
		for (int i = arr.length-1; i >0; i--) {
			for (int j = 0; j < i; j++) {
				arr[i-1][j]+=Math.max(arr[i][j], arr[i][j+1]);
			}
			
		}
		return arr[0][0];
	}

}
