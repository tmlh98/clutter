package com.finals.c;
/*
 * 少年宫新近邮购了小机器人配件，共有3类，其中，
		A类含有：8个轮子，1个传感器
		B类含有: 6个轮子，3个传感器
		C类含有：4个轮子，4个传感器
	他们一共订购了100套机器人，收到了轮子600个，传感器280个。
	根据这些信息请你计算：B类型机器人订购了多少个？
 */
public class 机器人数目 {
	public static void main(String[] args) {
		for (int i =0 ; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				for (int j2 = 0; j2 <= 100; j2++) {
					if( i + j + j2==100 && 8*i+6*j+4*j2 == 600&& i + 3*j+4*j2 == 280){
						System.out.println( i + " " +j+ " "+ j2);
					}
				}
			}
		}
	}
}
