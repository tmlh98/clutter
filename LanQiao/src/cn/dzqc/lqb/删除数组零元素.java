package cn.dzqc.lqb;

import java.util.Scanner;

public class É¾³ıÊı×éÁãÔªËØ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(CompactIntegers(arr, n));
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}
	static int CompactIntegers(int []arr,int len){
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0){
				num++;
			}
		}
		return len-num;
	}

}
