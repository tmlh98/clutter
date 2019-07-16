package cn.dzqc.sftg;

import java.util.Scanner;

public class 三个整数的排序 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int a=inScanner.nextInt();
		int b=inScanner.nextInt();
		int c=inScanner.nextInt();
		if(a>b){
			if(b>c){
				System.out.println(a+" "+b+" "+c);
			}else if(a>c){
				System.out.println(a+" "+c+" "+b);
			}else{
				System.out.println(c+" "+a+" "+b);
			}
		}else{//a<b
			if(b<c){
				System.out.println(c+" "+b+" "+a);
			}else if(a<c){
				System.out.println(b+" "+c+" "+a);
			}else{
				System.out.println(b+" "+a+" "+c);
			}
			
			
		}
	}
}
