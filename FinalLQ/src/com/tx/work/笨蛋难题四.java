package com.tx.work;

import java.util.Scanner;

/*
 * ���� 
	��Щ���ӱ���һֱ�о���Ʊ���������У����ڷ���xxx��˾��Ʊ���ɣ�
	����ϲ���� �����������ҹ�˾ÿ��Ĺɼۣ�Ϊ�˷�ֹ���˷����������ܡ�
	������������ҹ�˾�� ��Ʊ�����һ�Σ����ڱ����Ѿ�����Ʊ�۸����˳�����
	�����Ѿ����Ǳ����������ˣ����Ѿ���� �� �ǣ���ֻ����Ϊ��Ϊ��ѽ���ӹ�Ʊ�۸���ϣ��������������ÿ�ɹ�Ʊ�����׬����Ǯ��
	                 
	����
	��һ��һ��n����ʾn��(С��100000)
	�ڶ��� ����n��ÿ�ɵļ۸�
	���
	ÿ�����׬����Ǯ
	��������
	4
	947 267 359 771
	7
	669 735 322 794 397 565 181  
	�������
	504
	472
 */
public class ���������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i =0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		
		int min = arr[0];
		int maxMoney = 0;
		
		for (int i = 0; i < arr.length -1; i++) {
			if(arr[i] < min){
				
				min = arr[i];//������Сֵ
			}
			maxMoney = Math.max(arr[i + 1] - min, maxMoney);//ȡ��ֵ
			
		}
		
		System.out.println(maxMoney);
		sc.close();
	}
}
