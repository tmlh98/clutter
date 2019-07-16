package cn.dzqc.sftg;

import java.math.BigInteger;
import java.util.Scanner;

public class P0102 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String to16=new BigInteger(str,16).toString(16);
		System.out.println("Hex:"+to16);
		String to10=new BigInteger(str,16).toString(10);
		System.out.println("Hex:"+to10);
		String to8=new BigInteger(str,16).toString(8);
		System.out.println("Hex:"+to8);
				
	}
}
