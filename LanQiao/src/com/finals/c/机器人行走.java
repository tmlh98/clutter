package com.finals.c;

import java.util.Scanner;

public class ���������� {
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
			//��������
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
 * ĳ���깬������һ��������С�������Խ���Ԥ�������ָ���ָ���ж���С���Ļ��������ܼ򵥣�
 * ֻ��3�֣���ת����ΪL������ת����ΪR������ǰ���������ף�ֱ�Ӽ����֣���

    ���磬���ǿ��Զ�С���������µ�ָ�
 15L10R5LRR10R20
    ��С����ֱ��15���ף���ת������10���ף�����ת��...
    ���ѿ��������ڴ�ָ���С���ֻص��˳����ء�
    ��������ǣ���д�������û�����ָ��������ÿ��ָ��ִ�к�С��λ����ָ��ִ��ǰС��λ�õ�ֱ�߾��롣
�����롢�����ʽҪ��
    �û�������һ������n��n<100������ʾ����������n��ָ�
    ����������n��ָ�ÿ��ָ��ֻ��L��R��������ɣ�������0~100֮���������
    ÿ��ָ��ĳ��Ȳ�����256���ַ���
    ���������n�н����
    ÿ�������ʾС��ִ����Ӧ��ָ��ǰ��λ�õ�ֱ�߾��롣Ҫ���������뵽С����2λ��
    ���磺�û����룺
	L100R50R10
	3LLL5RR4L12
	LL
	100R
	5L5L5L5
	
	    ����������
	102.96
	9.06
	0.00
	100.00
	0.00
 */