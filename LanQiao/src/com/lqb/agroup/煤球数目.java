package com.lqb.agroup;
/*
 * ��һ��ú�򣬶ѳ�������׶�Ρ����壺
	��һ���1����
	�ڶ���3�������г������Σ���
	������6�������г������Σ���
	���Ĳ�10�������г������Σ���
	....
	���һ����100�㣬���ж��ٸ�ú��
	
	�����ʾú������Ŀ������
*/
public class ú����Ŀ {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			count += result(i);
		}
		System.out.println(count);
		
	}
	public static int result(int n){
		if(n==1) return 1;
		return result(n-1) +n;
	}
}
