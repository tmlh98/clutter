package com.lqb.cgroup;

public class ������ {
/*
 * С�����������òμ�Ԫ���ƻᡣ���������Ƕ���ˣ����ǵ�Ƥ��˵����������������֮��������֮�͵�6������
 * С���ֲ���˵�������ǿɲ���˫��̥�������϶�Ҳ������8�갡����
 * ����д����С���Ľ�С�����õ�����
 */
	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				if(i*j==6*(i+j)&&Math.abs(i-j)<=8){
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
