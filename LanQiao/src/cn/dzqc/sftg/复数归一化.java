package cn.dzqc.sftg;

import java.util.Scanner;

public class 复数归一化 {
	/**
	 * 编写函数Normalize，将复数归一化，即若复数为a+bi，归一化结果为a/Math.sqrt(a*a+b*b) + i*b/sqrt(a*a+b*b) 
	 * 。使用结构体指针类型作为函数参数可能是必要的。其中实部和虚部由键盘输入，输出为归一化结果，如果归一化结果的实部或虚部为小数的要求保留一位小数。
	 * 样例输入:（格式说明：3 4 分别为以空格隔开的实数的实部和虚部）
	 * 3 4 样例输出:0.6+0.8i
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		double a=in.nextInt();
		double b=in.nextInt();
		System.out.println(Normalize(a, b));
	}
	private static String  Normalize(double a,double b) {
		String stra=String.format("%.1f", a/(Math.sqrt(a*a+b*b)));
		String strb=String.format("%.1f", b/(Math.sqrt(a*a+b*b)));
		return stra+"+"+strb+"i";
	}

}
