package cn.dzqc.sftg;

import java.util.Scanner;


public class 因式分解 {
	//设计算法，用户输入合数，程序输出若个素数的乘积。例如，输入6，输出2*3。输入20，输出2*2*5。
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		System.out.println(ys(num));
	}
	static String ys(int num){
		String str="";
		if(num<=2){
			return num+str;
		}
		for (int i = num/2; i >=2; i--) {//60
			if(num%i==0){
				num=num/i;//
				return num+"*"+ys(i);
			}
		}
		return num+"";
	}
}
