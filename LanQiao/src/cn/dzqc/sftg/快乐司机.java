package cn.dzqc.sftg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class ����˾�� {

	/**
	 *����֪����������������Ϊw���ɹ�ѡ�����Ʒ������n��ÿ����Ʒ������Ϊgi,��ֵΪpi����������װ�ص�����ֵ����
	 *�����һ��Ϊ�ɿո�ֿ�����������n w
����	 *�ڶ��е���n+1�У�ÿ���������������ɿո�ֿ����ֱ��ʾgi��pi
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int w=in.nextInt();
		//������������Ϊw���ɹ�ѡ�����Ʒ������n,����Ϊgi,��ֵΪpi
		int g[]=new int [n];
		int p[]=new int [n];
		double pg[]=new double [n];
		double pg2[]=new double [n];
		int index[]=new int [n];
		
		//n����Ʒ��g[]�����n����Ʒ��������p[]�����n����Ʒ�ļ�ֵ������Ϊpi/gi;
		for (int i = 0; i < n; i++) {
			g[i]=in.nextInt();
			p[i]=in.nextInt();
			pg2[i]=pg[i]=(double)p[i]/(double)g[i];//���浥��
		}
		for (int i = 0; i < n-1; i++) {
			for (int j = i; j<n-1; j++) {
				if(pg2[j]>pg2[j+1]){
					double temp=pg2[j];
					pg2[j]=pg2[j+1];
					pg2[j+1]=temp;
					
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(pg[i]==pg2[j]){
					index[i]=j;
				}
			}
		}//�����ֵ���±ꣻ
		double result=0;//����ֵ
		//װ�ذ���ֵ�Ӵ�С
		for (int i = 0; i <n; i++) {
			if(w>p[index[n-i-1]]){
				result+=p[index[n-i-1]];
				w-=g[index[n-i-1]];
			}else if(w>0){
				result+=w*pg[index[n-i-1]];
				break;
			}
			
		}
		BigDecimal bdBigDecimal=new BigDecimal(result).setScale(1,RoundingMode.FLOOR);
		System.out.print(bdBigDecimal);

	}

}
