package com.finals.c;

/*
 * ���߽��ǵ�14���ڵ�������1~14 �����֣����ظ�������©��
 Ҫ��ÿ��ֱ���ϵ��ĸ�����֮�ͱ�����ȡ�
 ͼ���Ѿ�������3�����֡�
 ���������λ��Ҫ�������֣���Ψһ��
 ��ú����ύ��ɫ�ڵ��4�����֣������ң��ÿո�ֿ���

 ���磺12 5 4 8
 ��Ȼ���ⲻ����ȷ�Ĵ�
 */
public class �������� {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10, 12, 13 };
		f(arr, 0);
	}

	private static void f(int[] arr, int k) {
		if (arr.length - 1 == k) {
			getResult(arr);
			return;
		}

		for (int i = k; i < arr.length; i++) {
			// ��̽
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
			f(arr, k + 1);
			// ����
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
	}

	private static void getResult(int[] arr) {
		int a = 6 + arr[0] + arr[1] + 11;
		int b = 11 + arr[2] + arr[3] + arr[4];
		int c = arr[4] + arr[5] + arr[6] + arr[7];
		int d = arr[7] + arr[8] + arr[0] + arr[9];
		int e = arr[9] + arr[1] + arr[2] + arr[10];
		int f = arr[10] + arr[5] + arr[3] + 14;
		int g = 14 + arr[6] + arr[8] + 6;

		if (a != b || a != c || a != d || a != e || a != f || a != g)
			return;
		if (b != c || b != d || b != e || b != f || b != g)
			return;
		if (c != d || c != e || c != f || c != g)
			return;

		if (d != e || d != f || d != g)
			return;
		if (e != f || e != g)
			return;
		if (f != g)
			return;
		System.out.println(arr[7] + " " + arr[8] + " " + arr[0] + " " + arr[9]);
	}
}
