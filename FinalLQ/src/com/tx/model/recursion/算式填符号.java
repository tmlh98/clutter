package com.tx.model.recursion;

/*
 * �˾��벦110,��ʹ�ֻ�Ƿ��Ҳ�ɲ�ͨ��
	Ϊ�˱���������򣬱�������Ⱥ�������Ʋ���ȫ������������Ҫ���ﷸ���Ƕ��£������Ҫ�����Եؽ�������ѵ��������ѵ����
	
	ĳ�������������ڽ�������ѵ����
	1 2 3 4 5 6 7 8 9 = 110
	
	�뿴�ϱߵ���ʽ��Ϊ��ʹ��ʽ��������Ҫ�����ּ�����ӺŻ��߼��ţ����Բ�������������������ţ���
	֮��û��������ŵ�������ϳ�һ���������磺12+34+56+7-8+9 ����һ�ֺϸ�����123+4+5+67-89 ����һ�����ܵĴ𰸡�
	
	�������ü���������ƣ�����������������ҵ����д𰸡�
	ÿ����ռһ�С����磺
	12+34+56+7-8+9
	123+4+5+67-89
	......

 */
public class ��ʽ����� {
	
	public static void main(String[] args) {
		
		f("" , 1);							
	}
	static String[] s = new String[]{"+","-",""};
	private static void f(String str, int n) {
		if(n > 9) g(str.trim());
		if(n == 9)f(str + n, n + 1);
		for (String s1 : s) {
			if(n < 9)f(str + n + s1, n + 1);
		}
	}
	private static void g(String str) {
		int count = 0;
		String[] s1 = str.split("[+]");
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].indexOf("-") != -1){//���ڼ���
				String[] s2 = s1[i].split("[-]");
				count += Integer.valueOf(s2[0]);
				for (int j = 1; j < s2.length; j++) {
					count -= Integer.valueOf(s2[j]);
				}
			}else{
				count += Integer.valueOf(s1[i]);
			}
		}
		if(count == 110)System.out.println(str);
	}

	 
}
