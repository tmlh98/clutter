package com.finals.c;

import java.util.HashSet;

/*
 *  2 9 4
	7 5 3
	6 1 8
 */
public class ·´»Ã·½ {
	
	static int count;
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		f(a , 0);
		System.out.println(count);
	}

	private static void f(int[] a, int k) {
		if(k == a.length){
			check(a);
			return;
		}
		for (int i = k; i < a.length; i++) {
			{int temp = a[i];a[i] = a[k];a[k] = temp;}
			f(a, k +1);
			{int temp = a[i];a[i] = a[k];a[k] = temp;}
		}
		
	}

	private static void check(int[] a) {
		int n1 = a[0] + a[1] + a[2];
		int n2 = a[3] + a[4] + a[5];
		int n3 = a[6] + a[7] + a[8];
		int n4 = a[0] + a[3] + a[6];
		int n5 = a[1] + a[4] + a[7];
		int n6 = a[2] + a[5] + a[8];
		int n7 = a[0] + a[4] + a[8];
		int n8 = a[2] + a[4] + a[6];
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(n1);
		hs.add(n2);
		hs.add(n3);
		hs.add(n4);
		hs.add(n5);
		hs.add(n6);
		hs.add(n7);
		hs.add(n8);
		
		if(hs.size() == 8){
			count ++;
		}
		
	}
}
