package cn.dzqc.sftg;

import java.util.Scanner;

public class _7_1用宏求球的体积 {
	private static final double PI=3.1415926;
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		double r=inScanner.nextDouble();
		double S=(4*PI*r*r*r)/3;
		System.out.printf("%.5f",S);
	}

}
