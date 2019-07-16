package com.lqb.bgroup;

/*
 * 标题：猜灯谜
	A 村的元宵节灯会上有一迷题：
	请猜谜 * 请猜谜 = 请边赏灯边猜
	小明想，一定是每个汉字代表一个数字，不同的汉字代表不同的数字。
	请你用计算机按小明的思路算一下，然后提交“请猜谜”三个字所代表的整数即可。 请严格按照格式，通过浏览器提交答案。
	注意：只提交一个3位的整数，不要写其它附加内容，比如：说明性的文字。
 */
public class 猜灯谜 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100; 
			int b = i / 10 % 10; 
			int c = i % 10; 
			if(a != b && a != c && b != c){
				int res = i * i;
				if(res >=100000 && res < 1000000 && res / 100000 == a && res % 10 == b  ){
					System.out.println(i);
					System.out.println(res);
				}
			}
		}
	}
}
