package com.tx.work;
/*
 * 素数就是不能再进行等分的整数。比如：7，11。而9不是素数，因为它可以平分为3等份。一般认为最小的素数是2，接着是3，5，... 
 * 请问，第100002(十万零二)个素数是多少？
 * 请注意：2 是第一素数，3 是第二个素数，依此类推。
 */
public class 第n个素数 {
	
	public static void main(String[] args) {
		int N = 1000 * 1000 * 10;
		int x = 100001;
		
		byte[] a = new byte[N];
		
		for(int i=2; i<N/2; i++)
		{
			if(a[i]==1) continue;  //  和数没有资格参加筛法
			
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
