package cn.java.ss;
/*
	ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������
	��������������һ����Ϩ��236������
	���ʣ����Ӷ����꿪ʼ������party�ģ�
	����д����ʼ������party����������
 */
public class �������� {
	public static void main(String[] args) {
		for (int i = 2; i < 50; i++) {
			int count = 0;
			for (int j = i; j < 50; j++) {
				count+=j;
				if(count == 236){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
