package cn.dzqc.lqb;

import java.util.Scanner;

public class K����2 {
	public static void main(String[] args) {
		int  arr[][]=new int [105][105];
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		int l=in.nextInt();
		for (int i = 0; i < l; i++) {
			arr[1][i]=1;//��ʼ״̬
		}
		for (int i = 2; i < l; i++) {//��2λ������lλ��ÿһ��ѭ�����iλ��k����
			for (int j = 0; j < k; j++) {//iλK������β����0��k-1������ÿһ��ѭ�����iλβ��λj��k����Ŀ,��arr[i][j].
				for (int j2 = 0; j2 < k; j2++) {//iλβ��������1λ���֣���0������k-1
					if(j2!=j-1&&j2!=j+1){
						arr[i][j]+=arr[i-1][j2]%1000000007;
					}
				}
			}
		}
		int sum=0;
		 for (int i = 0; i < k; i++) {
			sum+=arr[l][i];
		}
		System.out.println(sum%1000000007);
		
		
	}

}
