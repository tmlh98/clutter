package cn.java.ss;
/*
 * ��һ��ú�򣬶ѳ�������׶�Ρ����壺1 4  10 20
	��һ���1����
	�ڶ���3�������г������Σ���
	������6�������г������Σ���
	���Ĳ�10�������г������Σ���
	....
	���һ����100�㣬���ж��ٸ�ú��
 */
public class ú����Ŀ {
	public static void main(String[] args) {
		int count = 0;
		
		int[] arr =new int [100];
		arr[0] = 1;
		
		for (int i = 1; i < arr.length; i ++) {
			arr[i] = arr[ i -1] + i +1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];
		}
		System.out.println(count);
	}
	
}
