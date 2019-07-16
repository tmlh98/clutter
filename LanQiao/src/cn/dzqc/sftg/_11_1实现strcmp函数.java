package cn.dzqc.sftg;

import java.util.Scanner;

public class _11_1ÊµÏÖstrcmpº¯Êý {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		String str1=inScanner.next();
		String str2=inScanner.next();
		if(str1.compareTo(str2)>0){
			System.out.println(1);
		}else if(str1.compareTo(str2)<0){
			System.out.println(-1);
			
		}else {
			System.out.println(0);
		}
		
	}

}
