package com.finals.c;
/*
 * ��ν�������������ҶԳƵ����֣����磺
	585,5885,123321...
	��Ȼ������������Ҳ���������ǶԳƵġ�
	
	С��������һ�����ɻ������ķ�����
	���磬ȡ����19���������Լ��ķ�ת����ӣ�
	19 + 91 = 110��������ǻ����������ٽ���������̣�
	110 + 011 = 121 ����ǻ������ˡ�
	
	200���ڵ������У����������������30�����ڱ�ɻ�������ֻ��һ�����ֺ����⣬���������1000�Σ���������̵ؾܾ����ģ�
	�����ύ��������֣���Ҫ��д�κζ�������ݡ�
 */
public class ���ɻ����� {
	public static void main(String[] args) {
		for (int i = 10; i < 200; i++) {
			if(!judge(i , 0)){
				System.out.println(i);
			}
		}
	}
	//���һ�����ֲ��ǻ����������������Լ��ķ�ת�����
	private static boolean judge(long n ,int count) {
		String str = String.valueOf(n);
		String str2 =getRollback(str);
		if(str2.equals(str))return true;
		if(count > 30)return false;//���30���Ժ���Ȼ���ǻ�����,�ͷ���false
		long x = Long.valueOf(str) + Long.valueOf(str2);
		return judge(x ,count +1);
	}
	
	//��ת��
	private static String getRollback(String str){
		String str2 = "";
		for (int i = str.length() -1; i >= 0 ; i--){
			str2 += str.charAt(i);
		}
		return str2;
	}
}
