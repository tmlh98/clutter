package cn.java.ss;
/*
 * ���µ�10������
       +--+--+--+
   	   |  |  |  |
	+--+--+--+--+
	|  |  |  |  |
	+--+--+--+--+
	|  |  |  |
	+--+--+--+

	����0~9�����֡�Ҫ���������������ֲ������ڡ�
	�����ҡ����¡��ԽǶ������ڣ�
	һ���ж����ֿ��ܵ�����������

 */
public class �������� {
	
	static int count = 0;
	
	public static void main(String[] args) {
		int[] arr = new int []{0,1,2,3,4,5,6,7,8,9};
		run(arr , 0);
		System.out.println(count);
	}
	
	static void run(int[] arr, int k){
		if(k == arr.length -1){
			judge(arr);
			return;
		}
		//�ӵ�һ��λ�ÿ�ʼ�����α���
		for (int i = k; i < 10; i++) {
			//����
			swap(arr,k,i);
			run(arr , k+1);
			//����
			swap(arr, k, i);
		}
	}
	//�ж��Ƿ���������
	private static void judge(int[] arr) {
		if(arr[0] == arr[1] + 1 ||arr[0] == arr[1] - 1)return;
		if(arr[0] == arr[3] + 1 ||arr[0] == arr[3] - 1)return;
		if(arr[0] == arr[4] + 1 ||arr[0] == arr[4] - 1)return;
		if(arr[0] == arr[5] + 1 ||arr[0] == arr[5] - 1)return;
		
		if(arr[1] == arr[2] + 1 ||arr[1] == arr[2] - 1)return;
		if(arr[1] == arr[4] + 1 ||arr[1] == arr[4] - 1)return;
		if(arr[1] == arr[5] + 1 ||arr[1] == arr[5] - 1)return;
		if(arr[1] == arr[6] + 1 ||arr[1] == arr[6] - 1)return;
		
		if(arr[2] == arr[5] + 1 ||arr[2] == arr[5] - 1)return;
		if(arr[2] == arr[6] + 1 ||arr[2] == arr[6] - 1)return;
		
		if(arr[3] == arr[4] + 1 ||arr[3] == arr[4] - 1)return;
		if(arr[3] == arr[7] + 1 ||arr[3] == arr[7] - 1)return;
		if(arr[3] == arr[8] + 1 ||arr[3] == arr[8] - 1)return;
		
		if(arr[4] == arr[5] + 1 ||arr[4] == arr[5] - 1)return;
		if(arr[4] == arr[7] + 1 ||arr[4] == arr[7] - 1)return;
		if(arr[4] == arr[8] + 1 ||arr[4] == arr[8] - 1)return;
		if(arr[4] == arr[9] + 1 ||arr[4] == arr[9] - 1)return;
		
		if(arr[5] == arr[6] + 1 ||arr[5] == arr[6] - 1)return;
		if(arr[5] == arr[8] + 1 ||arr[5] == arr[8] - 1)return;
		if(arr[5] == arr[9] + 1 ||arr[5] == arr[9] - 1)return;
		
		if(arr[6] == arr[9] + 1 ||arr[6] == arr[9] - 1)return;
		
		if(arr[7] == arr[8] + 1 ||arr[7] == arr[8] - 1)return;
		if(arr[9] == arr[8] + 1 ||arr[9] == arr[8] - 1)return;
		count++;
	}

	private static void swap(int[] arr, int k, int i) {
		int temp = arr[k];
		arr[k] = arr[i];
		arr[i] =temp;
	}
	
}
