package com.tx.work;

import java.util.Scanner;

public class ¾Å¹¬»Ã·½ {
	
	static int[] arr = new int[9];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] b= judge();
		dfs(b , 0);
		sc.close();
	}

	private static void dfs(int[] b, int step) {
		if(b.length == step){
			check(b);
			return;
		}
		
		for (int i = step; i < b.length; i++) {
			swap(b , i , step);
			dfs(b, step + 1);
			swap(b , i , step);
		}
		
	}

	private static void check(int[] b) {
		int[] c = new int [9];
		int index = 0;
		int index2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0)c[index ++] = arr[i];
			else c[index ++] = b[index2++];
		}
		int num1 = c[0] + c[1] + c[2];
		int num2 = c[3] + c[4] + c[5];
		int num3 = c[6] + c[7] + c[8];
		int num4 = c[0] + c[3] + c[6];
		int num5 = c[1] + c[4] + c[7];
		int num6 = c[2] + c[5] + c[8];
		int num7 = c[0] + c[4] + c[8];
		int num8 = c[2] + c[4] + c[6];
		if(num1 == num2 && num1== num3 && num1 == num4
				&&num1== num5 && num1==num6 && num1==num7
				&&num1==num8)show(c);
		
	}

	private static void show(int[] c) {
		for (int i = 0; i < c.length; i++) {
			 System.out.print(c[i] + " ");
			 if((i+1)%3==0)System.out.println();
		}
	}

	private static void swap(int[] b, int i, int step) {
		int temp = b[i];
		b[i] = b[step];
		b[step] = temp;
	}

	private static int[] judge() {
		int n = 9;
		for (int i = 0; i < arr.length; i++) {
			 if(arr[i] != 0 )n--;
		}
		int j = 1;
		int[] arr2 = new int [n];
		for (int i = 0; i < arr2.length; i++) {
			b:for (; j < 10; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					if(arr[j2] == j)continue b;
				}
				arr2[i] = j++;
				break;
			}
		}
		return arr2;
	}
	
}
