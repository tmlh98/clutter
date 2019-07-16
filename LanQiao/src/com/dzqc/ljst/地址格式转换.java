package com.dzqc.ljst;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Excel����õİ칫�����ÿ����Ԫ����Ψһ�ĵ�ַ��ʾ��
 * ���磺��12�е�4�б�ʾΪ����D12������5�е�255�б�ʾΪ��IU5����
    
    ��ʵ�ϣ�Excel�ṩ�����ֵ�ַ��ʾ����������һ�ֱ�ʾ������RC��ʽ��ַ��
     ��12�е�4�б�ʾΪ����R12C4������5�е�255�б�ʾΪ��R5C255����

    ��������ǣ���д����ʵ�ִ�RC��ַ��ʽ�������ַ��ʽ��ת����
 */
public class ��ַ��ʽת�� {
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
