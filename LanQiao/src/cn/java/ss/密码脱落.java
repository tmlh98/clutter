package cn.java.ss;

import java.util.Scanner;
/*
 *  X星球的考古学家发现了一批古代留下来的密码。
	这些密码是由A、B、C、D 四种植物的种子串成的序列。
	仔细分析发现，这些密码串当初应该是前后对称的（也就是我们说的镜像串）。
	由于年代久远，其中许多种子脱落了，因而可能会失去镜像的特征。
	
	你的任务是：
	给定一个现在看到的密码串，计算一下从当初的状态，它要至少脱落多少个种子，才可能会变成现在的样子。
	
	输入一行，表示现在看到的密码串（长度不大于1000）
	要求输出一个正整数，表示至少脱落了多少个种子。
	
	例如，输入：
	ABCBA
	则程序应该输出：
	0
	
	再例如，输入：
	ABDCDCBABC
	则程序应该输出：
	3
 */
public class 密码脱落 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String str2 = "";
		//字串反转
		for (int i = str.length() - 1; i >= 0 ; i--) {
			str2 += str.charAt(i);
		}
		//求最大公共子序列
		int len = f(str , str2);
		System.out.println(str.length() - len);
	}

	private static int f(String str, String str2) {
		if(str.length() == 0||str2.length() ==0)return 0;
		
		if(str.charAt(0) == str2.charAt(0))
			//问题逐一分解,当首字母相同时,记录此时情况
			return f(str.substring(1), str2.substring(1)) + 1;
		else//此时要么取余下的str串，要么取str2串
			return Math.max(f(str.substring(1),str2),f(str,str2.substring(1)));
	}
}
