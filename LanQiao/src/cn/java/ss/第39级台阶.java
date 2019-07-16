package cn.java.ss;
/*
 * 小明刚刚看完电影《第39级台阶》，离开电影院的时候，他数了数礼堂前的台阶数，恰好是39级!

    站在台阶前，他突然又想着一个问题：

    如果我每一步只能迈上1个或2个台阶。先迈左脚，然后左右交替，
    最后一步是迈右脚，也就是说一共要走偶数步。那么，上完39级台阶，有多少种不同的上法呢？

    请你利用计算机的优势，帮助小明寻找答案。
 */
public class 第39级台阶 {
	public static void main(String[] args) {
		System.out.println(getResult(39));
		System.out.println(getResult(39)/2);
	}
	
	public static int getResult(int a){
		if(a <= 1){
			return 1;
		}
		
		return getResult(a-1)+getResult(a-2);
	}
}
