package com.finals.c;

/*
 * X星球愤怒的小鸟喜欢撞火车！
 一根平直的铁轨上两火车间相距 1000 米
 两火车 （不妨称A和B） 以时速 10米/秒 相对行驶。

 愤怒的小鸟从A车出发，时速50米/秒，撞向B车，
 然后返回去撞A车，再返回去撞B车，如此往复....
 两火车在相距1米处停车。

 问：这期间愤怒的小鸟撞 B 车多少次？
 注意：需要提交的是一个整数（表示撞B车的次数），不要填写任何其它内容。
 */
public class 愤怒小鸟 {
	public static void main(String[] args) {
		double path=1000;
		int count = 0;
		while(path >= 1){
			path-=(path/60)*20;//从a到b
			path-=(path/60)*20;//从b到a
			count++;
		}
		System.out.println(count);
	}
}
