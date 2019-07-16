package com.tx.work;

import java.util.Scanner;

public class ºÏ¸ùÖ²Îï {
	
	static int[] tb;
	static int num = 0;
	
	static void f(int a , int b){
		int ra = find(a);
		int rb = find(b);
		if(ra == rb )return;
		union(ra,rb);
		num++;
		
	}
	
	private static void union(int ra, int rb) {
		tb[ra] = rb;
	}

	private static int find(int x) {
		if(tb[x] == 0)return x;
		return tb[x] = find(tb[x]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		tb = new int[m * n + 1];
		
		for (int i = 0; i < k; i++) {
			f(sc.nextInt() , sc.nextInt());
		}
		System.out.println(m * n -num );
		
		for (int i = 0; i < tb.length; i++) {
			System.out.println(tb[i] + " ");
		}
		sc.close();
	}
	
}
