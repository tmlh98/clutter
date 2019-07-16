package cn.dzqc.jsk;

import java.util.HashMap;
import java.util.Scanner;

public class 罗马数字转换成整数 {
	// Ⅰ（1）、V（5）、X（10）、L（50）、C（100）、D（500)、M（1000）
	//输入一个罗马数字字符串，其对应的数字为 s(1≤s≤3999)。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = roManToInt(str);
		System.out.println(n);
		sc.close();
		
	}

	private static int roManToInt(String str) {
		if(str.length() == 0)return 0;
		 HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		 hs.put('I', 1);
		 hs.put('V', 5);
		 hs.put('X', 10);
		 hs.put('L', 50);
		 hs.put('C', 100);
		 hs.put('D', 500);
		 hs.put('M', 1000);
		int num = hs.get(str.charAt(str.length() -1));
		for (int i = str.length() -2; i >= 0; i--) {
			if(hs.get(str.charAt(i)) >= hs.get(str.charAt(i + 1))){
				num += hs.get(str.charAt(i));
			}else{
				num -= hs.get(str.charAt(i));
			}
		}
		
		return num;
	}
	
}
