package cn.dzqc.sftg;

import java.util.Scanner;

public class P1001 {
	public static void main(String[] args) {
		Scanner inScanner =new Scanner(System.in);
		String str1=inScanner.next();
		String str2=inScanner.next();
		Long tg=Long.decode(str1)*Long.decode(str2);
		System.out.println(tg.toString());
	}

}
