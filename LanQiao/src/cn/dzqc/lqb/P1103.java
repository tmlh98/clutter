package cn.dzqc.lqb;

import java.util.Scanner;

public class P1103 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		char s=inScanner.next().charAt(0);
		double a=inScanner.nextDouble();
		double b=inScanner.nextDouble();
		double c=inScanner.nextDouble();
		double d=inScanner.nextDouble();
		switch (s) {
		case '+':
			System.out.println(add(a, b, c, d));
			break;
		case '-':
			System.out.println(sub(a, b, c, d));
			break;
		case '*':
			System.out.println(mul(a, b, c, d));
			break;
		case '/':
			System.out.println(tri(a, b, c, d));
			break;
		default:
			break;
		}

	}
	static String add(double a,double b,double c,double d){
		String str1=String.format("%.2f", a+c);
		String str2=String.format("%.2f", b+d);
		return str1+"+"+str2+"i";
	}
	static String sub(double a,double b,double c,double d){
		String str1=String.format("%.2f", a-c);
		String str2=String.format("%.2f", b-d);
		return str1+"+"+str2+"i";
	}
	static String mul(double a,double b,double c,double d){
		String str1=String.format("%.2f", a*c-b*d);
		String str2=String.format("%.2f", b*c+a*d);
		return str1+"+"+str2+"i";
	}
	static String tri(double a,double b,double c,double d){
		String str1=String.format("%.2f", (a*c + b*d)/(c*c + d*d));
		String str2=String.format("%.2f", (b*c - a*d)/(c*c + d*d));
		return str1+"+"+str2+"i";
	}
}
