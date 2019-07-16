package cn.dzqc.sftg;

import java.util.Arrays;
import java.util.Scanner;

public class 合并石子 {

	/**
	 *输入第一行包含一个整数n，表示石子的堆数。
	 *接下来一行，包含n个整数，按顺序给出每堆石子的大小 。
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		System.out.println(minLu(arr));
	}
	static int minLu(int []arr){
		Arrays.sort(arr);
		int []arr1=new int [arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=arr[arr.length-i-1];
		}
		int k1=0,k2=arr.length-1,temp1=arr[0],temp2=arr[arr.length-1];
		int num=0;
		for (int i = 0; i < arr1.length-1-1; i++) {
			if(i%2==0){
				temp1+=arr[k1+1];
				num+=temp1;
				k1++;
			}else{
				temp2+=arr[k2-1];
				num+=temp2;
				k2--;
			}
		}
		return num+temp1+temp2;
	}

}
