package cn.java.ss;
/*
 * ��abcd...s��19����ĸ��ɵ������ظ�ƴ��106�Σ��õ�����Ϊ2014�Ĵ���
    ������ɾ����1����ĸ������ͷ����ĸa�����Լ���3������5������������λ�õ���ĸ��
    �õ����´��ٽ���ɾ������λ����ĸ�Ķ����������ȥ�����ֻʣ��һ����ĸ����д������ĸ��
 */
public class ����ĸ {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < 106; i++) {
			for (char j = 97; j < 97+19; j++) {
				str.append(j);
			}
		}
		
		while (str.length()>1) {
			StringBuilder str2 = new StringBuilder();
			for (int  i= 0;  i< str.length(); i++) {
				if(i%2==1)str2.append(str.charAt(i));
			}
			str = str2;
		}
		System.out.println(str.toString());
	}
}