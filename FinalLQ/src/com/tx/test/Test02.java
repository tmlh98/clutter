package com.tx.test;

public class Test02 {

	private static int f(String s1 , String s2){
		if(s1.length() == 0 || s2.length() == 0)return 0;
		
		if(s1.charAt(0) == s2.charAt(0))
			return f(s1.substring(1), s2.substring(1)) + 1;
		
		return Math.max(f(s1.substring(1), s2), f(s1, s2.substring(1)));
	}
	
	public static void main(String[] args) {
		System.out.println(f("saaasda","dasdasd"));
	}
}
