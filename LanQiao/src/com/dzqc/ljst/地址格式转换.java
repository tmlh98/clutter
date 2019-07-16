package com.dzqc.ljst;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Excel是最常用的办公软件。每个单元格都有唯一的地址表示。
 * 比如：第12行第4列表示为：“D12”，第5行第255列表示为“IU5”。
    
    事实上，Excel提供了两种地址表示方法，还有一种表示法叫做RC格式地址。
     第12行第4列表示为：“R12C4”，第5行第255列表示为“R5C255”。

    你的任务是：编写程序，实现从RC地址格式到常规地址格式的转换。
 */
public class 地址格式转换 {
	 public static String Position = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    
    public static String getResult(String A) {
        String r = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = 0, b = 0;
        int m = A.indexOf('C');
        a = Integer.valueOf(A.substring(1, m));
        b = Integer.valueOf(A.substring(m + 1));
        while(b > 0) {
            list.add(b % 26);
            b = b / 26;
        }
        for(int i = list.size() - 1;i >= 0;i--) 
            r = r + Position.charAt(list.get(i));
        r = r + a;
        return r;
    }

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] result = new String[n];
        for(int i = 0;i < n;i++) {
            String A = in.next();
            result[i] = getResult(A);
        }
        for(int i = 0;i < n;i++)
            System.out.println(result[i]);
    }

}
