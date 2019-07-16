package cn.dzqc.lqb;

import java.util.Scanner;

public class circle {
	public static final double PI=3.14159265358979323;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		String ar=String.format("%.7f", area(r));
		System.out.println(ar);
	}
	public static double area(int r){
		return r*r*PI;
	}
}
