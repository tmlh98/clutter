package com.lqb.cgroup;

public class �ӷ���˷� {
	/*
	 * ���Ƕ�֪����1+2+3+ ... + 49 = 1225
	 * ����Ҫ������������������ڵļӺű�ɳ˺ţ�ʹ�ý��Ϊ2015
	 * ���磺
	 * 1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015
	 * ���Ƿ���Ҫ��Ĵ𰸡�
	 * ����Ѱ������һ�����ܵĴ𰸣�����λ�ÿ�ǰ���Ǹ��˺���ߵ������ύ������ʾ���������ύ10����
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 47; i++) {
			for (int j = i+2; j < 48; j++) {
				int result1=1225-2*i-2*j-2;
				int result2=i*(i+1)+j*(j+1);
				if(result1+result2==2015){
					System.out.println(i);
				}
			}
		}
	}
}
