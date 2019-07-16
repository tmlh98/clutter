package com.lqb.bgroup;

public class 愤怒小鸟 {
/*
 * 一根平直的铁轨上两火车间相距 1000 米
	两火车 （不妨称A和B） 以时速 10米/秒 相对行驶。
	
	愤怒的小鸟从A车出发，时速50米/秒，撞向B车，
	然后返回去撞A车，再返回去撞B车，如此往复....
	两火车在相距1米处停车。
	
	问：这期间愤怒的小鸟撞 B 车多少次？
 */
	public static void main(String[] args) {
		double path=1000;
		int count = 0;
		while(path >= 1){
			path-=(path/60)*20;//从a到b
			count++;
			path-=(path/60)*20;//从b到a
		}
		System.out.println(count);
	}
}
