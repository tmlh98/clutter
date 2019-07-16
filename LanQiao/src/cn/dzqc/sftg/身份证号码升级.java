package cn.dzqc.sftg;

import java.util.Scanner;

public class 身份证号码升级 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String iden=in.next();
		int []xi=new int []{7, 9, 10, 5, 8, 4,2 ,1, 6 ,3 ,7 ,9, 10, 5, 8, 4, 2};
		char []si=new char []{'1', '0', 'x' ,'9','8' , '7' ,'6' ,'5', '4' ,'3' ,'2'};
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < iden.length(); i++) {
			if(i==6){
				sb.append("19");
			}
			sb.append(iden.charAt(i));
		}
		iden=sb.toString();
		int num=0;
		for (int i = 0; i < iden.length(); i++) {
			num+=Integer.parseInt(iden.charAt(i)+"")*xi[i];
		}
		sb.append(si[num%11]);
		System.out.println(sb.toString());
	}

}
