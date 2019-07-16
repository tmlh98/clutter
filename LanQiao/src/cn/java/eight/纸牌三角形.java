package cn.java.eight;
/*
 * A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。 
	下图就是一种排法（如有对齐问题，参看p1.png）。
	          A
	         9 6
	        4   8
	       3 7 5 2
	       样的排法可能会有很多。
	如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
	请你计算并提交该数字。
 */
public class 纸牌三角形 {
	static int count = 0;
	public static void main(String[] args) {
		char[] c = "123456789".toCharArray();
		run(c , 0);
		System.out.println(count/2);//432
	}

	private static void run(char[] c , int k) {
		if(k == c.length){
			int aa = c[0] +c[1] +c[3]+c[5];
			int bb = c[0] +c[2] +c[4]+c[8];
			int cc = c[5] +c[6] +c[7]+c[8];
			if(aa != bb || aa!= cc||bb!=cc)return;
			count ++;
		}
		for (int i = k; i < c.length; i++) {
			{char temp = c[i];c[i] = c[k]; c[k] = temp;}
				run(c, k+1);
			{char temp = c[i];c[i] = c[k]; c[k] = temp;}
		}
		
	}
}
