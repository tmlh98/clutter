package com.tx.model.recursion;

public class 八皇后 {
	
	static int count = 0;//计算总数
	
	static final int QUEEN = 8;//8个皇后
	
	static int[] cols = new int [QUEEN];//定义cols数组，表示8列棋子皇后摆放的位置
	
	/**
	 * @param n 填充第n列的皇后
	 */
	public static void f(int n) {
		boolean [] rows = new boolean[QUEEN];//记录每列每个方格是否可以放皇后
		
		for (int i = 0; i < n; i++) {
			rows[cols[i]] = true;
			int d = n - i;//斜对角
			//正斜方向
			if(cols[i]-d>=0){
				rows[cols[i] -d] = true;
			}
			//反斜方向
			if(cols[i]+d<=(QUEEN-1)){
				rows[cols[i]+d] = true;
			}
		}
		//到此知道了哪些位置不能放皇后
		for(int i = 0;i<QUEEN;i++){
			if(rows[i]){
				//不能放
				continue;
			}
			cols[n] = i;
			if(n<QUEEN-1){
				f(n+1);
			}else{
				//找到完整的一套方案
				count++;
				printQueen();
			}
			//下面可能仍然有合法位置
		}
		
	}
	
	private static  void printQueen() {
		System.out.println("第"+count+"种方案");
		for(int i = 0;i<QUEEN;i++){
			for(int j = 0;j<QUEEN;j++){
				if(i == cols[j]){
					System.out.print("0 ");
				}else{
					System.out.print("+ ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		f(0);
	}

	
	
}
