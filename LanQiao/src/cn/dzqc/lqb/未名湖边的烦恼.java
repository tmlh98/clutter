package cn.dzqc.lqb;

import java.util.Scanner;

public class δ�����ߵķ��� {
	/**
	 ** ��ÿ�궬�죬����δ�����϶��ǻ����ĺõط���
	 * ����������׼��������Ь��������̫���ˣ�ÿ�������չ��󣬳���һ˫��Ь����ʣ��
��           *ÿ�����ϣ���Ь���ڶ����������������л�Ь��m��������Ҫ��Ь��n�������ڵ������ǣ�
     *��Щ���ж������ŷ������Ա������������û�б�Ь��������γ��档������ͬ��������ˣ����綼����Ь���ǻ�Ь������λ����ͬһ���ŷ���
	 */
	
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int m=inScanner.nextInt();
		int n=inScanner.nextInt();
		System.out.println(fn(m, n));

	}
	static int fn(int m,int n){
		if(m<n){
			return 0;
		}
		if(n==0){
			return 1;
		}
		return fn(m-1, n)+fn(m, n-1);
		
	}

}
