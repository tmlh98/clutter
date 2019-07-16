package com.tx.work;

import java.util.Scanner;

public class ¬Ï“œ∏–√∞ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int L = 0, R = 0;
		int n = sc.nextInt();
		int[] kk = new int[n + 1];
		for (int i = 1; i <= n; i++)
			kk[i] = sc.nextInt();
		
		for (int i = 2; i <= n; i++) {
			if (kk[1] > 0) {
				if (Math.abs(kk[1]) < Math.abs(kk[i]) && kk[i] < 0)
					R++;
				if (Math.abs(kk[1]) > Math.abs(kk[i]) && kk[i] > 0)
					L++;
			} else {
				if (Math.abs(kk[1]) < Math.abs(kk[i]) && kk[i] < 0)
					R++;
				if (Math.abs(kk[1]) > Math.abs(kk[i]) && kk[i] > 0)
					L++;
			}
		}
		if (L != 0 || R != 0)
			System.out.println(R + L + 1);
		else
			System.out.println(1);
		
		sc.close();
	}
}
