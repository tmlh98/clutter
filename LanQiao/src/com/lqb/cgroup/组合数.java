package com.lqb.cgroup;

/*
 * ��4������ѡ2���˲μӻ��һ����6��ѡ����
 * ��n������ѡm���˲μӻ��һ���ж�����ѡ��������ĺ���ʵ����������ܡ�
 */
public class ����� {
	static int f(int n, int m){
		if(m>n) return 0;
		if(m==0) return 1;

		return f(n-1,m-1) + f(n-1,  m);
	}

	public static void main(String[] args) {
		System.out.println(f(4, 2));
	}
}
