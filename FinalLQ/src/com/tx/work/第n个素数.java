package com.tx.work;
/*
 * �������ǲ����ٽ��еȷֵ����������磺7��11����9������������Ϊ������ƽ��Ϊ3�ȷݡ�һ����Ϊ��С��������2��������3��5��... 
 * ���ʣ���100002(ʮ�����)�������Ƕ��٣�
 * ��ע�⣺2 �ǵ�һ������3 �ǵڶ����������������ơ�
 */
public class ��n������ {
	
	public static void main(String[] args) {
		int N = 1000 * 1000 * 10;
		int x = 100001;
		
		byte[] a = new byte[N];
		
		for(int i=2; i<N/2; i++)
		{
			if(a[i]==1) continue;  //  ����û���ʸ�μ�ɸ��
			
			for(int k=2; k<=N/i; k++)
			{
				if(i*k<N) a[i*k] = 1;
			}
		}
		
		
		int m = 0;
		for(int i=2; i<N; i++)
		{
			if(a[i]==0)
			{
				m++;
				if(m==x) System.out.print(i + " "); 
			}
		}
		
		
		System.out.println("m=" + m);
		
	}
	
}
