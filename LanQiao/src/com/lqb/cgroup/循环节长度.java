package com.lqb.cgroup;

import java.util.Vector;

public class ѭ���ڳ��� {

	/*
	 * ������������������ʱ�����ѭ��С������ѭ�����ֳ�Ϊ��ѭ���ڡ� ���磬11/13=6=>0.846153846153.....
	 * ��ѭ����Ϊ[846153] ����6λ�� ����ķ������������ѭ���ڵĳ��ȡ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(1, 13));
	}

	public static int f(int n, int m){
		n = n % m;	
		Vector<Integer> v = new Vector<Integer>();
		
		for(;;){
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0)   
			return v.size()-v.indexOf(n);  //���
		}
	}
}
