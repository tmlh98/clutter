package cn.java.ss;
/*
	小明最近喜欢搭数字积木，
	一共有10块积木，每个积木上有一个数字，0~9。
	搭积木规则：
	每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
	最后搭成4层的金字塔形，必须用完所有的积木。
	下面是两种合格的搭法：
	   0
	  1 2
	 3 4 5
	6 7 8 9
	
	   0
	  3 1
	 7 5 2
	9 8 6 4    
	请你计算这样的搭法一共有多少种？
 */
public class 搭积木 {
	static int count = 0;
	
	static void swap(int[] arr ,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void show(int[] arr){
		if(arr[0]>arr[1]||arr[0]>arr[2])return;
		if(arr[1]>arr[3]||arr[1]>arr[4])return;
		if(arr[2]>arr[4]||arr[2]>arr[5])return;
		if(arr[3]>arr[6]||arr[3]>arr[7])return;
		if(arr[4]>arr[7]||arr[4]>arr[8])return;
		if(arr[5]>arr[8]||arr[5]>arr[9])return;
		count++;
	}
	static void run(int [] arr , int a){
		if(a == arr.length-1){
			show(arr);
			return ;
		}
		for (int i = a; i < arr.length; i++) {
			//交换
			swap(arr, a, i);
			run(arr, a+1);
			//回溯
			swap(arr, a, i);
		}
	} 
	
	public static void main(String[] args) {
		int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
		run(arr,0);
		System.out.println(count);
	}
	
}
