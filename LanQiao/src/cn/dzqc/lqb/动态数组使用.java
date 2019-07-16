package cn.dzqc.lqb;

import java.util.Scanner;

public class 动态数组使用 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int n=inScanner.nextInt();
		int [] arr=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=inScanner.nextInt();
		}
		System.out.println(sf(arr)+" "+sf(arr)/n);		

	}
	static int sf(int[]arr){
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			num+=arr[i];
		}
		return num;
	}

}
