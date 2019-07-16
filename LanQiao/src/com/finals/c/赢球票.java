package com.finals.c;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 某机构举办球票大奖赛。获奖选手有机会赢得若干张球票。
	主持人拿出 N 张卡片（上面写着 1~N 的数字），打乱顺序，排成一个圆圈。
	你可以从任意一张卡片开始顺时针数数: 1,2,3.....
	如果数到的数字刚好和卡片上的数字相同，则把该卡片收入囊中，从下一个卡片重新.数数。
	直到再无法收获任何卡片，游戏结束。囊中卡片数字的和就是赢得球票的张数。
	
	比如：
	卡片排列是：1 2 3
	我们从1号卡开始数，就把1号卡拿走。再从2号卡开始，但数的数字无法与卡片对上，
	很快数字越来越大，不可能再拿走卡片了。因此这次我们只赢得了1张球票。
	
	还不算太坏！如果我们开始就傻傻地从2或3号卡片数起，那就一张卡片都拿不到了。
	
	如果运气好，卡片排列是 2 1 3
	那我们可以顺利拿到所有的卡片！
	
	本题的目标就是：已知顺时针卡片序列。
	随便你从哪里开始数，求最多能赢多少张球票（就是收入囊中的卡片数字之和）
	
	输入数据：
	第一行一个整数N(N<100)，表示卡片数目
	第二行 N 个整数，表示顺时针排列的卡片
	
	输出数据：
	一行，一个整数，表示最好情况下能赢得多少张球票
	
	比如：
	用户输入：                                再比如
	3                  3
	1 2 3              2 1 3
	
	程序应该输出：
	1                   6
	
 */
public class 赢球票 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		int [] MAX = new int [N];//用来记录每次从不同位置开始取球票的情况
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < MAX.length; i++) {
			int [] copyArr = Arrays.copyOf(arr,arr.length);//拷贝原数组
			MAX[i] = run(copyArr);//记录赢得的球票
			arrGo(arr);//交换位置
		}
		
		Arrays.sort(MAX);
		System.out.println(MAX[MAX.length - 1]);
		sc.close();
	}
	//数组前移所有元素一位
	private static void arrGo(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length -1 ] = temp;
	}

	//返回球票数
	private static int run(int[] arr) {
		int max = getMax(arr),qp = 0;
		int count = 1;
		
		sign:while(true){
			for (int i = 0; i < arr.length; i++) {
				if( count  == arr[i]){
					qp += arr[i];
					arr[i] = -1;
					count = 1;
					max = getMax(arr);//取数组中的最大值
				}
				if(arr[i] != -1)count ++;
				if(count > max ) break sign;
			}
		}
		return qp;
	}

	//取数组最大值
	private static int getMax(int[] arr) {
		int arrMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if( arrMax <arr [i]) arrMax = arr[i];
		}
		return arrMax;
	}
		
}
