package com.jisuanke.nanti;

import java.util.Scanner;

public class 跳跃游戏 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(canJump(arr));
		sc.close();
	}

	/**
	 * 贪心寻找上界！！！！还有这题是不寻找路线的！！！
	 * */
	public static boolean canJump(int[] nums) {
		int reach = 0;// 当前到达的位置
		int i = 0;
		while (i < nums.length && i <= reach) {
			reach = Math.max(reach, i + nums[i]);
			i++;
			System.out.println(reach + "   " + i);
		}
		return reach >= nums.length - 1;
	}

}
/*
 * 这道题的意思，就是给了一个数组，数组里面表示的是在这个位置上，最大可跳跃的位置。 那么现在，就假设你在0的位置上，问你可以跳跃到最末尾的位置吗？
 * 那么这道题的思路就是使用一个贪心法，使用一个步进指针，用一个上界指针。 每次遍历的时候，不停的更新上界指针的位置（也就是当前位置+当前可以跳到的位置），
 * 知道看你能遇到结尾吗？如果成功了，就返回true，没有就返回false
 */
