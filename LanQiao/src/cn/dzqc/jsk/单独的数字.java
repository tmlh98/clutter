package cn.dzqc.jsk;

import java.util.*;

public class µ¥¶ÀµÄÊı×Ö{

    public static void init(int n,int []a,Scanner out){
        for(int i=0;i<n;i++){
            a[i]=out.nextInt();
        } 
    }
    public static void main(String args[]){
        Scanner out = new Scanner(System.in);
        int n= out.nextInt();
        int []a=new int[n];
        if(n>500||n<1)return;
        init(n,a,out);
        Arrays.sort(a);
        if(n==1){
            System.out.print( a[0]);
        }
        for(int i=0;i<a.length-1;i++){
            if(i==0)if(a[i]!=a[i+1]){ System.out.print( a[i]);}
            if(i==a.length-2)if(a[i]!=a[i+1]){ System.out.print( a[i+1]);}
            if(a[i]!=a[i+1]&&a[i]!=a[i-1]){ System.out.print( a[i]);}
        }
    }
}