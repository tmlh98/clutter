package cn.dzqc.lqb;

import java.util.Scanner;

public class ¹ØÁª¾ØÕó {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int arr[][]=new int [n][m];
		int l=0;
		int r=0;
		for (int i = 0; i < m; i++) {
				l=	in.nextInt();
				r=  in.nextInt();
				arr[l-1][i]=1;
				arr[r-1][i]=-1;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
