package com.finals.c;

import java.util.Arrays;
import java.util.Scanner;

public class �Դ�Ĵ� {
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
            if(arrayB[j] > temp) {//����
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
�����԰����ֵ�����бȽϡ����磺abcd С�� abdc
�������һ�������������������ĸ���������У����Եõ���಻ͬ�Ĵ�������Щ��ͬ�Ĵ��У���һ�����պø����Ĵ���΢��һЩ��
��ѧ��˵�����Ǵ�����֪�������д�����С�Ĵ����������������������Դ�Ĵ�����

���磺
���봮��
abfxy
����Ӧ�������
abfyx

�����磺
���봮��
ayyyxxff
����Ӧ�������
fafxxyyy

fyyyxxaa
���ݹ�ģԼ����
����Ĵ�������1000���ַ���

������
�����֪�Ĵ��Ѿ����������鴮�����ģ���ԭ�����������Ǹ�����
*/