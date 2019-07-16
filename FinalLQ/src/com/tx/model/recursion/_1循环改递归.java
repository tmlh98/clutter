package com.tx.model.recursion;
/*
 * 函数式的思考方式
 * 假设语言没有提供循环结构
 * 
 * 求串的长度
 * 删除串的前 n 个字符
 * 串的翻转 
 * 测试是否为镜像串
 * 比较两个串的大小
 */
public class _1循环改递归 {
	public static void main(String[] args) {
		int length = getLength("asda");
		System.out.println(length);
		System.out.println(delete("kjjjj" , 2));
		System.out.println(reversal("12346"));
		System.out.println(isMirror("asssa"));
		System.out.println(compare("saasas", "sssssss"));
	}
	//比较两个串的大小
	public static int compare(String s1 , String s2 ){
		if(s1.length() == 0 && s2.length()==0)return 0;
		if(s1.length() == 0 )return -1;
		if( s2.length()==0)return 1;
		
		return compare(s1.substring(1), s2.substring(1));
	}
	
	//测试是否为镜像串
	public static boolean isMirror(String s ){
		if(s.length() <= 1)return true;
		if(s.charAt(0) != s.charAt(s.length() -1))return false;
		
		return isMirror(s.substring(1, s.length() -1));
	}
	//串的翻转 
	public static String reversal(String s){
		if(s.length() <= 1)return s;
		return s.charAt(s.length() -1) + reversal(s.substring(0, s.length() -1));
	}
	//求串的长度
	public static int getLength(String str){
		if("".equals(str))return 0;
		return getLength(str.substring(1)) + 1;
	}
	//删除串的前 n 个字符
	public static String delete(String s , int n){
		if(n == 0)return s;
		return delete(s.substring(1), n -1);
	}
}
