package cn.dzqc.sftg;

import java.util.Scanner;


public class ��ʽ�ֽ� {
	//����㷨���û��������������������������ĳ˻������磬����6�����2*3������20�����2*2*5��
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		System.out.println(ys(num));
	}
	static String ys(int num){
		String str="";
		if(num<=2){
			return num+str;
		}
		for (int i = num/2; i >=2; i--) {//60
			if(num%i==0){
				num=num/i;//
				return num+"*"+ys(i);
			}
		}
		return num+"";
	}
}
