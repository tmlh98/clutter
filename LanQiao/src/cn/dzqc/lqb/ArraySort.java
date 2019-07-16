package cn.dzqc.lqb;

import java.util.Scanner;

public class ArraySort {
	/**
	 * 问题描述
　	 *给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
     * 输入格式
　　       *第一行为一个整数n。
　　       *第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
	 *输出格式
　　       *输出一行，按从小到大的顺序输出排序后的数列。 
     * 样例输入
	 *5
	 *8 3 6 4 9
	 *样例输出
	 *3 4 6 8 9
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入数组的长度：");
		int len=in.nextInt();
		if(len<=200&&len>=1){
			int arr[]=new int[len];
			System.out.println("给数组每一项赋值：");
			boolean flag=true;
			for(int i=0;i<len;i++){
				arr[i]=in.nextInt();
				if(arr[i]>10000||arr[i]<-10000){
					flag=false;
					break;
				}
			}	
			if(flag){
				sort(arr);
				System.out.println("排序后：");
				for(int i=0;i<len;i++){
					System.out.print(arr[i]+" ");
				}
			}	
			
		}
	}
	public static int[] sort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){//内层控制比较次数
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}

}
