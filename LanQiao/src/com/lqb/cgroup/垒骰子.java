package com.lqb.cgroup;

import java.util.Scanner;
/*
	��ʥatm�����������������ӣ����ǰ�����һ��������һ���ϱߣ���������ŤŤ��Ҫ�ݳɷ����塣
	�������ڹ۲죬atm �������ȶ����ӵİ��أ���Щ���ֵ������Żụ���ų⣡
	���������淶һ�����ӣ�1 �Ķ����� 4��2 �Ķ����� 5��3 �Ķ����� 6��
	������ m �黥������ÿ���е����������ֵ��������һ�����ӾͲ����ȶ����������� atm�����һ���ж����ֲ�ͬ�Ŀ��ܵ������ӷ�ʽ��
	���������ӷ�ʽ��ͬ�����ҽ��������ַ�ʽ�ж�Ӧ�߶ȵ����ӵĶ�Ӧ���ֵĳ�����ͬ��
	���ڷ��������ܹ��࣬�����ģ 10^9 + 7 �Ľ����
	
	��ҪС���� atm ����������Ŷ��
	
	�������ʽ��
	��һ���������� n m
	n��ʾ������Ŀ
	������ m �У�ÿ���������� a b ����ʾ a �� b ���ܽ�����һ��
	
	�������ʽ��
	һ��һ��������ʾ��ģ 10^9 + 7 �Ľ����
	
	���������롹
	2 1
	1 2
	
	�����������
	544
 */
public class ������ {
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
