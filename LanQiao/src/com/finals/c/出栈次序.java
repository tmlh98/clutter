package com.finals.c;

public class 出栈次序 {
	public static void main(String[] args) {
		for (int i = 0; i < 17; i++) {
			System.out.println(f(i , 0));
		}
	}
	
	//a 等待进栈数目 b ：栈中的数目
	private static int f(int a , int b) {
		if(a == 0) return 1;
		if(b == 0) return f(a -1, 1);
		//考虑进栈及出栈次序
		return f(a -1 , b + 1) + f( a, b -1);
	}
	
}
/*
 * X星球特别讲究秩序，所有道路都是单行线。一个甲壳虫车队，共16辆车，按照编号先后发车，夹在其它车流中，缓缓前行。
 * 路边有个死胡同，只能容一辆车通过，是临时的检查站，如图【p1.png】所示。
 * X星球太死板，要求每辆路过的车必须进入检查站，也可能不检查就放行，也可能仔细检查。
 * 如果车辆进入检查站和离开的次序可以任意交错。那么，该车队再次上路后，可能的次序有多少种？
 * 为了方便起见，假设检查站可容纳任意数量的汽车。
 * 显然，如果车队只有1辆车，可能次序1种；2辆车可能次序2种；3辆车可能次序5种。
 * 现在足足有16辆车啊，亲！需要你计算出可能次序的数目。
 * 这是一个整数，请通过浏览器提交答案，不要填写任何多余的内容（比如说明性文字）。
 */