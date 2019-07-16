package com.tx.work;

import java.util.Scanner;

public class 买不到的数目_完全背包 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[2];
		a[0] = sc.nextInt();//4
		a[1] = sc.nextInt();//7
		int s[] = new int[1000000];
		s[a[0]] = s[a[1]] = 1;
		int m = a[0] * a[1];
		int k = 0;
		for (int i = 1; i < m; i++) {
			for (int j = 0; j <= 1; j++)
				if (a[j] < i)
					s[i] += s[i - a[j]];
			if (s[i] == 0)
				k = i;
		}
		System.out.println(k);
		for (int i = 0; i <  m; i++) {
			System.out.print(s[i] + " ");
		}
		sc.close();
	}
}
