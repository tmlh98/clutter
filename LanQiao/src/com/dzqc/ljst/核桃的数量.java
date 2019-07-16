package com.dzqc.ljst;

import java.util.Scanner;

public class ºËÌÒµÄÊıÁ¿ {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		in.close();
		System.out.println( minMiM(minMiM(a, b), c));
	}
	static int minMiM(int m,int n){
		for (int i = m; i < m*n; i++) {
			if(i%m==0&&i%n==0){
				return i;
			}
		}
		return m*n;
	}
}
