package com.dzqc.ljst;

import java.util.Scanner;

public class ������Ϸ {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long k=in.nextLong();
		long t=in.nextLong();
		long num=1;            //������˵����
		long sum=1;
		long d=(n+1)*n/2;      //����˵�ĵ�һ�����͵ڶ������ļ�� 
		for(int i=1;i<t;i++){
			num+=d;
			d+=n*n;            //�󶰶����������ļ��
			if(num>k-1)
				num%=k;
			sum+=num;
		}
		System.out.println(sum);
	}
}
