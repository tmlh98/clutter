package cn.dzqc.sftg;

import java.util.Arrays;
import java.util.Scanner;

public class 最大最小值 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int N=inScanner.nextInt();
		int arr[]=new int [N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=inScanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[N-1]+" "+arr[0]);
	}
}
