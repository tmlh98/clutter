package com.finals.c;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 小明冒充X星球的骑士，进入了一个奇怪的城堡。城堡里边什么都没有，只有方形石头铺成的地面。
	假设城堡地面是 n x n 个方格。【如图1.png】所示。
	
	按习俗，骑士要从西北角走到东南角。
	可以横向或纵向移动，但不能斜着走，也不能跳跃。
	每走到一个新方格，就要向正北方和正西方各射一箭。
	（城堡的西墙和北墙内各有 n 个靶子）
	
	同一个方格只允许经过一次。但不必做完所有的方格。
	如果只给出靶子上箭的数目，你能推断出骑士的行走路线吗？
	有时是可以的，比如图1.png中的例子。
	本题的要求就是已知箭靶数字，求骑士的行走路径（测试数据保证路径唯一）
	
	输入：
	第一行一个整数N(0<N<20)，表示地面有 N x N 个方格
	第二行N个整数，空格分开，表示北边的箭靶上的数字（自西向东）
	第三行N个整数，空格分开，表示西边的箭靶上的数字（自北向南）
	
	输出：
	一行若干个整数，表示骑士路径。
	
	为了方便表示，我们约定每个小格子用一个数字代表，从西北角开始编号: 0,1,2,3....
	比如，图1.png中的方块编号为：
	
	0  1  2  3
	4  5  6  7
	8  9  10 11
	12 13 14 15
	
	
	示例：
	用户输入：
	4
	2 4 3 4
	4 3 3 3
	
	程序应该输出：
	0 4 5 1 2 3 7 11 10 9 13 14 15
 
 */
public class 路径之谜 {
	
	static int N = 0;
	
	static int[] jt ;//箭头数目
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		jt = new int[N *2];
		for (int i = 0; i < 2 * N; i++) {
				jt[i] = sc.nextInt();
		}
		//构造一个迷宫，默认使用初始值为0
		int[][] mg = new int [N][N];
		
		dfs(0,0, mg , 1);
		sc.close();
	}
	/**
	 * @Description: TODO(使用深度优先) 
	 * @param @param y 行坐标
	 * @param @param x 列坐标
	 * @param @param mg 构造地图
	 * @param @param weizhi    记录行走的位置,用1,2,3,4......表示
	 */
	private static void dfs(int y, int x, int [][] mg ,int weizhi) {
		if( y == N-1 && x == N - 1){
			//把迷宫最后一个格子打上记号
			mg[N -1][N -1] = -2;
			judge(mg);
			return;
		}
		int temp = mg[y][x];
		mg[y][x] = weizhi;//标记为以走过
		try{
			if(y > 0 && temp == 0)dfs(y - 1, x, mg , weizhi+1);
			if(y < N -1 && temp ==0)dfs(y + 1, x,  mg, weizhi+1);
			if(x > 0 && temp == 0 )dfs(y, x - 1,  mg, weizhi+1);
			if(x < N -1 && temp == 0)dfs(y, x +1,  mg, weizhi+1);
		}finally{
			mg[y][x] = temp;//还原为未走过的痕迹
		}
	}
	/**
	 * @Description: TODO(判断是否符合要求,并输出结构) 
	 * @param @param mg    走过后的迷宫
	 */
	private static void judge(int[][] mg) {
		
		int [] arr = new int [N *2];
		//根据已走过迷宫计算靶子上箭的数目
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(mg[i][j] != 0){
					arr[j] ++;
					arr[i + N] ++;
				}
			}
		}
		
		if(Arrays.equals(jt, arr)){
			
			int index = 0;
			int [] a = new int [N * N];//保存路线的位置
			int [] b = new int [N * N];//保存对应的值
			for (int i = 0; i < mg.length; i++) {
				for (int j = 0; j < mg.length; j++) {
					if(mg[i][j] != 0){
						a[index] = j + i * N;
						b[index] = mg[i][j];
						index ++; 
					}
				}
			}
			int sum = 1;
			f:for (;;) {
				for (int i = 0; i < b.length; i++) {
					if(b[i] == sum){
						System.out.print(a[i] + " ");
						i = 0;
						sum ++;
					}
					if(b[i] == 0){
						System.out.println(a[i -1]);
						break f;
					}
				}
			}
			
			
		}
		
	}
}
