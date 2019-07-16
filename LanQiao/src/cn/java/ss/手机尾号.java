package cn.java.ss;

import java.util.Scanner;

/*
 30年的改革开放，给中国带来了翻天覆地的变化。2011全年中国手机产量约为11.72亿部。手机已经成为百姓的基本日用品！

 给手机选个好听又好记的号码可能是许多人的心愿。但号源有限，只能辅以有偿选号的方法了。

 这个程序的目的就是：根据给定的手机尾号（4位），按照一定的规则来打分。其规则如下：

 1. 如果出现连号，不管升序还是降序，都加5分。例如：5678,4321都满足加分标准。

 2. 前三个数字相同，或后三个数字相同，都加3分。例如：4888,6665,7777都满足加分的标准。注意：7777因为满足这条标准两次，所以这条规则给它加了6分。

 3. 符合AABB或者ABAB模式的加1分。例如：2255,3939,7777都符合这个模式，所以都被加分。注意：7777因为满足这条标准两次，所以这条标准给它加了2分。

 4. 含有：6，8，9中任何一个数字，每出现一次加1分。例如4326,6875,9918都符合加分标准。其中，6875被加2分；9918被加3分。

 尾号最终得分就是每条标准的加分总和！

 要求程序从标准输入接收数据，在标准输出上输出结果。

 输入格式为：第一行是一个整数n（<100），表示下边有多少输入行，接下来是n行4位一组的数据，就是等待计算加分的手机尾号。
 输出格式为：n行整数。
 */
public class 手机尾号 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for (int i = 0; i < n; i++) {
			int phone = sc.nextInt();
			arr[i] = getResult(phone);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

	private static int getResult(int phone) {
		int count = 0;//记录分数
		int a = phone / 1000;
		int b = phone / 100 % 10;
		int c = phone / 10 % 10;
		int d = phone % 10;
		if(a==b+1&&a==c+2&&a==d+3) count += 5;
		if(a==b-1&&a==c-2&&a==d-3) count += 5;
		if(a==b&&a==c) count += 3;
		if(d==c&&b==d) count += 3;
		
		if(a==b&&c==d) count ++;
		if(a==c&&b==d) count ++;
		
		if(a==6||a==8||a==9) count++;
		if(b==6||b==8||b==9) count++;
		if(c==6||c==8||c==9) count++;
		if(d==6||d==8||d==9) count++;
		return count;
	}
}
