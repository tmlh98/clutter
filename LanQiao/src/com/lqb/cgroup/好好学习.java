package com.lqb.cgroup;

public class �ú�ѧϰ {
	/*
	 * ��ķ��үү���й����Ρ�һ�죬�������й���С���������
	 * ���������ı����Ƿֱ�д���Ŀ��ֽ�ϵ��ĸ����֣����á��á�ѧ��ϰ����������ķ����ʶ���֣���������ҵ�����һ�С�
	 * ������С��ķ��һ�£�������������ǡ�����Եĸ����Ƕ��٣� ����һ�����������ʾΪ����������ֵ����ʽ�����磺1/3 �� 2/15 �ȡ�
	 * ����ܹ�Լ�֣������Լ�ֺ�Ľ����
	 */
	public static void main(String[] args) {
		int count = 0, sum = 0;
		String[] str = new String[] { "��", "��", "ѧ", "ϰ" };
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				for (int k = 0; k < str.length; k++) {
					for (int z = 0; z < str.length; z++) {
						// ����ɸѡ
						if (i != j && i != k && i != z && j != z && j != k
								&& k != z) {
							count++;
							if ((str[i] + str[j] + str[k] + str[z])
									.equals("�ú�ѧϰ"))
								sum++;
						}
					}
				}
			}
		}
		System.out.println(sum + "/" + count);
	}
}
