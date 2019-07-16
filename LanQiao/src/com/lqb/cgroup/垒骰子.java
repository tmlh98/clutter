package com.lqb.cgroup;

import java.util.Scanner;
/*
	赌圣atm晚年迷恋上了垒骰子，就是把骰子一个垒在另一个上边，不能歪歪扭扭，要垒成方柱体。
	经过长期观察，atm 发现了稳定骰子的奥秘：有些数字的面贴着会互相排斥！
	我们先来规范一下骰子：1 的对面是 4，2 的对面是 5，3 的对面是 6。
	假设有 m 组互斥现象，每组中的那两个数字的面紧贴在一起，骰子就不能稳定的垒起来。 atm想计算一下有多少种不同的可能的垒骰子方式。
	两种垒骰子方式相同，当且仅当这两种方式中对应高度的骰子的对应数字的朝向都相同。
	由于方案数可能过多，请输出模 10^9 + 7 的结果。
	
	不要小看了 atm 的骰子数量哦～
	
	「输入格式」
	第一行两个整数 n m
	n表示骰子数目
	接下来 m 行，每行两个整数 a b ，表示 a 和 b 不能紧贴在一起。
	
	「输出格式」
	一行一个数，表示答案模 10^9 + 7 的结果。
	
	「样例输入」
	2 1
	1 2
	
	「样例输出」
	544
 */
public class 垒骰子 {
    static Scanner in = new Scanner(System.in);
    static int n, m;
    static int[][] oje = new int[7][7];
    static int count = 0;
    static int[] dui = {0, 4, 5, 6, 1, 2, 3};
    static int BigInt = 1000000007;
    public static void main(String[] args) {
        n = in.nextInt(); m = in.nextInt();
        int a, b;
        for (int i = 0; i < m; i++) {
            a = in.nextInt(); b = in.nextInt();
            oje[a][b] =1;
            oje[b][a] = 1;
        }

        dfs(0, -1);
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans = (ans*4)%BigInt;
        }
        System.out.println((count*ans)%BigInt);
    }


    private static void dfs(int i, int di) {
        if(i==n) {
            count++;
            if(count>BigInt) count -= BigInt;
        } else {
            if(di==-1) {
                for (int j = 1; j < 7; j++) {
                    dfs(i+1,dui[j]);
                }
            } else {
                for (int j = 1; j < 7; j++) {
                    if(oje[j][di]==0) {
                        dfs(i+1, dui[j]);
                    }
                }
            }
        }
    }
}
