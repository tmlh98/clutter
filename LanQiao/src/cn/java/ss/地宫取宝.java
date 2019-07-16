package cn.java.ss;

import java.util.Scanner;

/*
 *  X 国王有一个地宫宝库。是 n x m 个格子的矩阵。每个格子放一件宝贝。每个宝贝贴着价值标签。
	    地宫的入口在左上角，出口在右下角。
	    小明被带到地宫的入口，国王要求他只能向右或向下行走。
	    走过某个格子时，如果那个格子中的宝贝价值比小明手中任意宝贝价值都大，小明就可以拿起它（当然，也可以不拿）。
	    当小明走到出口时，如果他手中的宝贝恰好是k件，则这些宝贝就可以送给小明。
	    请你帮小明算一算，在给定的局面下，他有多少种不同的行动方案能获得这k件宝贝。
	【数据格式】
	    输入一行3个整数，用空格分开：n m k (1<=n,m<=50, 1<=k<=12)
	    接下来有 n 行数据，每行有 m 个整数 Ci (0<=Ci<=12)代表这个格子上的宝物的价值
	    要求输出一个整数，表示正好取k个宝贝的行动方案数。该数字可能很大，输出它对 1000000007 取模的结果。
	例如，输入：
	2 2 2
	1 2
	2 1
	程序应该输出：
	2
	再例如，输入：
	2 3 2
	1 2 3
	2 1 5
	程序应该输出：
	14
 */
public class 地宫取宝 {
	static int n ,m;
	static int count = 0;
	static int[][] arr ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int [n][m];
		int k = sc.nextInt();//k件宝贝
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		run(0,0,k,0);
		System.out.println(count/2%1000000007);
		sc.close();
	}
	
	private static void run(int i, int j, int k, int jz) {
		if((k == 0 && i ==n-1 && j==m)||(k == 0 && i ==n && j==m-1) ){//不要忽略最后一个格子
			count ++ ;
			return ;
		}
		if(i==n || j==m || k< 0){
			return;
		}
		if(jz < arr[i][j]){//可以选择拿
			run(i + 1, j, k -1, arr[i][j]);
			run(i , j +1, k -1, arr[i][j]);
			run(i + 1, j, k , jz);
			run(i , j +1, k , jz);
		}else{//拿不了
			run(i + 1, j, k , jz);
			run(i , j +1, k , jz);
		}
		
		
	}
}
