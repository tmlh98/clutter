package com.lqb.cgroup;

public class ����β���� {

	/**
	 * ��Щ���ֵ�������ĩβ�����Ǹ����ֱ���
	 * ���磺1,4,5,6,9,24,25,....
	 * �������һ�£���10000���ڵ������У�ָ�����֣����������������ֵ����
	 * �������������������һ���ж��ٸ���
	 */
	public static void main(String[] args) {
		int count=0;
		for (long i = 1; i <=10000; i++) {
			String str=i+"";
			String str3=(i*i*i)+"";
			String str4=str3.substring(str3.length()-str.length(),str3.length());
			if(str4.equals(str)){
				count++;
			}
		}
		System.out.println(count);

	}

}
