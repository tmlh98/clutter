package com.lqb.agroup;
/*
 * 小明最近喜欢搭数字积木，
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
	
	请填表示总数目的数字。
 */
public class 搭积木 {
	public static int count = 0;
	public static void show(int[] arr){
		if(arr[0]>arr[1]||arr[0]>arr[2])return;
		if(arr[1]>arr[3]||arr[1]>arr[4])return;
		if(arr[2]>arr[4]||arr[2]>arr[5])return;
		if(arr[3]>arr[6]||arr[3]>arr[7])return;
		if(arr[4]>arr[7]||arr[4]>arr[8])return;
		if(arr[5]>arr[8]||arr[5]>arr[9])return;
		System.out.println("   "+arr[0]);
		System.out.println("  "+arr[1]+" "+arr[2]);
		System.out.println(" "+arr[3]+" "+arr[4]+" "+arr[5]);
		System.out.println(""+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		count++;
	}
	
	//no:当前的位置
	public static void getResult(int[] arr , int no){
		if(no==arr.length-1){
			show(arr);
			return ;
		}
		for (int i = no; i < arr.length; i++) {
			//交换
			{int temp = arr[no];arr[no] = arr[i];arr[i] = temp;}
			getResult(arr, no+1);
			//回溯
			{int temp = arr[no];arr[no] = arr[i];arr[i] = temp;}
		}
	} 
	
	public static void main(String[] args) {
		
		int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
		getResult(arr, 0);
		System.out.println(count);
	}
}
