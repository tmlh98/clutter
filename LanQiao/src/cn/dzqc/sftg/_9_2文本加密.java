package cn.dzqc.sftg;

import java.util.Scanner;

public class _9_2�ı����� {

	/**
	 * �ȱ�д����EncryptChar,�����������򽫸������ַ�cת�������ܣ�Ϊ�µ��ַ���"A"ת��"B"��"B"ת��Ϊ"C"��... ..."Z"ת��Ϊ"a"�� 65-91   97-122 
	 * "a"ת��Ϊ"b",... ..., "z"ת��Ϊ"A"�������ַ������ܡ���д���򣬼��ܸ����ַ�����
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
