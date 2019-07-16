package cn.dzqc.lqb;

import java.util.Scanner;

public class K好数2 {
	public static void main(String[] args) {
		int  arr[][]=new int [105][105];
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		int l=in.nextInt();
		for (int i = 0; i < l; i++) {
			arr[1][i]=1;//初始状态
		}
		for (int i = 2; i < l; i++) {//从2位遍历到l位，每一次循环求出i位的k好数
			for (int j = 0; j < k; j++) {//i位K好数的尾数从0到k-1遍历，每一次循环求出i位尾数位j的k好数目,即arr[i][j].
				for (int j2 = 0; j2 < k; j2++) {//i位尾数后增加1位数字，从0遍历到k-1
					if(j2!=j-1&&j2!=j+1){
						arr[i][j]+=arr[i-1][j2]%1000000007;
					}
				}
			}
		}
		int sum=0;
		 for (int i = 0; i < k; i++) {
			sum+=arr[l][i];
		}
		System.out.println(sum%1000000007);
		
		
	}

}
