package cn.dzqc.sftg;

import java.util.Scanner;

public class ������� {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		//����һ�У��ո����������������m,s,n����������200��
		int m=inScanner.nextInt();
		int s=inScanner.nextInt();
		int n=inScanner.nextInt();
		int [][]arr1=new int [m][s];
		int [][]arr2=new int [s][n];
		int [][]arr3=new int [n][s];
		//������m�У�ÿ��s���ո��������������ʾ����A��i��j����
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < s; j++) {
				arr1[i][j]=inScanner.nextInt();
			}
		}
		//������s�У�ÿ��n���ո��������������ʾ����B��i��j����
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < n; j++) {
				arr2[i][j]=inScanner.nextInt();
			}
		}
		//���鷭ת90��
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < s; j++) {
				arr3[i][j]=arr2[j][i];
			}
		}
		int arr4[][]=rlt(m, s, n, arr1, arr3);
		//�����ʽ��m�У�ÿ��n���ո��������������������ľ���C��i��j����ֵ��
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.err.println();
		}
		
	}
	static int [][] rlt(int m,int s,int n,int [][]arr1,int [][]arr2){
		int [][]newarr=new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				//�ۼӷ���ֵ
				for (int j1 = 0; j1 < s; j1++) {
					newarr[i][j]+=arr1[i][j1]*arr2[j][j1];
				}
			}
		}
		return newarr;
	}
	
}
