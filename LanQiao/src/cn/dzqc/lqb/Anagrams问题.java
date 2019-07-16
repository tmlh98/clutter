package cn.dzqc.lqb;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsŒ Ã‚ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		String str1=inScanner.next().toLowerCase();
		String str2=inScanner.next().toLowerCase();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String str3=new String(ch1);
		String str4=new String(ch2);
		if(str3.equals(str4)){
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
	}

}
