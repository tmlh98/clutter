package cn.java.ss;

import java.util.Scanner;
/*
 *  X����Ŀ���ѧ�ҷ�����һ���Ŵ������������롣
	��Щ��������A��B��C��D ����ֲ������Ӵ��ɵ����С�
	��ϸ�������֣���Щ���봮����Ӧ����ǰ��ԳƵģ�Ҳ��������˵�ľ��񴮣���
	���������Զ������������������ˣ�������ܻ�ʧȥ�����������
	
	��������ǣ�
	����һ�����ڿ��������봮������һ�´ӵ�����״̬����Ҫ����������ٸ����ӣ��ſ��ܻ������ڵ����ӡ�
	
	����һ�У���ʾ���ڿ��������봮�����Ȳ�����1000��
	Ҫ�����һ������������ʾ���������˶��ٸ����ӡ�
	
	���磬���룺
	ABCBA
	�����Ӧ�������
	0
	
	�����磬���룺
	ABDCDCBABC
	�����Ӧ�������
	3
 */
public class �������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String str2 = "";
		//�ִ���ת
		for (int i = str.length() - 1; i >= 0 ; i--) {
			str2 += str.charAt(i);
		}
		//����󹫹�������
		int len = f(str , str2);
		System.out.println(str.length() - len);
	}

	private static int f(String str, String str2) {
		if(str.length() == 0||str2.length() ==0)return 0;
		
		if(str.charAt(0) == str2.charAt(0))
			//������һ�ֽ�,������ĸ��ͬʱ,��¼��ʱ���
			return f(str.substring(1), str2.substring(1)) + 1;
		else//��ʱҪôȡ���µ�str����Ҫôȡstr2��
			return Math.max(f(str.substring(1),str2),f(str,str2.substring(1)));
	}
}
