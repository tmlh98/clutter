package cn.dzqc.sftg;

import java.util.Arrays;
import java.util.Scanner;

public class 上帝造题五分钟 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//长度和查询个数
		int Q=in.nextInt();
		int []arr=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		for (int i = 0; i < Q; i++) {
			int lo=in.nextInt();
			int hi=in.nextInt();
		    System.out.println(findMin(arr, lo, hi));
		}

	}
	private static int findMin(int []arr,int begin,int end) {
		int []newarr=new int [end-begin+1];
		int k=0;
		for (int i = begin; i <= end; i++) {
			newarr[k]=arr[i];
			k++;
		}
		Arrays.sort(newarr);
		return newarr[0];
	}

}
