package cn.dzqc.lqb;

import java.util.Scanner;

public class basics2Demo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>10||n<1){
			return;
		}
		StringBuffer []c16=new StringBuffer[n];
		StringBuffer []c2=new StringBuffer[n];
		StringBuffer []c8=new StringBuffer[n];
		//赋值
		for (int i = 0; i < n; i++) {
			StringBuffer temp = new StringBuffer(in.next());
			if (temp.charAt(0) == '0')
				return;
			if (temp.length() > 100000)
				return;
			c16[i] = temp;
		}
		//第一步转化成二进制放到c2
		for (int i = 0; i < n; i++) {
			c2[i] = new StringBuffer("");
			for (int j = 0; j < c16[i].length(); j++) {
				c2[i].append(C16To2(c16[i].charAt(j)));
			}
		}
		//2进制转8进制
		for (int i = 0; i < n; i++) {
			// 从后面每次取三位，做成一个字符串，然后返回其八进制如果不够，就添加
			c8[i] = new StringBuffer("");
			String temp = "";
			for (int j = c2[i].length() - 1; j > -2; j = j - 3) {
				int thisnum = j - 2;
				for (int k = 0; k < 3; k++) {
					if (thisnum < 0)
						temp += "0";
					else
						temp += c2[i].charAt(thisnum);
					thisnum++;
				}
				c8[i].append(C2To8(temp));
				temp = "";
			}
		}
		StringBuffer []c=new StringBuffer[n];
		for (int i = 0; i < n; i++) {
			c[i] = new StringBuffer("");
			int flag, k;
			if (c8[i].charAt(c8[i].length() - 1) == '0')
				k = c8[i].length() - 2;
			else
				k = c8[i].length() - 1;
			for (; k >= 0; k--) {
				c[i].append(c8[i].charAt(k));
			}
			System.out.println(c[i]);
		}
		
	}
	public static String C2To8(String s){
		if(s.equals("000")){
			return "0";
		}
		if(s.equals("001")){
			return "1";
		}
		if(s.equals("010")){
			return "2";
		}
		if(s.equals("011")){
			return "3";
		}
		if(s.equals("100")){
			return "4";
		}
		if(s.equals("101")){
			return "5";
		}
		if(s.equals("110")){
			return "6";
		}else
			return "7";
	}
	public static String C16To2(char c){
		if(c==0)
			return "0000";
		if(c==1)
			return "0001";
		if(c==2)
			return "0010";
		if(c==3)
			return "0011";
		if(c==4)
			return "0100";
		if(c==5)
			return "0101";
		if(c==6)
			return "0110";
		if(c==7)
			return "0111";
		if(c==8)
			return "1000";
		if(c==9)
			return "1001";
		if(c=='A')
			return "1010";
		if(c=='B')
			return "1011";
		if(c=='C')
			return "1100";
		if(c=='D')
			return "1101";
		if(c=='E')
			return "1110";
		else
			return "1111";
		
	}
}
