package cn.java.ss;
/*
 * ����ķ�������ʱ�������ڹ̶������֡�
 */
public class ������� {
	public static void main(String[] args) {
		System.out.println(f(1.0));
	}
	public static double f(double x) {
		if (x == 100)
		return x;
		return x / (x + f(x + 1));
	}
}
