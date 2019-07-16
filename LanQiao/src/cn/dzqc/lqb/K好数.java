package cn.dzqc.lqb;

import java.math.BigInteger;
import java.util.Scanner;

public class K���� {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {  
	        Scanner input=new Scanner(System.in);  
	        int k=input.nextInt();     //k����  
	        int l=input.nextInt();     //lλ  
	        input.close();  
	        int[] a=new int[l];  
	        BigInteger t=new BigInteger("0");  
	        for (int i = 0; i < Math.pow(k, l)-1; i++) {  
	            a[0]++;  
	            for (int j = 0; j < a.length-1; j++) {  
	                if(a[j]==k)  
	                {  
	                    a[j]=0;  
	                    a[j+1]++;  
	                }  
	                else{  
	                    break;  
	                }  
	            }         
	            if(a[0]!=0&&getK(a)==1)  
	            {  
	                t=t.add(BigInteger.ONE);  
	            }  
	        }  
	        System.out.println(t.mod(new BigInteger("1000000007")).toString());  
	    }  
	static int getK(int []arr){
		//�ж�һ��������������λ���±��Ƿ����
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]-arr[i+1]==1||arr[i]-arr[i+1]==-1){
				return 0;
			}
		}
		return 1;//��ʱΪK����
	}

}
