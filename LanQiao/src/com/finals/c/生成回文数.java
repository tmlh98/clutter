package com.finals.c;
/*
 * 所谓回文数就是左右对称的数字，比如：
	585,5885,123321...
	当然，单个的数字也可以算作是对称的。
	
	小明发现了一种生成回文数的方法：
	比如，取数字19，把它与自己的翻转数相加：
	19 + 91 = 110，如果不是回文数，就再进行这个过程：
	110 + 011 = 121 这次是回文数了。
	
	200以内的数字中，绝大多数都可以在30步以内变成回文数，只有一个数字很特殊，就算迭代了1000次，它还是顽固地拒绝回文！
	请你提交该顽固数字，不要填写任何多余的内容。
 */
public class 生成回文数 {
	public static void main(String[] args) {
		for (int i = 10; i < 200; i++) {
			if(!judge(i , 0)){
				System.out.println(i);
			}
		}
	}
	//如果一个数字不是回文数，就让他与自己的翻转数相加
	private static boolean judge(long n ,int count) {
		String str = String.valueOf(n);
		String str2 =getRollback(str);
		if(str2.equals(str))return true;
		if(count > 30)return false;//如果30次以后仍然不是回文数,就返回false
		long x = Long.valueOf(str) + Long.valueOf(str2);
		return judge(x ,count +1);
	}
	
	//求翻转数
	private static String getRollback(String str){
		String str2 = "";
		for (int i = str.length() -1; i >= 0 ; i--){
			str2 += str.charAt(i);
		}
		return str2;
	}
}
