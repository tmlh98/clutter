package com.lqb.cgroup;

public class ����ķ��� {

	/**
	 * ͨ���ݹ鷵��double����
	 */
	public static void main(String[] args) {
		 System.out.println(String.format("%.5f",f(1.0)));
	}
	public static double f(double x) {
		if (x == 100)
		return x;
		return x / (x + f(x + 1));
		}
}
