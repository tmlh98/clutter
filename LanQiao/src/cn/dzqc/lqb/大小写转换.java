package cn.dzqc.lqb;

import java.util.Scanner;

public class ´óÐ¡Ð´×ª»» {
//	public static void main(String[] args) {
//		Scanner in =new Scanner(System.in);
//		String str=in.next(); 
//		String str2="";
//		
//		
//		for (int i = 0; i < str.length(); i++) {
//			str2+=Az(str.charAt(i));
//		}
//		System.out.println(str2);
//		
//	}
//	
//	static char Az(char c){
//		char []s=new char[52];
//		for (int i = 0; i < s.length; i++) {
//			if(i<26)
//				s[i]=(char)(65+i);
//			else
//				s[i]=(char)(71+i);
//		}
//		for (int i = 0; i < s.length; i++) {
//			if(s[i]==c){
//				if(i<26)
//					return s[i+26];
//				else
//					return s[i-26];
//				
//			}
//		}
//		return c;
//		
//	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str=in.next(); 
		System.out.println(change(str));
	}
	static String change(String str){
		StringBuffer sb =new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i)))
				sb.append(Character.toUpperCase(str.charAt(i)));
			else 
				sb.append(Character.toLowerCase(str.charAt(i)));
			
		}
		return sb.toString();
		
	}
	

}
