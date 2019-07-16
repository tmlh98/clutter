package cn.java.ss;

/*
 *  如【图1.jpg】, 有12张连在一起的12生肖的邮票。
	现在你要从中剪下5张来，要求必须是连着的。
	（仅仅连接一个角不算相连）
	比如，【图2.jpg】，【图3.jpg】中，粉红色所示部分就是合格的剪取。
	请你计算，一共有多少种不同的剪取方法。
	+--+--+--+--+
   	|  |  |  |  |
	+--+--+--+--+
	|  |  |  |  |
	+--+--+--+--+
	|  |  |  |	|
	+--+--+--+--+
 */
public class 剪邮票 {
	//构造矩阵
	static int cc[][] = {
        {1,1,0,0,1,0,0,0,0,0,0,0},
        {1,1,1,0,0,1,0,0,0,0,0,0},
        {0,1,1,1,0,0,1,0,0,0,0,0},
        {0,0,1,1,0,0,0,1,0,0,0,0},
        {1,0,0,0,1,1,0,0,1,0,0,0},
        {0,1,0,0,1,1,1,0,0,1,0,0},
        {0,0,1,0,0,1,1,1,0,0,1,0},
        {0,0,0,1,0,0,1,1,0,0,0,1},
        {0,0,0,0,1,0,0,0,1,1,0,0},
        {0,0,0,0,0,1,0,0,1,1,1,0},
        {0,0,0,0,0,0,1,0,0,1,1,1},
        {0,0,0,0,0,0,0,1,0,0,1,1},
};

	public static void main(String[] args) {
		int sum = 0;
		// 五层循环筛选结果
//		for (int i = 0; i < 8; i++) {
//			for (int j = i + 1; j < 9; j++) {
//				for (int j2 = j + 1; j2 < 10; j2++) {
//					for (int k = j2 + 1; k < 11; k++) {
//						for (int k2 = k + 1; k2 < 12; k2++) {
//							if (f(new int[] { i, j, j2, k, k2 })) {
//								System.out.println(i + 1 + " " + (j + 1) + " "
//										+ (j2 + 1) + " " + (k + 1) + " "
//										+ (k2 + 1));
//								sum++;
//							}
//						}
//					}
//				}
//			}
//		}
		int[] c = {7,8,9,10,11};
		System.out.println(f(c));
		System.out.println(sum);
	}
	//判断是否连续
	//逐一判断每个被选中的位置是否能够到达其他位置
	private static boolean f(int[] is) {
		int index = 0,count = 0;//下标,计数
		int[][] ss =new int [5][2];
		for (int i : is) {
			boolean flag = false;
			for (int j : is) {
				if(cc[i][j] == 1 && i != j){
					if(!flag){
						System.out.println(i+","+j);
						ss[index][0] =i;
						ss[index][1] =j;
						index++;
						count++;
						flag = true;
					}
				}
			}
		}
		if(count == 5){
			int count2=0;
			for (int i = 0; i < 5; i++) {
				for (int j = i; j < ss.length; j++) {
					if(ss[i][0] == ss[j][1] && ss[i][1] == ss[j][0]){
						count2++;
					}
				}
			}
			if(count2>1){
				return false;
			}		
			return true;
		}
		return false;
	}
}
