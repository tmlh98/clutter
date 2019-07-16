package cn.dzqc.lqb;

import java.util.Scanner;

public class 前缀表达式 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s=in.next();
		int a=in.nextInt();
		int b=in.nextInt();
		int result=0;
		switch (s.charAt(0)) {
			case '+':
				result=add(a, b);
				break;
			case '-':
				result=minus(a, b);
				break;
			case '*':
				result=ride(a, b);
				break;
			case '/':
				result=div(a, b);
				break;

			default:
				break;
		}
		System.out.println(result);
		
	}
	static int add(int a,int b){
		return a+b;
	}
	static int minus(int a,int b){
		return a-b;
	}
	static int ride(int a,int b){
		return a*b;
	}
	static int div(int a,int b){
		return a/b;
	}
	
}
