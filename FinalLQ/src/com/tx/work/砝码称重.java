package com.tx.work;

import java.util.Scanner;

public class ������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = f(n);
		System.out.println(str);
		sc.close();
		
	}

	//����1�������ƴ���
	private static String f(int w) {
		int i = 1;  
        while(i < w) i *= 3;  
          
        if (w == i) return i + "";  
          
        if (w <= i/2) return i/3 + "+" + f(w - i/3);  
          
        return i + "-" + f(i - w);  
	}
	
	
}
/*
 * 5������

	����ƽ����ʱ������ϣ���þ������ٵ�������ϳƳ������ܶ��������
	���ֻ��5�����룬�����ֱ���1��3��9��27��81�������ǿ�����ϳƳ�1��121֮��������������������������������������У���
	����ĿҪ����ʵ�֣����û�����������������������Ϸ�����
	���磺
	�û����룺
	���������
	9-3-1
	�û����룺
	���������
	27-9+1
	
	Ҫ����������������Ǵ�����ǰС���ں�
	���Լ����û�����������ַ��Ϸ�Χ1~121��
*/