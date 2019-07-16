package cn.dzqc.lqb;

import java.util.Arrays;
import java.util.Scanner;

public class ≈≈–Ú {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
