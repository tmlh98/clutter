package cn.dzqc.lqb;

import java.util.Scanner;

public class �ִ�ͳ�� {
	/**
	 * ͳ���ִ�substr��str�ĳ��ִ���
	 */
	static int Strta(String str,String substr){
		int count =0;
		for (int i = 0; i <=str.length()-substr.length(); i++) {
			if(substr.equals(str.substring(i,i+substr.length()))){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		String s=in.next();
		String str1=s.substring(0,l);//��ʼ�Ƚϵ��ִ�
		int max_count=1;//�ַ��������ִ���
		for (int i = l; i <=s.length(); i++) {
			//����ַ������ܳ��ֵĳ���
			for (int j = 0; j + i<= s.length(); j++) {
				//�������
				int var=Strta(s, s.substring(j,j+i));
				if(var>max_count){
					//��ȡ���ִ��������ַ���
					max_count=var;
					str1=s.substring(j,j+i);
				}else if(var==max_count){
					if(str1.length()<i){
						str1=s.substring(j,j+i);
					}
				}
				
				
				
			}
			
			
		}
		
		System.out.println(str1);
		
	}
	
	

}
