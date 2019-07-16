package com.tx.model.recursion;

import java.util.HashMap;
import java.util.Map;

public class _2�ݹ��Ч������ {
	// ��α���������ظ�����
	// ͨ�÷������� ��map (��ֵ�ԣ��ֵ�)
	static long g(Map map, int n) {
		Long t = (Long) map.get(n);
		if (t != null) {
			return t;
		}

		long r = g(map, n - 1) + g(map, n - 2);
		map.put(n, r);
		return r;
	}

	// 쳲��������еĵ�n��Ŀ
	static long f(int n) {
		if (n == 1 || n == 2)
			return 1;
		return f(n - 1) + f(n - 2);
	}

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, 1L);
		map.put(2, 1L);

		System.out.println(g(map, 50));
		 System.out.println(f(50));
	}
}
