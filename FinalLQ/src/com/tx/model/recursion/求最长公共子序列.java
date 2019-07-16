package com.tx.model.recursion;

public class 求最长公共子序列 {
	
	public static void main(String[] args) {
		long b = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			f("assasdasadadasdadas","asssssaadasdasdasdasdasdasdasda");
		}
		long e = System.currentTimeMillis();
		System.out.println(e - b);
		
		long b2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			
			dynamic("assasdasadadasdadas","asssssaadasdasdasdasdasdasdasda");
		}
		long e2 = System.currentTimeMillis();
		
		System.out.println(e2 - b2);
		
	}
	
	
	
	
	private static int dynamic(String s1, String s2) {
		int[][] aa = new int [s1.length() + 1][s2.length() +1];
		
		for (int i = 1; i < s1.length() + 1; i++) {
			for (int j = 1; j < s2.length() + 1; j++) {
				if(s1.charAt(i -1) == s2.charAt(j -1)){
					aa[i][j] = aa[i -1][j -1] + 1;
				}else{
					aa[i][j] = aa[i][j -1] > aa[i -1][j] ? aa[i][j -1] : aa[i -1][j];
				}
				
			}
		}
		return aa[s1.length()][s2.length()];
	}




	private static int f(String s1, String s2) {
		if(s1.length() == 0 || s2.length() == 0){
			return 0;
		}
		if(s1.charAt(0) == s2.charAt(0)){
			 return f(s1.substring(1), s2.substring(1)) + 1;
		}
		return Math.max(f(s1.substring(1), s2), f(s1, s2.substring(1)));
	}
}	
