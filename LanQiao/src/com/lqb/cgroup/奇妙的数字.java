package com.lqb.cgroup;

import java.util.ArrayList;
import java.util.List;

public class ��������� {

	/**
	 * С��������һ����������֡�����ƽ�����������ð�0~9��10������ÿ������ֻ����һ�Ρ�
	 * ���ܲ³���������Ƕ�����
	 */
	public static void main(String[] args) {
		for (int i = 47; i < 100; i++) {
			String j=i*i+"";
			String k=i*i*i+"";
			List<Character> list=new ArrayList<Character>();
			char[] c=j.toCharArray();
			for (int l = 0; l < c.length; l++) {
				list.add(c[l]);
			}
			char[] c1=k.toCharArray();
			for (int l = 0; l < c1.length; l++) {
				list.add(c1[l]);
			}
			Character [] c2=new Character[list.size()];
			Character [] c3=list.toArray(c2);
			if(result(c3))
				System.out.println(i);
		}

	}
	public static boolean result(Character [] c ){
		for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]){
					return false;
				}
			}
		}
		return true;
	}

}
