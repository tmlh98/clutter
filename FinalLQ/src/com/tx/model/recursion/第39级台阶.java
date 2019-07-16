package com.tx.model.recursion;
/*
 * 小明刚刚看完电影《第39级台阶》。离开电影院的时候，他数了数礼堂前的台阶数，恰好是39级!
 * 站在台阶前，他突然又想着一个问题：
 * 		如果我每一步只能迈上1个或2个台阶。先迈左脚，然后左右交替，最后一步是迈右脚，
 * 		也就是说一共要走偶数步。那么，上完39级台阶，有多少种不同的上法呢？
 * 请你利用计算机的优势，帮助小明寻找答案。
 */
public class 第39级台阶 {
	
	public static void main(String[] args) {
		
		f(0 , true);
		System.out.println(count);
		
		System.out.println(f(5));
		System.out.println(f(39));
	}


	// 奇数步
	static long g(int n)
	{
		if(n==0) return 0;
		if(n==1) return 1;
		//if(n==2) return 1;
		
		return f(n-1) + f(n-2);
	}
	
	// 偶数步
	static long f(int n)
	{
		if(n==0) return 1;
		if(n==1) return 0;
		//if(n==2) return 1;
		
		return g(n-1) + g(n-2);
	}
	
	
	static long count = 0;
	
	//n 代表楼梯数 , b 的false代表左脚
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
