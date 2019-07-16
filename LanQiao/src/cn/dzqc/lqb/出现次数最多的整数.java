package cn.dzqc.lqb;

import java.util.Scanner;

public class 出现次数最多的整数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		if(no>20||no<=0){
			return;
		}
		int []arr=new int [no];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Info(arr));
		
	}
	static int Info(int []arr){
		int count=1;
		int num[]=new int [arr.length-1];
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]){
				count++;
				num[i]=count;
			}else{
				count=1;
				num[i]=count;
			}
		}
		int index=0,min=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]>min){
				min=num[i];
				index=i;
			}
		}
		return arr[index];
		
	}
}
