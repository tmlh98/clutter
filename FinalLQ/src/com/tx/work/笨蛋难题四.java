package com.tx.work;

import java.util.Scanner;

/*
 * 描述 
	这些日子笨蛋一直研究股票，经过调研，终于发现xxx公司股票规律，
	更可喜的是 笨蛋推算出这家公司每天的股价，为了防止别人发现他的秘密。
	他决定对于这家公司的 股票最多买一次，现在笨蛋已经将股票价格列了出来。
	（这已经不是笨蛋的难题了，他已经解决 呵 呵）。只想难为难为你呀，从股票价格表上，你能算出笨蛋的每股股票最多能赚多少钱吗？
	                 
	输入
	第一行一个n，表示n天(小于100000)
	第二行 给出n天每股的价格
	输出
	每股最多赚多少钱
	样例输入
	4
	947 267 359 771
	7
	669 735 322 794 397 565 181  
	样例输出
	504
	472
 */
public class 笨蛋难题四 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i =0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		
		int min = arr[0];
		int maxMoney = 0;
		
		for (int i = 0; i < arr.length -1; i++) {
			if(arr[i] < min){
				
				min = arr[i];//保存最小值
			}
			maxMoney = Math.max(arr[i + 1] - min, maxMoney);//取差值
			
		}
		
		System.out.println(maxMoney);
		sc.close();
	}
}
