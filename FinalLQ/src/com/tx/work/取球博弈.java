package com.tx.work;
/*
 *  ������n��С��A��B���������Ӻ���ȡ��
	ÿ���˶����Կ�����һ����ȡ�˶��ٸ���Ҳ���Կ������л�ʣ�¶��ٸ���
	���˶��ܴ�������������������жϡ�
	ÿ���˴Ӻ�����ȡ���������Ŀ�����ǣ�1��3��7����8����
	�ֵ�ĳһ��ȡ��ʱ������Ȩ��
	A��ȡ��Ȼ��˫������ȡ��ֱ��ȡ�ꡣ
	�����õ����һ�����һ��Ϊ�������䷽��
	���ȷ������˫�������ж�ʧ�������£������ض��ĳ�ʼ������A�Ƿ���Ӯ��
 */
public class ȡ���� {

	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			System.out.println(f(i));
			
		} 
	}

	private static boolean f(int n) {
		if(n == 0)return true;//��ʱ����
		
		if(n >= 1 && f(n-1) == false)return true;
		if(n >= 3 && f(n-3) == false)return true;
		if(n >= 7 && f(n-7) == false)return true;
		if(n >= 8 && f(n-8) == false)return true;
		 
		return false;
	}
	
}
