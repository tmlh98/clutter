package com.tx.work;

public class ������ҵ {

	public static void main(String[] args) {
			
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		f(arr , 0);
		System.out.println(count);
	}
	
	static int count = 0 ;
	private static void f(int[] arr, int k) {
		if(arr.length -1 == k){
			if(arr[0] + arr[1] != arr[2])return;
			if(arr[3] - arr[4] != arr[5])return;
			if(arr[6] * arr[7] != arr[8])return;
			if(arr[11] + arr[10] != arr[9])return;
			count ++;
		}
		
		for (int i = k; i < arr.length; i++) {
			swap(arr , i , k);
			f(arr, k +1);
			swap(arr , i , k);
		}
	}

	private static void swap(int[] arr, int i, int k) {
		int temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
		
	}
}
/*
	����Сѧ����ѧ��ĿҲ������ô����ġ�
	�������������ҵ��
	
s	   �� + �� = ��
	   �� - �� = ��
	   �� �� �� = ��
	   �� �� �� = ��
	   
	ÿ���������1~13�е�ĳһ�����֣��������ظ���
	���磺
	 6  + 7 = 13
	 9  - 8 = 1
	 3  * 4 = 12
	 10 / 2 = 5
	
	�Լ��� 
	 7  + 6 = 13
	 9  - 8 = 1
	 3  * 4 = 12
	 10 / 2 = 5
	
	�������ֽⷨ�����ӷ����˷������ɺ��㲻ͬ�ķ�����
	��һ���ҵ��˶����ַ�����
	����д��ʾ������Ŀ��������
*/