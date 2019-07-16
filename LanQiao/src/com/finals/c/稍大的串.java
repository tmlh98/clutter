package com.finals.c;

import java.util.Arrays;
import java.util.Scanner;

public class 稍大的串 {
    //ayyyxxff
    public static void getResult(String A) {
        int len = A.length();//8
        int i = len - 1;//7
        for(;i >= 1;i--)
            if(A.charAt(i - 1) < A.charAt(i))
                break;
        if(i == 0) {
            System.out.println(A);
            return;
        }//i=1
        char temp = A.charAt(i - 1);//a
        char[] arrayB = A.substring(i).toCharArray();//yyyxxff
        Arrays.sort(arrayB);//ffxxyyy
        for(int j = 0;j < arrayB.length;j++)
            if(arrayB[j] > temp) {//交换
                char a = arrayB[j];
                arrayB[j] = temp;
                temp = a;
                break;
            }
        System.out.println(A.substring(0, i - 1)+temp+new String(arrayB));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        getResult(A);
        in.close();
    }
}

/*
串可以按照字典序进行比较。例如：abcd 小于 abdc
如果给定一个串，打乱组成它的字母，重新排列，可以得到许多不同的串，在这些不同的串中，有一个串刚好给定的串稍微大一些。
科学地说：它是大于已知串的所有串中最小的串。你的任务就是求出这个“稍大的串”。

例如：
输入串：
abfxy
程序应该输出：
abfyx

再例如：
输入串：
ayyyxxff
程序应该输出：
fafxxyyy

fyyyxxaa
数据规模约定：
输入的串不超过1000个字符。

特例：
如果已知的串已经是所有重组串中最大的，则原样输出读入的那个串。
*/