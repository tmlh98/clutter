package cn.dzqc.sftg;

import java.util.Arrays;
import java.util.Scanner;

public class 最大乘积 {
	/*  对于n个数，从中取出m个数，如何取使得这m个数的乘积最大呢？
	 *  第一行一个数表示数据组数
　　	 *	每组输入数据共2行：
　　       *	第1行给出总共的数字的个数n和要取的数的个数m，1<=n<=m<=15，
　　	 *	第2行依次给出这n个数，其中每个数字的范围满足:a[i]的绝对值小于等于4。
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();//组数
		int []product=new int [z];
		for (int i = 0; i < z; i++) {
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			int []arr=new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j]=sc.nextInt();
			}
			product[i]=result(arr, m);
		}
		
		for (int i = 0; i < product.length; i++) {
			System.out.print(product[i]+" ");
		}
		sc.close();
	}
	private static int result(int []arr,int m){
		Arrays.sort(arr);
		int []arr2=new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[arr.length-i-1];
		}
		int j=1;
		int k1=0,k2=0;
		boolean  result=true;
		if(m%2==0){
			while(result){
				if(m==1){//如果是1，那么返回最大的那个数
					if(arr[k1]>arr2[k2]){
						j*=arr[k1];
						result=false;
					}else {
						j*=arr2[k2];
						result=false;
					}
				}else if (m<1) {
					result=false;
				}else{
					if(arr[k1]*arr[k1+1]>arr2[k2]*arr2[k2+1]){
						j*=arr[k1]*arr[k1+1];
						k1+=2;
						m-=2;
					}else{
						j*=arr2[k2]*arr2[k2+1];
						k2+=2;
						m-=2;
					}
				}
				
			}
		}else{
			while(result){
				if(m==1){//如果是1，那么返回最大的那个数
						j*=arr2[0];
						result=false;
				}else{
					if(arr[k1]*arr[k1+1]>arr2[k2+1]*arr2[k2+2]){
						j*=arr[k1]*arr[k1+1];
						k1+=2;
						m-=2;
					}else{
						j*=arr2[k2+1]*arr2[k2+2];
						k2+=2;
						m-=2;
					}
				}
				
			}
			
			
		}
	
	
		return j;
	}
	
	

}
