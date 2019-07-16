package com.jisuanke.nanti;

import java.util.Scanner;

public class ¼ÛÇ®Í³¼Æ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double price1 = a * 1.2;
		double price2 = b * 3.5;
		double price3 = c * 4.5;
		double price4 = d * 5.0;
		System.out.printf("%.1f", price1);
		System.out.printf("\n%.1f", price2);
		System.out.printf("\n%.1f", price3);
		System.out.printf("\n%.1f", price4);
		System.out.printf("\n%.1f" , price1 + price2 + price3 + price4);
		
		sc.close();
	}
}
