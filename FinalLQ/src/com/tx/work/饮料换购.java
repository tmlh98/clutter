package com.tx.work;

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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = getResult(n);
		
		System.out.println(result);
		sc.close();
	}
	
	//3个瓶盖可以换一瓶
	private static int getResult(int n) {
		int count = n;//实际得到的饮料数
		
		int pg = n;//瓶盖的数量
		
		while(pg >= 3){
			count += pg /3; 
			pg = pg / 3 + pg % 3;//用99个饮料瓶换取了 33个瓶盖加上   余下的一个瓶盖
		}
		
		return count;
		
	}
}	
