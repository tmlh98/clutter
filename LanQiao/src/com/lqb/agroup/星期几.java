package com.lqb.agroup;
/*
 * 
    1949��Ĺ���ڣ�10��1�գ����������� 
	    ���꣨2012���Ĺ����������һ��
	    ��ô���ӽ��������ڣ��м��ι�����������������أ�
	    ֻҪ�𰸣������ֶΣ�
	    ������windows������windows��������Excel��ʽ������������
	    ��Ȼ��Ҳ���Ա�̣�
	    ��Ҫ��д����������Щ�ֻ꣬Ҫһ����Ŀ��
 */
public class ���ڼ� {
	public static void main(String[] args) {
		int day = 92;
		int count = 0;
		for (int i = 1950; i <= 2012; i++) {
			 if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))//����366�� ƽ��365��
	                day += 366;
	           else 
	                day += 365;
	            if(day % 7 == 1){
	            	count++;
	            }
		}
		System.out.println(count);
	}
}
