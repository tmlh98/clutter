package cn.dzqc.sftg;

import java.util.Arrays;
import java.util.Scanner;

public class ���˻� {
	/*  ����n����������ȡ��m���������ȡʹ����m�����ĳ˻�����أ�
	 *  ��һ��һ������ʾ��������
����	 *	ÿ���������ݹ�2�У�
����       *	��1�и����ܹ������ֵĸ���n��Ҫȡ�����ĸ���m��1<=n<=m<=15��
����	 *	��2�����θ�����n����������ÿ�����ֵķ�Χ����:a[i]�ľ���ֵС�ڵ���4��
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();//����
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
				if(m==1){//�����1����ô���������Ǹ���
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
				if(m==1){//�����1����ô���������Ǹ���
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
