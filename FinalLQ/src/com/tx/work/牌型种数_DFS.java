package com.tx.work;
/*
 * С�����ٳֵ�X�ĳǣ�����������3�����ơ�
 * һ���˿��ƣ�ȥ����С���ƣ���52�ţ������ȷ���4���ˣ�ÿ����13�š�
 * ��ʱ��С��������ͻȻð��һ�����⣺
 * ��������ǻ�ɫ��ֻ���ǵ�����Ҳ�������Լ��õ����Ƶ��Ⱥ�˳���Լ��������õ��ĳ�ʼ�������һ���ж������أ�
 */
public class ��������_DFS {

	private static  int count = 0;
	
	public static void main(String[] args) {
		dfs(0 , 0);
		System.out.println(count);
	}

	/*
	 * dfs�����ѵ����Ƶ����ͣ�ÿ���ƿ���ѡ0~4�֣�ѡ���Ƶ��������==13
	 * type ��ʾ�Ƶĵ���   sum ��ʾ��ѡ�˼���
	 */
	private static void dfs(int type , int n) {
		if(type > 13)return;
		if(n > 13)return;
		if(type == 13 && n == 13){
			count ++;
			return;
		}
		for (int i = 0; i < 5; i++) {
			dfs(type + 1 , n  + i);
		}
	} 
}
