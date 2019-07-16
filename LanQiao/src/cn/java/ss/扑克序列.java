package cn.java.ss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  A A 2 2 3 3 4 4�� һ��4���˿��ơ�����������ų�һ�С�
 Ҫ������A�м���1���ƣ�����2֮����2���ƣ�����3֮����3���ƣ�����4֮����4���ơ�
 ����д�����з���Ҫ��������У��ֵ�����С���Ǹ���
 ���磺22AA3344 �� A2A23344 �ֵ���С����Ȼ�����Ƕ���������Ҫ��Ĵ𰸡�
 ��ͨ��������ύ�𰸡���A��һ����Ҫ��Сд��ĸa��Ҳ��Ҫ�á�1�����档�ַ���һ����Ҫ���ո�
 2342A3A4
 */
public class �˿����� {
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		char[] c = { 'A', 'A', '2', '2', '3', '3', '4', '4' };
		run(c, 0);
		Collections.sort(list);
		System.out.println(list.get(0));

	}

	private static void run(char[] c, int a) {
		if (a == c.length - 1) {
			judge(c);
			return;
		}
		for (int i = a; i < c.length; i++) {
			{
				char temp = c[i];
				c[i] = c[a];
				c[a] = temp;
			}
			run(c, a + 1);
			{
				char temp = c[i];
				c[i] = c[a];
				c[a] = temp;
			}
		}
	}

	private static void judge(char[] c) {
		int a1 = -1, a2 = -1, b1 = -1, b2 = -1, c1 = -1, c2 = -1, d1 = -1, d2 = -1;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'A' && a1 == -1) {
				a1 = i;
			} else if (c[i] == 'A' && a2 == -1) {
				a2 = i;
			}
			if (c[i] == '2' && b1 == -1) {
				b1 = i;
			} else if (c[i] == '2' && b2 == -1) {
				b2 = i;
			}
			if (c[i] == '3' && c1 == -1) {
				c1 = i;
			} else if (c[i] == '3' && c2 == -1) {
				c2 = i;
			}
			if (c[i] == '4' && d1 == -1) {
				d1 = i;
			} else if (c[i] == '4' && d2 == -1) {
				d2 = i;
			}

		}
		if (a2 - a1 == 2 && b2 - b1 == 3 && c2 - c1 == 4 && d2 - d1 == 5) {
			String str = new String(c);
			list.add(str);
		}
	}
}
