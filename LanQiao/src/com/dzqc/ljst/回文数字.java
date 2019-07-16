package com.dzqc.ljst;

import java.util.Scanner;

public class »ØÎÄÊı×Ö {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		isHw(num);
	}
	public static void isHw(int num) {
		boolean flag=true;
		for (int i = 10001; i <= 999999; i++) {
			String stri=i+"";
			char a1=stri.charAt(0);
			char a2=stri.charAt(1);
			char a3=stri.charAt(2);
			char a4=stri.charAt(Integer.toString(i).length()-3);
			char a5=stri.charAt(Integer.toString(i).length()-2);
			char a6=stri.charAt(Integer.toString(i).length()-1);
			if(a1==a6&&a2==a5&&a3==a4){
				if(stri.length()==5){
					if(Integer.parseInt(a1+"")+Integer.parseInt(a2+"")+Integer.parseInt(a3+"")+Integer.parseInt(a5+"")+Integer.parseInt(a6+"")==num){
						System.out.println(i);
						flag=false;
					}
					
				}else if (stri.length()==6) {
					if(Integer.parseInt(a1+"")+Integer.parseInt(a2+"")+Integer.parseInt(a3+"")+Integer.parseInt(a4+"")+Integer.parseInt(a5+"")+Integer.parseInt(a6+"")==num){
						System.out.println(i);
						flag=false;
					} 
				} 
			}
			
		}
		if(flag)System.out.println(-1);
	}
}
