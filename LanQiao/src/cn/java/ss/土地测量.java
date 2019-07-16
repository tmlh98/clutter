package cn.java.ss;
/*
 *  各条边长数据如下：
    AB = 52.1
    BC = 57.2
    CD = 43.5
    DE = 51.9
    EA = 33.4
    EB = 68.2
    EC = 71.9
 */
public class 土地测量 {
	static double getResult(double d, double e,double f){
		double s = (d+e+f)/2;
		return  Math.sqrt(s*(s-d)*(s-e)*(s-f));
	}
	public static void main(String[] args) {
		double num1 = getResult(33.4, 52.1, 68.2);
		double num2 = getResult(57.2, 71.9, 68.2);
		double num3 = getResult(51.9, 43.5, 71.9);
		double count = num1+num2+num3;
		System.out.print(String.format("%.2f", count));
	}
}
