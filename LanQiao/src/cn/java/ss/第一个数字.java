package cn.java.ss;
/*
 * 
���µľ�̬����ʵ���ˣ��Ѵ�s�е�һ�����ֵ����ֵ�ֵ���ء�
����Ҳ������֣�����-1

���磺
s = "abc24us43"  �򷵻�2
s = "82445adb5"  �򷵻�8
s = "ab"   �򷵻�-1   

 */
public class ��һ������ {
	public static int getFirstNum(String s) {
		if (s == null || s.length() == 0)
			return -1;

		char c = s.charAt(0);
		if (c >= '0' && c <= '9')
			return c-48; // ���

		return getFirstNum(s.substring(1,s.length())); // ���
	}
	public static void main(String[] args) {
		System.out.println(getFirstNum("abc24us43"));
		System.out.println(getFirstNum("82445adb5"));
		System.out.println(getFirstNum("ab"));
	}
}