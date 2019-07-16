package cn.dzqc.lqb;

import java.util.Scanner;

public class Main {
	public void FiMo10007(int n) {
		int FM[] = new int[1000000];
		FM[0] = 1 % 10007;
		FM[1] = 1 % 10007;
		if (n == 1 || n == 2) {
			System.out.println(FM[0]);
		} else {
			for (int i = 2; i < n; i++) {
				FM[i] = FM[i - 1] + FM[i - 2];
			}
			FM[n - 1] = FM[n - 1] % 10007;
			}
			System.out.println(FM[n - 1]);
		}

	public void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		FiMo10007(n);

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.solve();
	}
}
