package cn.java.ss;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 问题描述
	　　有n个小朋友围坐成一圈。老师给每个小朋友随机发偶数个糖果，然后进行下面的游戏：
	　　每个小朋友都把自己的糖果分一半给左手边的孩子。
	　　一轮分糖后，拥有奇数颗糖的孩子由老师补给1个糖果，从而变成偶数。
	　　反复进行这个游戏，直到所有小朋友的糖果数都相同为止。
	　　你的任务是预测在已知的初始糖果情形下，老师一共需要补发多少个糖果。
	输入格式
	　　程序首先读入一个整数N(2<N<100)，表示小朋友的人数。
	　　接着是一行用空格分开的N个偶数（每个偶数不大于1000，不小于2）
	输出格式
	　　要求程序输出一个整数，表示老师需要补发的糖果数。
	样例输入
	3
	2 2 4
	样例输出
	4
 */
public class 分糖果 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int [N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		while(true){
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int i = 0; i < a.length; i++) {
				hs.add(a[i]);
				
				if(a[i] %2 == 1){//糖果为奇数时
					a[i]++;//补发糖果
					count++;
				}
				
			}
			if(hs.size() == 1){//此时每个小朋友的糖果数量都相等
				break;
			}
			for (int i = 0; i < a.length; i++) {
				int temp = a[0] / 2;
				if(i == a.length - 1)
					a[a.length - 1] =a[a.length - 1]/2+ temp;
				else if(i == 0)
					a[0] = temp + a[1] / 2;
				else
					a[i] = a[i]/2+a[i + 1] / 2;
			}
		}
		
		System.out.println(count);
	}

}
