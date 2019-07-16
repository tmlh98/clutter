package com.tx.work;

import java.util.Scanner;

/*
 * 方阵的主对角线之上称为“上三角”。
 * 请你设计一个用于填充n阶方阵的上三角区域的程序。填充的规则是：使用1，2，3….的自然数列，从左上角开始，按照顺时针方向螺旋填充。
 * 例如：当n=3时，输出：
 * 2   3
 * 4
 * 当n=4时，输出：
 * 2   3   4
 * 10   5
 * 6 
 * 当n=5时，输出：
 * 2   3   4   5
 * 13  14   6 
 * 15   7
 * 8
 *
 * 程序运行时，从标准输入获得整数n（3~20）
 * 程序输出：方阵的上三角部分。
 * 要求格式：每个数据宽度为4，右对齐。 
 */
public class 三角螺旋阵 {
	public static void initArray(int[][] arrayA) {
        for(int i = 0;i < arrayA.length;i++)
            arrayA[i] = new int[arrayA.length - i];
    }
    
    public static void dfs(int[][] arrayA, int row, int num) {
        if(row >= arrayA.length / 2)
            return;
        //填充上方第一行
        for(int i = row;i < arrayA[row].length - row;i++)
            arrayA[row][i] = num++;
        //填充后续每一行右边最后一个元素
        for(int i = row + 1;i < arrayA[row].length - row;i++)
            arrayA[i][arrayA[i].length - 1 - row] = num++;
        //填充后续每一行开始左边第一个元素
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
