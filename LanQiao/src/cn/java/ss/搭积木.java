package cn.java.ss;
/*
	С�����ϲ�������ֻ�ľ��
	һ����10���ľ��ÿ����ľ����һ�����֣�0~9��
	���ľ����
	ÿ����ľ�ŵ�����������ľ�����棬����һ���������������ľ����С��
	�����4��Ľ������Σ������������еĻ�ľ��
	���������ֺϸ�Ĵ��
	   0
	  1 2
	 3 4 5
	6 7 8 9
	
	   0
	  3 1
	 7 5 2
	9 8 6 4    
	������������Ĵһ���ж����֣�
 */
public class ���ľ {
	static int count = 0;
	
	static void swap(int[] arr ,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void show(int[] arr){
		if(arr[0]>arr[1]||arr[0]>arr[2])return;
		if(arr[1]>arr[3]||arr[1]>arr[4])return;
		if(arr[2]>arr[4]||arr[2]>arr[5])return;
		if(arr[3]>arr[6]||arr[3]>arr[7])return;
		if(arr[4]>arr[7]||arr[4]>arr[8])return;
		if(arr[5]>arr[8]||arr[5]>arr[9])return;
		count++;
	}
	static void run(int [] arr , int a){
		if(a == arr.length-1){
			show(arr);
			return ;
		}
		for (int i = a; i < arr.length; i++) {
			//����
			swap(arr, a, i);
			run(arr, a+1);
			//����
			swap(arr, a, i);
		}
	} 
	
	public static void main(String[] args) {
		int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
		run(arr,0);
		System.out.println(count);
	}
	
}
