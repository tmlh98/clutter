package cn.dzqc.sftg;

import java.util.Scanner;

public class ������һ�� {
	/**
	 * ��д����Normalize����������һ������������Ϊa+bi����һ�����Ϊa/Math.sqrt(a*a+b*b) + i*b/sqrt(a*a+b*b) 
	 * ��ʹ�ýṹ��ָ��������Ϊ�������������Ǳ�Ҫ�ġ�����ʵ�����鲿�ɼ������룬���Ϊ��һ������������һ�������ʵ�����鲿ΪС����Ҫ����һλС����
	 * ��������:����ʽ˵����3 4 �ֱ�Ϊ�Կո������ʵ����ʵ�����鲿��
	 * 3 4 �������:0.6+0.8i
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		double a=in.nextInt();
		double b=in.nextInt();
		System.out.println(Normalize(a, b));
	}
	private static String  Normalize(double a,double b) {
		String stra=String.format("%.1f", a/(Math.sqrt(a*a+b*b)));
		String strb=String.format("%.1f", b/(Math.sqrt(a*a+b*b)));
		return stra+"+"+strb+"i";
	}

}
