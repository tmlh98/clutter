package com.finals.c;

import java.util.List;
import java.util.Vector;

public class ���ֲ�� {
	public static List fen(int n, int limit){
		Vector v = new Vector();
		if(n<=limit) v.add(n);
		
		for(int i=1; i<n; i++){
			if(n-i > limit) continue;

			List t = fen(i,n-i);
			
			for(int k=0; k<t.size(); k++)
				v.add(n - i + "+" +t.get(k));  //���λ��
		}
		
		return v;
	}

	public static void main(String[] args) {
		List v = fen(6, 6);
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
	}
}
/*
 * ���������Ա�ʾΪ�������������ۼӺ͡� �磬����������n=6�����Էֻ�Ϊ�� 
 * 6 
 * 5+1 
 * 4+2 4+1+1 
 * 3+3 3+2+1 3+1+1+1 
 * 2+2+2 2+2+1+1 2+1+1+1+1
 * 1+1+1+1+1+1 ���ڵ������ǣ����ڸ�����������n,��������л��������
 * ����Ĵ���ʵ����������ܡ���ϸ��������д���߲���ȱʧ�Ĵ��롣 ע�⣺ͨ��������ύ�𰸡�ֻ��дȱ�ٵ����ݣ���Ҫ��д�κζ�������ݣ����磺˵��������
 */