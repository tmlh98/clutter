package cn.dzqc.sftg;

import java.util.Scanner;

public class P0101 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double db=sc.nextDouble();
		double a=db*950/(Math.pow(10, -23)*3);
		int b=0;
		while(a>10){
			a/=10;
			b++;
		}
		System.out.print(String.format("%.6f", a));
		System.out.print("E+0");
		if (db==0) {
			System.out.println("0"+b);
		}else {
			System.out.println(b);
		}
		

	}
}
