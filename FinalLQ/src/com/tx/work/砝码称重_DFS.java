package com.tx.work;

import java.util.ArrayList;
import java.util.Scanner;

public class Ì¿¬Î≥∆÷ÿ_DFS {
	
	static int[] arr = new int []{1,3,9,27,81};
	
	static int n = 0;
	
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
	private static void dfs(int step) {
		if(step == arr.length){
			if(check() == n)
				show();
			return;
		}
		for (int i = -1; i <= 1; i++) {
			result.add(i * arr[step]);
			dfs(step + 1);
			result.remove(result.size() -1);
		}
	}
	
	private static int check() {
		int sum = 0;
		for (int n : result) {
			sum += n;
		}
		return sum;
	}

	private static void show() {
		String str = "";
		for (int i = result.size() -1; i >= 0; i--) {
			if(result.get(i) != 0)
				if(result.get(i) > 0)
					str += "+" + result.get(i);
 				else str += result.get(i); 
		}
		System.out.println(str.substring(1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dfs(0);
		sc.close();
	}
   
}      