package cn.dzqc.lqb;

import java.util.Scanner;

public class ArraySort {
	/**
	 * ��������
��	 *����һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
     * �����ʽ
����       *��һ��Ϊһ������n��
����       *�ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
	 *�����ʽ
����       *���һ�У�����С�����˳��������������С� 
     * ��������
	 *5
	 *8 3 6 4 9
	 *�������
	 *3 4 6 8 9
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("����������ĳ��ȣ�");
		int len=in.nextInt();
		if(len<=200&&len>=1){
			int arr[]=new int[len];
			System.out.println("������ÿһ�ֵ��");
			boolean flag=true;
			for(int i=0;i<len;i++){
				arr[i]=in.nextInt();
				if(arr[i]>10000||arr[i]<-10000){
					flag=false;
					break;
				}
			}	
			if(flag){
				sort(arr);
				System.out.println("�����");
				for(int i=0;i<len;i++){
					System.out.print(arr[i]+" ");
				}
			}	
			
		}
	}
	public static int[] sort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){//�ڲ���ƱȽϴ���
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}

}
