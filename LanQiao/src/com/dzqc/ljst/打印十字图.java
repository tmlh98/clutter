package com.dzqc.ljst;

import java.util.Scanner;

public class ��ӡʮ��ͼ {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int i,j;
		for (i = 1; i <= n*4+5; i++)  {    
	        for (j = 1; j <= n*4+5; j++) {        
	            if (go(i, j, n))System.out.print("$");                    
	            else System.out.print(".");   
	        }          
	      System.out.println();
	    }       
	}
	static boolean go(int i,int j,int n){
		 //���¶Գ�
	    if (i > n * 2 + 3)         
	        i = n * 4 + 6 - i;
	    //���ҶԳ�
	    if (j > n * 2 + 3)         
	        j = n * 4 + 6 - j;
	    //ǰ����ʱ��ʾ��Ϊ '.'  
	    if(j > i) {
	    	int t = j;
		    j = i;
		    i = t;
	    }
	    if (i <= 2 && j <= 2) return false; 
	    //ÿһ����������������$     
	    if (i % 2 == 1 && j >= i - 2) return true;
	    //ÿһ���������������     
	    if (j % 2 == 1 && j != i - 1) return true;   
	    
	    return false; 

	}
}
