package com.tx.work;

import java.util.Scanner;

/*
 * ��������Խ���֮�ϳ�Ϊ�������ǡ���
 * �������һ���������n�׷��������������ĳ������Ĺ����ǣ�ʹ��1��2��3��.����Ȼ���У������Ͻǿ�ʼ������˳ʱ�뷽��������䡣
 * ���磺��n=3ʱ�������
 * 2   3
 * 4
 * ��n=4ʱ�������
 * 2   3   4
 * 10   5
 * 6 
 * ��n=5ʱ�������
 * 2   3   4   5
 * 13  14   6 
 * 15   7
 * 8
 *
 * ��������ʱ���ӱ�׼����������n��3~20��
 * �������������������ǲ��֡�
 * Ҫ���ʽ��ÿ�����ݿ��Ϊ4���Ҷ��롣 
 */
public class ���������� {
	public static void initArray(int[][] arrayA) {
        for(int i = 0;i < arrayA.length;i++)
            arrayA[i] = new int[arrayA.length - i];
    }
    
    public static void dfs(int[][] arrayA, int row, int num) {
        if(row >= arrayA.length / 2)
            return;
        //����Ϸ���һ��
        for(int i = row;i < arrayA[row].length - row;i++)
            arrayA[row][i] = num++;
        //������ÿһ���ұ����һ��Ԫ��
        for(int i = row + 1;i < arrayA[row].length - row;i++)
            arrayA[i][arrayA[i].length - 1 - row] = num++;
        //������ÿһ�п�ʼ��ߵ�һ��Ԫ��
        for(int i = arrayA[row].length - 2 - row;i > row;i--)
            arrayA[i][row] = num++;
        dfs(arrayA, row + 1, num);
    }
     
    public static void printResult(int[][] arrayA) {
        for(int i = 0;i < arrayA.length;i++) {
            for(int j = 0;j < arrayA[i].length;j++)
                System.out.printf("%4d",arrayA[i][j]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arrayA = new int[n][];
        initArray(arrayA);
        dfs(arrayA, 0, 1);
        printResult(arrayA);
        
        in.close();
    }


}
