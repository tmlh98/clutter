package com.dzqc.ljst;

import java.util.Scanner;

public class 数字游戏 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long k=in.nextLong();
		long t=in.nextLong();
		long num=1;            //栋栋所说的数
		long sum=1;
		long d=(n+1)*n/2;      //栋栋说的第一个数和第二个数的间距 
		for(int i=1;i<t;i++){
			num+=d;
			d+=n*n;            //求栋栋下两个数的间距
			if(num>k-1)
				num%=k;
			sum+=num;
		}
		System.out.println(sum);
	}
}
