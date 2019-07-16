package com.finals.c;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 福尔摩斯从X星收到一份资料，全部是小写字母组成。
	他的助手提供了另一份资料：许多长度为8的密码列表。
	福尔摩斯发现，这些密码是被打乱后隐藏在先前那份资料中的。
	请你编写一个程序，从第一份资料中搜索可能隐藏密码的位置。要考虑密码的所有排列可能性。
	数据格式：
	
	输入第一行：一个字符串s，全部由小写字母组成，长度小于1024*1024
	紧接着一行是一个整数n,表示以下有n行密码，1<=n<=1000
	紧接着是n行字符串，都是小写字母组成，长度都为8
	
	要求输出：
	一个整数, 表示每行密码的所有排列在s中匹配次数的总和。
	例如：
	用户输入：
	aaaabbbbaabbcccc
	2
	aaaabbbb
	abcabccc
	
	则程序应该输出：
	4
	
	这是因为：第一个密码匹配了3次，第二个密码匹配了1次，一共4次。
 */
public class 密文搜索 {
	
	static HashSet<String> hs = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			char[] c = sc.next().toCharArray();
			f(c , 0);
		}
		int count = 0;
		
		for (String string : hs) {
			if(s.contains(string))
				count ++;
		}
		System.out.println(count);
		sc.close();
	}
	//求所有字串排列
	private static void f(char[] c,int k) {
		if(c.length -1 == k){
			hs.add(new String(c));//去除重复
			return;
		}
		for (int i = k; i < c.length; i++) {
			swap(c , i , k);
			f(c, k + 1);
			swap(c , i , k);
		}
	}

	//交换
	private static void swap(char[] c, int i, int k) {
		char temp = c[i];
		c[i] = c[k];
		c[k] = temp;
	}

		
}
