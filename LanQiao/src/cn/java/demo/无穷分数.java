package cn.java.demo;
/*
 * ����ķ�������ʱ�������ڹ̶������֡�
����㡾ͼ1.jpg����ʾ�����������Ҫ���������룬��ȷ��С�����5λ��С��λ����Ĳ�0��

����д�ø�������������д�κζ�������ݡ�
 */
public class ������� {
	public static void main(String[] args) {
		double n = get(1.00);
		System.out.println(String.format("%.5f", n));
	}

	private static double get(double i) {
		if(i == 100)return i;
		return i/(i+get(i+1));
	}
}
