package com.tx.model.recursion;

public class _4������� {
	// m����ͬ�����У�ȡn�������Żأ����ж�����ȡ��
	// ������һ������ġ�����
	// ���񻮷�Ϊ�� 1.����������ȡ��������
	// 2. ���������벻ȡ��������
	
	public static int f(int m , int n){
		if(n == 1 || n == m) return 1;
		return f(m -1, n) + f(m -1, n -1);
	}
	public static void main(String[] args) {
		System.out.println(f(5, 2));
		
		// �̶���Ŀ���������
		// ABCDE ��ȡ3��
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = (char)(i + 1); j <= 'E'; j++) {
				for (char k = (char)(j + 1); k <= 'E'; k++) {
					System.out.println(i+""+j+""+k);
				}
			}
		}
	}
}
