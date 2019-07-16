package com.lqb.cgroup;

import java.util.HashSet;
import java.util.Set;

public class Æ½·½Ä©Î² {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 10; i <1000 ; i++) {
			set.add(i*i%100);
		}
		System.out.println(set.size());
	}
}
