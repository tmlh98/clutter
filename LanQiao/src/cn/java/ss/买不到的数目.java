package cn.java.ss;

import java.util.Scanner;

/*
 * 小明开了一家糖果店。他别出心裁：把水果糖包成4颗一包和7颗一包的两种。糖果不能拆包卖。
    小朋友来买糖的时候，他就用这两种包装来组合。当然有些糖果数目是无法组合出来的，比如要买 10 颗糖。
    你可以用计算机测试一下，在这种包装情况下，最大不能买到的数量是17。大于17的任何数字都可以用4和7组合出来。
    本题的要求就是在已知两个包装的数量时，求最大不能组合出的数字。
输入：
两个正整数，表示每种包装中糖的颗数(都不多于1000)
要求输出：
一个正整数，表示最大不能买到的糖数
不需要考虑无解的情况

例如：
用户输入：
4 7
程序应该输出：
17
 */
public class 买不到的数目 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println(getResult(a, b));
		sc.close();
		
	}
	//思路：求4*x+7*y可以表示的连续整数到无穷的最小值 
	static int getResult(int a,int b){
		int[] arr = new int [1000];//保存遍历的结果
		for (int i = 0; i < arr.length; i++) {
			arr[i]=0;
		}
		//穷举出所有的结果
		boolean sign = false;
		for (int i = 0; i < 1000; i++) {
			j:for (int j = 0; j < 1000; j++) {
				for (int k = 0; k < 1000; k++) {
					if(a * j + b*k==i){
						sign = true;
						break j;
					}else{
						sign = false;
					}
				}
			}
			if(sign){//如果是真，说明i可以被4*x+7*y表示;它对应的数组置为"1";  
				arr[i] = 1;
			}
		}
		int max = 0;
		for (int i = arr.length-1; i >= 0 ; i--) {
			if(arr[i] == 0){
				max = i;
				break;
			}
		}
		return max;
	}
}
