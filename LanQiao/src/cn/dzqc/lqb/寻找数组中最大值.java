package cn.dzqc.lqb;

import java.util.Scanner;

public class 寻找数组中最大值 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			if(i==0&&arr[i]<max){
				max=arr[0];
			}
			if (max<arr[i]) {
				max=arr[i];
				index=i;
			}
			
		}
		System.out.println(max+"  "+index);
//		int temp=arr[0],index=0;
//		for (int i = 0; i < arr.length-1; i++) {
//			if(temp<arr[i]){
//				temp=arr[i];
//			}
//		}
//		System.out.print(temp+" ");
//		for (int i = 0; i < arr.length-1; i++) {
//			if(temp==arr[i]){
//				index=i;
//			}
//		}
//		System.out.println(index);

	}

}
