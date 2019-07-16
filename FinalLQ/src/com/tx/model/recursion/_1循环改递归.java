package com.tx.model.recursion;
/*
 * ����ʽ��˼����ʽ
 * ��������û���ṩѭ���ṹ
 * 
 * �󴮵ĳ���
 * ɾ������ǰ n ���ַ�
 * ���ķ�ת 
 * �����Ƿ�Ϊ����
 * �Ƚ��������Ĵ�С
 */
public class _1ѭ���ĵݹ� {
	public static void main(String[] args) {
		int length = getLength("asda");
		System.out.println(length);
		System.out.println(delete("kjjjj" , 2));
		System.out.println(reversal("12346"));
		System.out.println(isMirror("asssa"));
		System.out.println(compare("saasas", "sssssss"));
	}
	//�Ƚ��������Ĵ�С
	public static int compare(String s1 , String s2 ){
		if(s1.length() == 0 && s2.length()==0)return 0;
		if(s1.length() == 0 )return -1;
		if( s2.length()==0)return 1;
		
		return compare(s1.substring(1), s2.substring(1));
	}
	
	//�����Ƿ�Ϊ����
	public static boolean isMirror(String s ){
		if(s.length() <= 1)return true;
		if(s.charAt(0) != s.charAt(s.length() -1))return false;
		
		return isMirror(s.substring(1, s.length() -1));
	}
	//���ķ�ת 
	public static String reversal(String s){
		if(s.length() <= 1)return s;
		return s.charAt(s.length() -1) + reversal(s.substring(0, s.length() -1));
	}
	//�󴮵ĳ���
	public static int getLength(String str){
		if("".equals(str))return 0;
		return getLength(str.substring(1)) + 1;
	}
	//ɾ������ǰ n ���ַ�
	public static String delete(String s , int n){
		if(n == 0)return s;
		return delete(s.substring(1), n -1);
	}
}
