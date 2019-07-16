package cn.java.ss;
/*
 * 无穷的分数，有时会趋向于固定的数字。
 */
public class 无穷分数 {
	public static void main(String[] args) {
		System.out.println(f(1.0));
	}
	public static double f(double x) {
		if (x == 100)
		return x;
		return x / (x + f(x + 1));
	}
}
