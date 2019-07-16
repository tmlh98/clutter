package com.tx.test;

import java.util.Arrays;

public class Main {
	public static int [][] reversal(int[][] aa){
		int[][] bb = new int [6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				bb[i][j] = aa[j][i]; 
			}
			
		}
		return bb;
	}
	
	public static void show(int [][] aa){
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa.length; j++) {
				System.out.print(aa[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
	}
	private static boolean equals(int [][] aa ,int [][]bb){
		int x = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(aa[i][j] == bb[i][j]) x ++;
			}
		}
		return x == 36;
	}
	public static void main(String[] args) {
		int [][]aa = new int[6][6];
		aa[0][1] = 1;
		aa[1][1] = 1;
		aa[4][1] = 1;
		aa[1][1] = 1;
		aa[5][1] = 1;
		aa[2][2] = 1;
		show(aa);
		int[][] bb = reversal(aa);
		int[][] cc = reversal(bb);
		int[][] dd = reversal(cc);
		int[][] ee = reversal(dd);
		show(ee);
		int[] a = new int [5];
		a[0]=1;
		int[] b = new int [5];
		b[0]=1;
		System.out.println(equals(aa,ee));
	}
}