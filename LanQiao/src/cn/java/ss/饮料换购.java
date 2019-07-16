package cn.java.ss;

import java.util.Scanner;

/*
 * 乐羊羊饮料厂正在举办一次促销优惠活动。乐羊羊C型饮料，凭3个瓶盖可以再换一瓶C型饮料，并且可以一直循环下去，但不允许赊账。
	请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，那么，对于他初始买入的n瓶饮料，最后他一共能得到多少瓶饮料。
	
	输入：一个整数n，表示开始购买的饮料数量（0<n<10000）
	输出：一个整数，表示实际得到的饮料数
	
	例如：
	用户输入：
	100
	程序应该输出：
	149
	
	用户输入：
	101
	程序应该输出：
	151
 */
public class 饮料换购 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0,count =0;
		while(a >= 3){
			count += a;
			b += a % 3;
			a = a/3 + b/3;
		}
		while(b >= 3){
			a = b / 3;
			b = b % 3 + a;
			count += a;
		}
		System.out.println(count);
		sc.close();
	}
}
