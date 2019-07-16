package cn.java.ss;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * 问题描述
　   　对于n个数，从中取出m个数，如何取使得这m个数的乘积最大呢？
	输入格式
	　　第一行一个数表示数据组数
	　　每组输入数据共2行：
	　　第1行给出总共的数字的个数n和要取的数的个数m，1<=n<=m<=15，
	　　第2行依次给出这n个数，其中每个数字的范围满足:a[i]的绝对值小于等于4。
	输出格式
	　　每组数据输出1行，为最大的乘积。
	样例输入
	1
	5 5
	1 2 3 4 2
	样例输出
	48 
 */
public class 最大乘积 {
    public static long n, m, temp;
    public static ArrayList<Long> list = new ArrayList<Long>();//存放输入的数
    public static ArrayList<Long> result = new ArrayList<Long>();
    
    public static void getResult() {
        Collections.sort(list);
        for(int i = 0, j = list.size() - 1;m > 0;) {
            if(m >= 2) {
                long a1 = list.get(i) * list.get(i + 1);
                long a2 = list.get(j) * list.get(j - 1);
                if(a2 > a1) {
                    temp *= list.get(j);
                    j--;
                    m--;
                } else {
                    temp *= a1;
                    i = i + 2;
                    m = m - 2;
                }    
            } else {
                if(m == 1) {
                    temp *= list.get(j);
                    j--;
                    m--;
                }
            }
        }
        result.add(temp);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0) {
            t--;
            n = in.nextLong();
            m = in.nextLong();
            temp = 1;
            list.clear();
            for(int i = 0;i < n;i++) {
                long a = in.nextLong();
                list.add(a);
            }
            getResult();
        }
        for(int i = 0;i < result.size();i++)
            System.out.println(result.get(i));
        
        in.close();
    }
    
}