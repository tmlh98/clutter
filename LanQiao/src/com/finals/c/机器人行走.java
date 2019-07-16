package com.finals.c;

import java.util.Scanner;

public class 机器人行走 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] r = new String[N];
		int index = 0;
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			double result = getResult(str);
			r[index ++] = String.format("%.2f", result);
		}
		for (String string : r) {
			System.out.println(string);
		}
		sc.close();
	}

	private static double getResult(String str) {
		String[] s = new String[str.length()];
		int index = 0;
		for (int i = 0; i < str.length(); i++)
			if(str.charAt(i) == 'L' || str.charAt(i) =='R')
				s[index ++] = str.charAt(i) + "";
			else
				for (int k = i;  k< str.length(); k++) 
					if(str.charAt(k) == 'L' || str.charAt(k) =='R'){
						s[index ++]=str.substring(i , k);
						i = k -1;
						break;
					}
		for (int i = str.length() -1; i > 0; i--) {
			if((str.charAt(i) == 'L' || str.charAt(i) == 'R') && i == str.length() -1)break;
			if(str.charAt(i) == 'L' || str.charAt(i) == 'R'){
				s[index -- ] = str.substring(i + 1,str.length());
				break;
			}
		}
		
		int x =0, y=0;
		char fx = 's';
		for (String string : s) {
			if(string == null) break;
			//调整方向
			if(string.equals("L") && fx == 's')fx = 'z';
			else if(string.equals("L") && fx == 'z')fx = 'x';
			else if(string.equals("L") && fx == 'x')fx = 'y';
			else if(string.equals("L") && fx == 'y')fx = 's';
			else if(string.equals("R") && fx == 's')fx = 'y';
			else if(string.equals("R") && fx == 'z')fx = 's';
			else if(string.equals("R") && fx == 'x')fx = 'z';
			else if(string.equals("R") && fx == 'y')fx = 'x';
			else if(fx == 's')y += Integer.valueOf(string);
			else if(fx == 'z')x -= Integer.valueOf(string);
			else if(fx == 'x')y -= Integer.valueOf(string);
			else if(fx == 'y')x += Integer.valueOf(string);
		}
		
		return Math.sqrt(x * x + y * y);
	}
}
/*
 * 某少年宫引进了一批机器人小车。可以接受预先输入的指令，按指令行动。小车的基本动作很简单，
 * 只有3种：左转（记为L），右转（记为R），向前走若干厘米（直接记数字）。

    例如，我们可以对小车输入如下的指令：
 15L10R5LRR10R20
    则，小车先直行15厘米，左转，再走10厘米，再右转，...
    不难看出，对于此指令串，小车又回到了出发地。
    你的任务是：编写程序，由用户输入指令，程序输出每条指令执行后小车位置与指令执行前小车位置的直线距离。
【输入、输出格式要求】
    用户先输入一个整数n（n<100），表示接下来将有n条指令。
    接下来输入n条指令。每条指令只由L、R和数字组成（数字是0~100之间的整数）
    每条指令的长度不超过256个字符。
    程序则输出n行结果。
    每条结果表示小车执行相应的指令前后位置的直线距离。要求四舍五入到小数后2位。
    例如：用户输入：
	L100R50R10
	3LLL5RR4L12
	LL
	100R
	5L5L5L5
	
	    则程序输出：
	102.96
	9.06
	0.00
	100.00
	0.00
 */