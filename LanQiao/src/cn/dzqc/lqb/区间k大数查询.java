package cn.dzqc.lqb;

import java.util.Scanner;

public class 区间k大数查询 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int n=inScanner.nextInt();
		int arr[]=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=inScanner.nextInt();
		}
		int no=inScanner.nextInt();
		int arrResult[]=new int[no];
		for (int i = 0; i <no; i++) {
			int a=inScanner.nextInt();
			int b=inScanner.nextInt();
			int c=inScanner.nextInt();
			int arr1[]=new int [b-a+1]; 
			int s=0;
			for (int j = a-1; j <b; j++) {
				arr1[s]=arr[j];
				s+=1;
			}
			arrResult[i]=sortNo(arr1,c);
		}
		for (int i = 0; i < arrResult.length; i++) {
			System.out.println(arrResult[i]);
		}

	}
	static int sortNo(int []arr,int no){
		//从大到小排序
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[no-1];
	}
}
