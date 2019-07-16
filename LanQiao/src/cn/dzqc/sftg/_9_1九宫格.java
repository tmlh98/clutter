package cn.dzqc.sftg;

import java.util.Scanner;

public class _9_1¾Å¹¬¸ñ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int [3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int a = 0,b = 0,c = 0;
			for (int j = 0; j < arr.length; j++) {
				a+=arr[0][j];
			}
			for (int j = 0; j < arr.length; j++) {
				b+=arr[1][j];
			}
			for (int j = 0; j < arr.length; j++) {
				c+=arr[2][j];
			}
		if(a==b&&b==c){
			int a1=0;
			b=0;
			c=0;
			for (int j = 0; j < arr.length; j++) {
				a1+=arr[j][0];
			}
			for (int j = 0; j < arr.length; j++) {
				b+=arr[j][1];
			}
			for (int j = 0; j < arr.length; j++) {
				c+=arr[j][2];
			}
			if(a1==b&&b==c&&a1==a&&arr[0][0]+arr[1][1]+arr[2][2]==arr[0][2]+arr[1][1]+arr[2][0]&&a==arr[0][0]+arr[1][1]+arr[2][2]){
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else{
			System.out.println(0);
		}
		
		
		
		
	}

}
