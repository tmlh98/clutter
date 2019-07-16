package com.tx.model.recursion;

/*
 * 匪警请拨110,即使手机欠费也可拨通！
	为了保障社会秩序，保护人民群众生命财产安全，警察叔叔需要与罪犯斗智斗勇，因而需要经常性地进行体力训练和智力训练！
	
	某批警察叔叔正在进行智力训练：
	1 2 3 4 5 6 7 8 9 = 110
	
	请看上边的算式，为了使等式成立，需要在数字间填入加号或者减号（可以不填，但不能填入其它符号）。
	之间没有填入符号的数字组合成一个数，例如：12+34+56+7-8+9 就是一种合格的填法；123+4+5+67-89 是另一个可能的答案。
	
	请你利用计算机的优势，帮助警察叔叔快速找到所有答案。
	每个答案占一行。形如：
	12+34+56+7-8+9
	123+4+5+67-89
	......

 */
public class 算式填符号 {
	
	public static void main(String[] args) {
		
		f("" , 1);							
	}
	static String[] s = new String[]{"+","-",""};
	private static void f(String str, int n) {
		if(n > 9) g(str.trim());
		if(n == 9)f(str + n, n + 1);
		for (String s1 : s) {
			if(n < 9)f(str + n + s1, n + 1);
		}
	}
	private static void g(String str) {
		int count = 0;
		String[] s1 = str.split("[+]");
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].indexOf("-") != -1){//存在减号
				String[] s2 = s1[i].split("[-]");
				count += Integer.valueOf(s2[0]);
				for (int j = 1; j < s2.length; j++) {
					count -= Integer.valueOf(s2[j]);
				}
			}else{
				count += Integer.valueOf(s1[i]);
			}
		}
		if(count == 110)System.out.println(str);
	}

	 
}
