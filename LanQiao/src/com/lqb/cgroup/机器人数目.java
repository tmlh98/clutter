package com.lqb.cgroup;

public class 机器人数目 {
/*
 * 少年宫新近邮购了小机器人配件，共有3类，其中，
 *A类含有：8个轮子，1个传感器
 *B类含有: 6个轮子，3个传感器
 *C类含有：4个轮子，4个传感器
 *
 *他们一共订购了100套机器人，收到了轮子600个，传感器280个。
 *根据这些信息请你计算：B类型机器人订购了多少个？
 */
	public static void main(String[] args) {
		/*
		 * 8a+6b+4c=600
		 * a+3b+4c=280
		 * a+b+c=100
		 */
		for (int a = 0; a < 100; a++) {
			for (int b = 0; b < 100; b++) {
				for (int c = 0; c < 100; c++) {
					 int a1 = a + b + c;
					 int b1 = 8 * a + 6 * b + 4 * c;
					 int c1 = a + 3 * b + 4 * c;
					 if(a1 == 100 && b1 == 600 && c1 == 280)
						System.out.println("a = "+a+", b = "+b+", c = "+c);
					
				}
			}
		}
	}
}
