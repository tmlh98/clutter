package com.tx.model.recursion;
/*
 * С���ոտ����Ӱ����39��̨�ס����뿪��ӰԺ��ʱ��������������ǰ��̨������ǡ����39��!
 * վ��̨��ǰ����ͻȻ������һ�����⣺
 * 		�����ÿһ��ֻ������1����2��̨�ס�������ţ�Ȼ�����ҽ��棬���һ�������ҽţ�
 * 		Ҳ����˵һ��Ҫ��ż��������ô������39��̨�ף��ж����ֲ�ͬ���Ϸ��أ�
 * �������ü���������ƣ�����С��Ѱ�Ҵ𰸡�
 */
public class ��39��̨�� {
	
	public static void main(String[] args) {
		
		f(0 , true);
		System.out.println(count);
		
		System.out.println(f(5));
		System.out.println(f(39));
	}


	// ������
	static long g(int n)
	{
		if(n==0) return 0;
		if(n==1) return 1;
		//if(n==2) return 1;
		
		return f(n-1) + f(n-2);
	}
	
	// ż����
	static long f(int n)
	{
		if(n==0) return 1;
		if(n==1) return 0;
		//if(n==2) return 1;
		
		return g(n-1) + g(n-2);
	}
	
	
	static long count = 0;
	
	//n ����¥���� , b ��false�������
	private static void f(int n, boolean b) {
		if(n == 39 && b){
			count ++;
			return;
		}
		if(n >= 39 && !b)return;
		f(n + 1, !b);
		f(n + 2, !b);
	}

	 
		
}
