package cn.dzqc.lqb;

import java.util.Arrays;
import java.util.Scanner;

public class 最小乘积_基本型 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int n=inScanner.nextInt();
		int []arr=new int [n];
		for (int i = 0; i < n; i++) {
			int len=inScanner.nextInt();
			int []arr1=new int [len];
			for (int j = 0; j < arr1.length; j++) {
				arr1[j]=inScanner.nextInt();
			}
			int []arr2=new int [len];
			for (int j = 0; j < arr1.length; j++) {
				arr2[j]=inScanner.nextInt();
			}
			arr[i]=minGrade(arr1, arr2);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	static int minGrade(int []arr1,int []arr2){
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int result=0;
		for (int i = 0; i < arr1.length; i++) {
			result+=arr1[i]*arr2[arr1.length-i-1];
		}
		return result;
	}

}
