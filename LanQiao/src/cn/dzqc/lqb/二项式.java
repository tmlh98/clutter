package cn.dzqc.lqb;

import java.util.Scanner;

public class ¶şÏîÊ½ {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int k=inScanner.nextInt();
		int n=inScanner.nextInt();
		System.out.println(er(k, n));

	}
	static int er(int k,int n){
		if(k==0||k==n){
			return 1;
		}
		if(k>n){
			return 0;
		}
		return er(k, n-1)+er(k-1, n-1);
	}
}
