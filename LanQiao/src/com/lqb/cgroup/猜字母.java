package com.lqb.cgroup;

public class ����ĸ {
/*
 * ��abcd...s��19����ĸ��ɵ������ظ�ƴ��106�Σ��õ�����Ϊ2014�Ĵ���

    ������ɾ����1����ĸ������ͷ����ĸa�����Լ���3������5������������λ�õ���ĸ��

    �õ����´��ٽ���ɾ������λ����ĸ�Ķ����������ȥ�����ֻʣ��һ����ĸ����д������ĸ��

     ����һ��Сд��ĸ����ͨ��������ύ�𰸡���Ҫ��д�κζ�������ݡ�
 */
	public static void main(String[] args) {
		//����a-s
		String str=new String();
		for (int i = 97; i < 116; i++) {
			str+=(char)i;
		}
		//���쳤��Ϊ2014�Ĵ�
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < 106; i++) {
			sb.append(str);
		}
		
		str=sb.toString();
		//ÿ���õ��´�
		while(str.length()>1){
			String str1=new String();
			for (int i = 1; i <= str.length(); i++) {
				if(i%2==0){
					str1+=str.charAt(i-1);
				}
			}
			str=str1;
		}
		
		System.out.println(str);
	}
}
