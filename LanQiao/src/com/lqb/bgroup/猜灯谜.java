package com.lqb.bgroup;

/*
 * ���⣺�µ���
	A ���Ԫ���ڵƻ�����һ���⣺
	����� * ����� = ����͵Ʊ߲�
	С���룬һ����ÿ�����ִ���һ�����֣���ͬ�ĺ��ִ���ͬ�����֡�
	�����ü������С����˼·��һ�£�Ȼ���ύ������ա���������������������ɡ� ���ϸ��ո�ʽ��ͨ��������ύ�𰸡�
	ע�⣺ֻ�ύһ��3λ����������Ҫд�����������ݣ����磺˵���Ե����֡�
 */
public class �µ��� {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100; 
			int b = i / 10 % 10; 
			int c = i % 10; 
			if(a != b && a != c && b != c){
				int res = i * i;
				if(res >=100000 && res < 1000000 && res / 100000 == a && res % 10 == b  ){
					System.out.println(i);
					System.out.println(res);
				}
			}
		}
	}
}
