package cn.java.eight;

import java.util.Scanner;

/*
 * С������ÿ���糿������һ�Ұ����̳���͡���������Ұ�������N�����������е�i������ǡ���ܷ�Ai�����ӡ�
 * ÿ���������зǳ�������������Ϊ����������
 ÿ���й˿�����X�����ӣ������ӵĴ���ͻ�Ѹ��ѡ����������������ʹ������������ǡ��һ����X�����ӡ�
 ����һ����3���������ֱ��ܷ�3��4��5�����ӡ����˿�����11������ʱ��
 ����ͻ�ѡ2��3�����ټ�1��5���ģ�Ҳ����ѡ��1��3�����ټ�2��4���ģ���
 ��Ȼ��ʱ���Ӵ����������Ҳ�ղ����˿����������������һ����3���������ֱ��ܷ�4��5��6�����ӡ����˿�����7������ʱ������ʹղ������ˡ�
 С����֪��һ���ж�������Ŀ�ǰ��Ӵ���ղ������ġ�
 ����
 ��һ�а���һ������N��(1 <= N <= 100) 
 ����N��ÿ�а���һ������Ai��(1 <= Ai <= 100) 
 ���
 һ����������𰸡�����ղ�������Ŀ�����޶�������INF��
 ���磬 
 ���룺 
 2 
 4 
 5 
 ����Ӧ������� 
 6 
 �����磬 
 ���룺 
 2 
 4 
 6 
 ����Ӧ������� 
 INF
 */

public class ���Ӵ��� {
    static boolean[] flag;
    static int MAX = 65535;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        flag = new boolean[MAX + 101];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            flag[a[i]] = true;//��ǰλ��Ϊtrue
        }
        sc.close();

        for (int i = 0; i < MAX; i++) {
            if (flag[i]) {
                for (int j = 0; j < n; j++)
                    flag[a[j] + i] = true;//���������б���Ϊtrue
            }
        }
        int count = 0;
        for (int i = 1; i < MAX; i++) {
            if (!flag[i]) {
                count++;
            }
        }
        for (int i = MAX; i > MAX - 101; i--) {
            if (!flag[i]) {
                System.out.println("INF");
                return;
            }
        }

        System.out.println(count);
    }

}
