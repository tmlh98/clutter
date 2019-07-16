package com.finals.c;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ĳ�����ٰ���Ʊ��������ѡ���л���Ӯ����������Ʊ��
	�������ó� N �ſ�Ƭ������д�� 1~N �����֣�������˳���ų�һ��ԲȦ��
	����Դ�����һ�ſ�Ƭ��ʼ˳ʱ������: 1,2,3.....
	������������ָպúͿ�Ƭ�ϵ�������ͬ����Ѹÿ�Ƭ�������У�����һ����Ƭ����.������
	ֱ�����޷��ջ��κο�Ƭ����Ϸ���������п�Ƭ���ֵĺ;���Ӯ����Ʊ��������
	
	���磺
	��Ƭ�����ǣ�1 2 3
	���Ǵ�1�ſ���ʼ�����Ͱ�1�ſ����ߡ��ٴ�2�ſ���ʼ�������������޷��뿨Ƭ���ϣ�
	�ܿ�����Խ��Խ�󣬲����������߿�Ƭ�ˡ�����������ֻӮ����1����Ʊ��
	
	������̫����������ǿ�ʼ��ɵɵ�ش�2��3�ſ�Ƭ�����Ǿ�һ�ſ�Ƭ���ò����ˡ�
	
	��������ã���Ƭ������ 2 1 3
	�����ǿ���˳���õ����еĿ�Ƭ��
	
	�����Ŀ����ǣ���֪˳ʱ�뿨Ƭ���С�
	���������￪ʼ�����������Ӯ��������Ʊ�������������еĿ�Ƭ����֮�ͣ�
	
	�������ݣ�
	��һ��һ������N(N<100)����ʾ��Ƭ��Ŀ
	�ڶ��� N ����������ʾ˳ʱ�����еĿ�Ƭ
	
	������ݣ�
	һ�У�һ����������ʾ����������Ӯ�ö�������Ʊ
	
	���磺
	�û����룺                                �ٱ���
	3                  3
	1 2 3              2 1 3
	
	����Ӧ�������
	1                   6
	
 */
public class Ӯ��Ʊ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		int [] MAX = new int [N];//������¼ÿ�δӲ�ͬλ�ÿ�ʼȡ��Ʊ�����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < MAX.length; i++) {
			int [] copyArr = Arrays.copyOf(arr,arr.length);//����ԭ����
			MAX[i] = run(copyArr);//��¼Ӯ�õ���Ʊ
			arrGo(arr);//����λ��
		}
		
		Arrays.sort(MAX);
		System.out.println(MAX[MAX.length - 1]);
		sc.close();
	}
	//����ǰ������Ԫ��һλ
	private static void arrGo(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length -1 ] = temp;
	}

	//������Ʊ��
	private static int run(int[] arr) {
		int max = getMax(arr),qp = 0;
		int count = 1;
		
		sign:while(true){
			for (int i = 0; i < arr.length; i++) {
				if( count  == arr[i]){
					qp += arr[i];
					arr[i] = -1;
					count = 1;
					max = getMax(arr);//ȡ�����е����ֵ
				}
				if(arr[i] != -1)count ++;
				if(count > max ) break sign;
			}
		}
		return qp;
	}

	//ȡ�������ֵ
	private static int getMax(int[] arr) {
		int arrMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if( arrMax <arr [i]) arrMax = arr[i];
		}
		return arrMax;
	}
		
}
