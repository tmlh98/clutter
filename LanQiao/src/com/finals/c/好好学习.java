package com.finals.c;

public class �ú�ѧϰ {
	public static void main(String[] args) {
		String[] str = new String[]{"��","��","ѧ","ϰ"};
		int count = 0;
		int count2 = 0;
		for (int a = 0; a < str.length; a++) {
			for (int b = 0; b < str.length; b++) {
				if(a == b)continue;
				for (int c = 0; c < str.length; c++) {
					if(a == c || b == c )continue;
					for (int d = 0; d < str.length; d++) {
						if(a == d|| b == d || c ==d)continue;
						count ++;
						if("�ú�ѧϰ".equals(str[a] + str[b] + str[c]+str[d]))count2++;
					}
				}
			}
		}
		System.out.println(count2+"/"+count);
	}
}
/*
 * ��ķ��үү���й����Ρ�һ�죬�������й���С���������
 * ���������ı����Ƿֱ�д���Ŀ��ֽ�ϵ��ĸ����֣����á��á�ѧ��ϰ����
 * ������ķ����ʶ���֣���������ҵ�����һ��
 * ������С��ķ��һ�£�������������ǡ�����Եĸ����Ƕ��٣� 
 * ����һ�����������ʾΪ����������ֵ����ʽ�����磺1/3 �� 2/15 �ȡ�
 * ����ܹ�Լ�֣������Լ�ֺ�Ľ����
 */