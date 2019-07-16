package com.dzqc.ljst;

import java.util.Arrays;
import java.util.Scanner;

public class 错误票据 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();//去掉换行符
		in.close();
		int  arr[] = new int  [100000];
		int index=0;
		for (int i = 0; i < n; i++) {
			String str=in.nextLine();
			String strarr[]=str.split(" ");//拆分
			for (int j = 0; j < strarr.length; j++) {
				arr[index++]=Integer.valueOf(strarr[j]);
			}
		}
		Arrays.sort(arr);
		int m=0,l=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]&&arr[i]!=0){
				l=arr[i];
			}else if(arr[i]+1!=arr[i+1]){
				m=arr[i]+1;
			}
		}
		System.out.println(m+" "+l);
	}
}
