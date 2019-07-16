package cn.dzqc.sftg;

import java.util.Scanner;

public class _6_17复数四则运算 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int a=inScanner.nextInt();
		int b=inScanner.nextInt();
		String fu=inScanner.next();
		int c=inScanner.nextInt();
		int d=inScanner.nextInt();
		if ("+".equals(fu)) System.out.println(add(a, b, c, d));
		else if ("-".equals(fu)) System.out.println(min(a, b,c, d));
		else if ("*".equals(fu)) System.out.println(ride(a, b, c, d));
		else if ("/".equals(fu)) System.out.println(div(a, b,  c, d));
		else System.out.println("error");
	}
	static String add(int a,int b,int c,int d){
		if((b+c)<0){
			return (a+c)+""+(b+d)+"i";
		}
		return (a+c)+"+"+(b+d)+"i";
	}
	static String min(int a,int b,int c,int d){
		if((b-d)<0){
			return (a-c)+""+(b-d)+"i";
		}
		return (a-c)+"+"+(b-d)+"i";
	}
	static String ride(int a,int b,int c,int d){
		if((b*c+a*d)<0){
			return (a*c-b*d)+""+(b*c+a*d)+"i";
		}
		return (a*c-b*d)+"+"+(b*c+a*d)+"i";
	}
	static String div(int a,int b,int c,int d){
		if((c*c+d*d)<0){
			return (a*c-b*d)/(c*c+d*d)+""+(c*c+d*d)+"i";
		}
		return (a*c-b*d)/(c*c+d*d)+"+"+(c*c+d*d)+"i";
	}
}
