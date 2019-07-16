package cn.java.ss;

import java.util.Scanner;
/*
 * 给定一个方阵，定义连通：上下左右相邻，并且值相同。
	可以想象成一张地图，不同的区域被涂以不同颜色。
	输入：
	整数N, (N<50)表示矩阵的行列数
	接下来N行，每行N个字符，代表方阵中的元素
	接下来一个整数M，(M<1000)表示询问数
	接下来M行，每行代表一个询问，
	格式为4个整数，y1,x1,y2,x2，
	表示(第y1行,第x1列) 与 (第y2行,第x2列) 是否连通。
	连通输出true，否则false
	
	例如：
	10
	0010000000
	0011100000
	0000111110
	0001100010
	1111010010
	0000010010
	0000010011
	0111111000
	0000010000
	0000000000
	3
	0 0 9 9
	0 2 6 8 
	4 4 4 6
	
	程序应该输出：
	false
	true
	true
 */
public class 求连通性 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[][] arr = new char [N][N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().toCharArray();
		}
		
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int y1 = sc.nextInt();
			int x1 = sc.nextInt();
			int y2 = sc.nextInt();
			int x2 = sc.nextInt();
			System.out.println(f(arr,y1,x1,y2,x2));
		}
	}

	private static boolean f(char[][] arr, int y1, int x1, int y2, int x2) {
		if(y1 == y2 && x1 == x2) return true;//此时在同一个位置
		char temp = arr[y1][x1];//记录
		arr[y1][x2] = '*';//走过的位置标记为-1
		try {
			if(y1 >0&& arr[y1 -1][x1] == temp && f(arr, y1 - 1, x1, y2, x2))return true;
			if(y1 < arr.length -1&& arr[y1+ 1][x1] == temp && f(arr, y1 + 1, x1, y2, x2))return true;
			if(x1 > 0&& arr[y1][x1 -1] == temp && f(arr, y1, x1 -1, y2, x2))return true;
			if(x1 < arr.length -1&& arr[y1][x1 + 1] == temp && f(arr, y1, x1 + 1, y2, x2))return true;
			
		}finally{
			arr[y1][x1] =temp;
		}
		return false;
	}
}
