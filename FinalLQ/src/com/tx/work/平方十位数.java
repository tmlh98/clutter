package com.tx.work;

import java.util.HashSet;

public class 平方十位数 {
	public static void main(String[] args) {
		
		
		for (long i = 10000; i < 99999; i++) {
			long num = i * i;
			if(check(num)){
				
				System.out.println(num);
			}
		}
	}

	private static boolean check(long num) {
		String s = num +"";
		if(s.length() != 10) return false;
		HashSet<Character> hs = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		if(hs.size() == 10)return true;
		return false;
	}
}
