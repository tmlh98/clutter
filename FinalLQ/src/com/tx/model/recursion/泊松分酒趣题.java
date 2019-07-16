package com.tx.model.recursion;

public class 泊松分酒趣题 {
	private static int a = 12;
	private static int b = 8;
	private static int c = 5;
	private static int x = 6;// 目标酒量

	// 假设一开始12,0,0
	private static void backBottle(int aa, int bb, int cc) {
		System.out.println("bb1:" + aa + "~~bb2:" + bb + "~~bb3:" + cc);
		if (aa == x || bb == x || cc == x) {
			System.out.println("find the bottle");
			return;
		}
		if (bb != 0 && cc != c) {
			if (bb + cc <= c) {
				// 倒不满
				backBottle(aa, 0, bb + cc);
			} else {
				backBottle(aa, bb - (c - cc), c);
			}
		} else if (cc == c) {
			// 瓶子3满了，往瓶子1倒
			if (cc + aa <= a) {
				// 说明倒完后瓶子1没满
				backBottle(aa + cc, bb, 0);
			} else {
				backBottle(a, bb, cc - (a - aa));
			}
		} else if (bb == 0) {
			// 从瓶子1往瓶子2里倒酒
			if (aa >= b) {
				backBottle(aa - b, b, cc);
			} else {
				backBottle(0, aa, cc);
			}
		}

	}

	public static void main(String[] args) {
		backBottle(12, 0, 0);
	}
}