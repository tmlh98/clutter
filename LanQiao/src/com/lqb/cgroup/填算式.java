package com.lqb.cgroup;
/*
 * �������ʽ��
    ���� + ���� = ����
    ���ÿ������Ǵ��� 1 ~ 9 �Ĳ�ͬ�����֡�
    �����ʽ�ж����ֿ��ܵ���ȷ��д������

    173 + 286 = 459
    295 + 173 = 468
    173 + 295 = 468
    183 + 492 = 675
    ���϶�����ȷ����д����
    ע�⣺
    111 + 222 = 333 �Ǵ������д����
    ��Ϊÿ�����ֱ����ǲ�ͬ�ģ� 
    Ҳ����˵��1~9�е��������֣�ÿ����������ҽ�����һ�Σ�
    ע�⣺
    ���������֡�0����
    ע�⣺
    ����ӷ������ʵ�ʽ�������ֲ�ͬ�Ĵ𰸡�
    ���Դ𰸿϶��Ǹ�ż����

 */
public class ����ʽ {
	private static int count = 0;
	//����
	public static void swap(int[] A, int i, int j) {
		 int temp = A[i];
		 A[i] = A[j];
		 A[j] = temp;
	}

	public static void getCount(int[] arr,int temp) {
		if(temp == arr.length){
			int a = arr[0]*100 + arr[1]*10 + arr[2];
			int b = arr[3]*100 + arr[4]*10 + arr[5];
			int c = arr[6]*100 + arr[7]*10 + arr[8];
			if(a + b ==c) count++;
			return;
		}else{
			for (int i = temp; i < arr.length; i++) {
				swap(arr, i, temp);
				getCount(arr, temp+1);
				swap(arr, i, temp);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int []{1,2,3,4,5,6,7,8,9};
		getCount(arr, 0);
		System.out.println(count);
	}
}
