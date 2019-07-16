package cn.dzqc.sftg;

import java.util.Arrays;
import java.util.Scanner;

public class 第二大整数 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int []arr=new int [20];
		int k=0,j=0;
		do {
			arr[k]=inScanner.nextInt();
			if(arr[k]==0){
				break;
			}
			k++;
		} while (true);
		int []arr1=new int [k];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0){
				continue;
			}
			arr1[j]=arr[i];
			j++;
		}
		Arrays.sort(arr1);
		System.out.println(arr1[j-2]);

	}

}
