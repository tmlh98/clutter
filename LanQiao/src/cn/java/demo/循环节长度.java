package cn.java.demo;

import java.util.Vector;
/*������������������ʱ�����ѭ��С������ѭ�����ֳ�Ϊ��ѭ���ڡ�
	���磬11/13=6=>0.846153846153.....  ��ѭ����Ϊ[846153] ����6λ��
	����ķ������������ѭ���ڵĳ��ȡ�

	����ϸ�Ķ����룬����д���߲���ȱ�ٵĴ��롣*/

public class ѭ���ڳ��� {

	public static int f(int n, int m){
			n = n % m;	// 11
			Vector v = new Vector();//11
			for(;;){
				v.add(n);
				n *= 10;//110
				n = n % m;//7
				if(n==0) return 0;
				if(v.indexOf(n)>=0)  return v.size() - v.indexOf(n);  //���
			}
	}
	
	public static void main(String[] args) {
		System.out.println(f(11, 13));
//		System.out.println(110%103);
	}
}
