package com.tx.work;

import java.util.Scanner;

public class ��Ӳ�� {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		
		int count = 0;
		for (int i = 0; i < b.length -1; i++) {
			if(a[i] != b[i] ){//��ת
				a[i] = b[i];
				if(a[i + 1] == '*')a[i + 1] = 'o';
				else a[i + 1] = '*';
				count ++;
			}
		}
		System.out.println(count);
		sc.close();
	}
	
	
}
/*
 *  ��������1
 *  **********
 *  o****o****
 *  �������1
 *  5
 */
 