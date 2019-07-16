package cn.java.demo;

import java.util.Scanner;

public class ÃÜÂëÍÑÂä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			str2 += str.charAt(str.length() - i -1);
		}
		
		System.out.println(str2);
		int len = f(str , str2);
		System.out.println(str.length() - len);
	}

	private static int f(String str, String str2) {
		if(str.length() == 0 || str2.length() == 0)
			return 0;
		
		if(str.charAt(0) == str2.charAt(0))
			return f(str.substring(1), str2.substring(1)) + 1;
		else
			return Math.max(f(str.substring(1), str2), f(str, str2.substring(1)));
	}
}
