package cn.java.eight;

import java.util.Scanner;

/*
 * С����������һ����ʷ���ס���Щ��ʷ�����г����˺ܶ����ڡ�
 * С��֪����Щ���ڶ���1960��1��1����2059��12��31�ա���С��ͷ�۵��ǣ�
 * ��Щ���ڲ��õĸ�ʽ�ǳ���ͳһ���в�����/��/�յģ��в�����/��/��ģ����в�����/��/��ġ�
 * �����鷳���ǣ����Ҳ��ʡ����ǰ��λ��ʹ�������ϵ�һ�����ڣ����ںܶ���ܵ����������Ӧ�� 
	 ����02/03/04��������2002��03��04�ա�2004��02��03�ջ�2004��03��02�ա� 
	 ����һ�������ϵ����ڣ����ܰ���С���ж�����Щ���ܵ����ڶ����Ӧ��
	 ����
	 һ�����ڣ���ʽ�ǡ�AA/BB/CC���� (0 <= A, B, C <= 9) 
	 ���
	 ������ɸ�����ͬ�����ڣ�ÿ������һ�У���ʽ�ǡ�yyyy-MM-dd����������ڰ����絽�����С� 
	 ��������
	 02/03/04 
	 �������
	 2002-03-04 
	 2004-02-03 
	 2004-03-02 
 */
public class �������� {//1960��1��1����2059��12��31��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] s = str.split("[/]");
		
		String[] s2 ={s[2],s[0],s[1]}; 
		String[] s3 ={s[2],s[1],s[0]}; 
		
		String[] ss = check(s);
		String[] ss2 = check(s2);
		String[] ss3 = check(s3);
		
		if(check2(s))System.out.println(ss[0] +"-"+ss[1]+"-"+ss[2]);
		if(check2(s2))System.out.println(ss2[0] +"-"+ss2[1]+"-"+ss2[2]);
		if(check2(s3))System.out.println(ss3[0] +"-"+ss3[1]+"-"+ss3[2]);
		
		
	}

	private static boolean check2(String[] s) {
		int year  = Integer.valueOf(s[0]);
		int mouth  = Integer.valueOf(s[1]);
		int day  = Integer.valueOf(s[2]);
		int[] m ={31,28,31,30,31,30,31,31,30,31,30,31};
		if(mouth>0 && mouth <13){
			if(day <= m[mouth -1]){
				return true;
			}else if((year%4==0&&year%100!=0)||year%400 ==0){
				if(mouth == 2 && day <= 29)return true;
			}
		}
		return false;
	}

	private static String[] check(String[] s) {
		int year  = Integer.valueOf(s[0]);
		if(year>=0 && year <60) 
			if(year<10)s[0] = "200" +year;
			else s[0] = "20" +year;
		if(year>=60 && year <100) s[0] = "19" +year;
		return s;
	}
}
