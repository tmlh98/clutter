package cn.java.ss;

/*
 * �۲����������,ĳ�����ֵ���������λ�ۼ���Ȼ��������
 1^3 = 1 
 8^3  = 512    5+1+2=8
 17^3 = 4913   4+9+1+3=17
 ...

 ����������1,8,17���ڣ�����������ʵ�������һ���ж��ٸ���

 ����д�����֣���Ҫ��д�κζ�������ݻ�˵���Ե����֡�
 */
public class ���������� {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int a = i * i * i;
			int sum = 0;
			String str = a + "";
			
			for (int j = 0; j < str.length(); j++) {
				sum += str.charAt(j) - 48;
			}
			if(sum == i){
				System.out.println(i);
			}
			
		}
	}
}
