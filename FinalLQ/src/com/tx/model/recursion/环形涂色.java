package com.tx.model.recursion;

import java.util.HashMap;

/*
 * ��ͼ����ɻ��εĸ�����ҪͿ3����ɫ��
 * 	���ǵı�ŷֱ���1~14
 * 	���ڵĸ��Ӳ�������ͬ����ɫ��
 * 	Ϳɫ��������Ŀ�ǣ� 16386
 * 	��������ĿΪ50��ʱ����Ϳɫ����������
 */
public class ����Ϳɫ {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			System.out.println(f(i));
		}
	}
	static HashMap<Integer, Long> hs = new HashMap<Integer, Long>();
	private static long f(int n) {
		if(hs.containsKey(n)){
			return hs.get(n);
		} 
		
		if(n == 1) return 3;
		if(n == 2 || n == 3) return 6;
		hs.put(n,  (f(n - 2) * 2 + f(n -1)));
		return hs.get(n);
	}
}
