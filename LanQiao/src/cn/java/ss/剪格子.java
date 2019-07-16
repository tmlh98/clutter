package cn.java.ss;

import java.util.Scanner;
/*
 *  	+--*--+--+
 		|10* 1|52|
 		+--****--+
 		|20|30* 1|
 		*******--+
 		| 1| 2| 3|
 		+--+--+--+
 我们沿着图中的星号线剪开，得到两个部分，每个部分的数字和都是60。
 本题的要求就是请你编程判定：对给定的m x n 的格子中的整数，是否可以分割为两个部分，使得这两个区域的数字和相等。
 如果存在多种解答，请输出包含左上角格子的那个区域包含的格子的最小数目。
 如果无法分割，则输出 0。
 输入格式
 程序先读入两个整数 m n 用空格分割 (m,n<10)。
 接下来是n行，每行m个正整数，用空格分开。每个整数不大于10000。
 输出格式
 输出一个整数，表示在所有解中，包含左上角的分割区可能包含的最小的格子数目。
 */
public class 剪格子 {
	static int m , n;
	static int min  ;//最小的格子数
	static int[][] gezi;
	static int[][] ed = new int [n][m];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int sum = 0;//求和计算两部分平均值
		gezi = new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				gezi[i][j] = sc.nextInt();
				sum += gezi[i][j];
			}
		}
		getter(0, 0, sum / 2, 0, new int[n][m]);
		System.out.println(min);
		sc.close();
	}

	private static void getter(int nn, int mm, int s, int c, int[][] ed) {
		//达到平均值
		if( s == 0)min = c;
		if(s < 0)return;//跳出条件
		//搜索出所有情况
		if(mm < m && nn < n && mm >= 0 && nn >= 0){
			if(ed[nn][mm] == 0){
				s -= gezi[nn][mm];
				ed[nn][mm] = 1;//标记为1此时
				getter(nn + 1, mm, s, c + 1, ed);
				getter(nn - 1, mm, s, c + 1, ed);
				getter(nn, mm + 1, s, c + 1, ed);
				getter(nn, mm - 1, s, c + 1, ed);
				ed[nn][mm] = 0;
			}
		}
		return ;
	}
}
