package com.finals.c;

public class ����ʽ {
	public static void main(String[] args) {
		int[] arr = new int []{1,2,3,4,5,6,7,8,9};
		f(arr,0);
		System.out.println(count);
	}

	
	static int count =0;	
	private static void f(int[] arr, int k) {
		if(arr.length== k){
			int a = arr[0]*100 + arr[1] * 10 + arr[2];
			int b = arr[3]*100 + arr[4] * 10 + arr[5];
			int c = arr[6]*100 + arr[7] * 10 + arr[8];
			if(a + b == c ){
				System.out.println(a+" + "+b + "=" + c);
				count ++;	
			}
			return ;
		}
		
		for (int i = k; i < arr.length; i++) {
			{int temp = arr[i];arr[i] =arr[k];arr[k]=temp;}
			f(arr, k +1);
			{int temp = arr[i];arr[i] =arr[k];arr[k]=temp;}
		}
		
	}
}
/* �������ʽ��
    ���� + ���� = ����
    ���ÿ������Ǵ��� 1 ~ 9 �Ĳ�ͬ�����֡�
    �����ʽ�ж����ֿ��ܵ���ȷ��д������
+ 286 = 459
+ 173 = 468
+ 295 = 468
+ 492 = 675
    ���϶�����ȷ����д����
    ע�⣺
+ 222 = 333 �Ǵ������д����
    ��Ϊÿ�����ֱ����ǲ�ͬ�ģ� 
    Ҳ����˵��1~9�е��������֣�ÿ����������ҽ�����һ�Σ�
    ע�⣺
    ���������֡�0����
    ע�⣺
    ����ӷ������ʵ�ʽ�������ֲ�ͬ�Ĵ𰸡�
    ���Դ𰸿϶��Ǹ�ż����
    ע�⣺
    ֻҪ����㲻ͬ�������Ŀ
    ��Ҫ���г�������д��
    ����Ҫ����дԴ���룡

*/