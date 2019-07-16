package cn.dzqc.lqb;

import java.util.Scanner;

public class To16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int num=inScanner.nextInt();
		// System.out.println(Integer.toHexString(num));
		System.out.println(IntToHex(num));
	}

	public static String IntToHex(int n) {
		char[] ch = new char[20];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=' ';
		}
		int nIndex = 0;
		while (true) {
			int m = n / 16;//求商 1
			int k = n % 16;//取余数14
			if (k == 15)
				ch[nIndex] = 'F';
			else if (k == 14)
				ch[nIndex] = 'E';
			else if (k == 13)
				ch[nIndex] = 'D';
			else if (k == 12)
				ch[nIndex] = 'C';
			else if (k == 11)
				ch[nIndex] = 'B';
			else if (k == 10)
				ch[nIndex] = 'A';
			else
				ch[nIndex] = (char) ('0' + k);
			nIndex++;
			if (m == 0)
				break;
			n = m;
		}
		String string="";
		for (int i = 0; i < ch.length; i++) {
			string+=ch[i];
		}
		String s="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[ch.length-1-i]==' ')
				continue;
			s+=ch[ch.length-1-i];
		}
		
		return s;
	}
}
