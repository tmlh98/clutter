package cn.java.demo;
/*
 * ��Щ���ֵ�������ĩβ�����Ǹ����ֱ���
 ���磺1,4,5,6,9,24,25,....

�������һ�£���10000���ڵ������У�ָ�����֣����������������ֵ�����������������������һ���ж��ٸ���
 */
public class ����β���� {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 10000; i++) {
			int temp = i * i *i;
			if((temp+"").endsWith(i+"")){
				count ++;
			}
					
		}
		System.out.println(count);
	}
}
