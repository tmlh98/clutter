package cn.dzqc.sftg;

import java.util.Scanner;

public class _9_2文本加密 {

	/**
	 * 先编写函数EncryptChar,按照下述规则将给定的字符c转化（加密）为新的字符："A"转化"B"，"B"转化为"C"，... ..."Z"转化为"a"， 65-91   97-122 
	 * "a"转化为"b",... ..., "z"转化为"A"，其它字符不加密。编写程序，加密给定字符串。
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		String str=inScanner.next();
		System.out.println(EncryptChar(str));
	}
	private static String EncryptChar(String str) {
		StringBuilder sb =new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if((str.charAt(i)>=65&&str.charAt(i)<90)||(str.charAt(i)>=97&&str.charAt(i)<122)){
				sb.append((char)(str.charAt(i)+1)+"");
			}else if(str.charAt(i)=='Z'){
				sb.append("a");
			}else if(str.charAt(i)=='z'){
				sb.append("A");
			}else{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}
