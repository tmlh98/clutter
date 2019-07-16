package cn.java.ss;
/*
 * 我们都知道：1+2+3+ ... + 49 = 1225
	现在要求你把其中两个不相邻的加号变成乘号，使得结果为2015
	比如：
	1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015
	就是符合要求的答案。
	请你寻找另外一个可能的答案，并把位置靠前的那个乘号左边的数字提交（对于示例，就是提交10）。
 */
public class 加法变乘法 {
	public static void main(String[] args) {
		for (int i = 1; i < 49; i++) {
			for (int j = i + 2; j < 49; j++) {
				int temp = i*(i+1) +j*(j+1);
				if(2015 == 1225 + temp - 2*i - 2*j - 2){
					System.out.println(i);
				}
			}
		}
	}
}
