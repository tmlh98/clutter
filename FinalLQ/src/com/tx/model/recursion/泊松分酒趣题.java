package com.tx.model.recursion;

public class ���ɷ־�Ȥ�� {
	private static int a = 12;
	private static int b = 8;
	private static int c = 5;
	private static int x = 6;// Ŀ�����

	// ����һ��ʼ12,0,0
	private static void backBottle(int aa, int bb, int cc) {
		System.out.println("bb1:" + aa + "~~bb2:" + bb + "~~bb3:" + cc);
		if (aa == x || bb == x || cc == x) {
			System.out.println("find the bottle");
			return;
		}
		if (bb != 0 && cc != c) {
			if (bb + cc <= c) {
				// ������
				backBottle(aa, 0, bb + cc);
			} else {
				backBottle(aa, bb - (c - cc), c);
			}
		} else if (cc == c) {
			// ƿ��3���ˣ���ƿ��1��
			if (cc + aa <= a) {
				// ˵�������ƿ��1û��
				backBottle(aa + cc, bb, 0);
			} else {
				backBottle(a, bb, cc - (a - aa));
			}
		} else if (bb == 0) {
			// ��ƿ��1��ƿ��2�ﵹ��
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