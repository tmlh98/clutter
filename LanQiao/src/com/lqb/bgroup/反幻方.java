package com.lqb.bgroup;

import java.util.HashSet;

public class 反幻方 {
/*
 * 我国古籍很早就记载着
	2 9 4
	7 5 3
	6 1 8
	这是一个三阶幻方。每行每列以及对角线上的数字相加都相等。
	
	下面考虑一个相反的问题。
	可不可以用 1~9 的数字填入九宫格。
	使得：每行每列每个对角线上的数字和都互不相等呢？
	这应该能做到。
	比如：
	9 1 2
	8 4 3
	7 5 6
	
	你的任务是搜索所有的三阶反幻方。并统计出一共有多少种。
	旋转或镜像算同一种。
	
	比如：
	9 1 2   7 8 9   2 1 9
	8 4 3   5 4 1   3 4 8
	7 5 6   6 3 2   6 5 7
	等都算作同一种情况。
	
	请提交三阶反幻方一共多少种。这是一个整数，不要填写任何多余内容。
 */
	 public static int count = 0;
	    
	    public static void swap(int[] A, int i, int j) {
	        int temp = A[i];
	        A[i] = A[j];
	        A[j] = temp;
	    }
	    
	    public static void check(int[] A) {
	        int[] sum = new int[8];
	        sum[0] = A[0] + A[1] + A[2];
	        sum[1] = A[3] + A[4] + A[5];
	        sum[2] = A[6] + A[7] + A[8];
	        sum[3] = A[0] + A[3] + A[6];
	        sum[4] = A[1] + A[4] + A[7];
	        sum[5] = A[2] + A[5] + A[8];
	        sum[6] = A[0] + A[4] + A[8];
	        sum[7] = A[2] + A[4] + A[6];
	        HashSet<Integer> set = new HashSet<Integer>();
	        for(int i = 0;i < 8;i++)
	            set.add(sum[i]);
	        if(set.size() == 8)
	            count++;
	    }
	    
	    public static void dfs(int[] A, int step) {
	        if(step == A.length) {
	            check(A);
	            return;
	        } else {
	            for(int i = step;i < A.length;i++) {
	                swap(A, i, step);
	                dfs(A, step + 1);
	                swap(A, i, step);
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] A = {1,2,3,4,5,6,7,8,9};
	        dfs(A, 0);
	        System.out.println(count / 8);
	    }


}
