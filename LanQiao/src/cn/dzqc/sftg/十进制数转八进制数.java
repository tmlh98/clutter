package cn.dzqc.sftg;

import java.math.BigInteger;
import java.util.Scanner;

public class 十进制数转八进制数 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String bg=new BigInteger(num+"",10).toString(8);
		System.out.println(bg);
	}
}
