package cn.java.ss;
/*
 *  �������n��С��A��B���������Ӻ���ȡ��
	ÿ���˶����Կ�����һ����ȡ�˶��ٸ���Ҳ���Կ������л�ʣ�¶��ٸ���
	���˶��ܴ�������������������жϡ�
	ÿ���˴Ӻ�����ȡ���������Ŀ�����ǣ�1��3��7����8����
	�ֵ�ĳһ��ȡ��ʱ������Ȩ��
	A��ȡ��Ȼ��˫������ȡ��ֱ��ȡ�ꡣ
	�����õ����һ�����һ��Ϊ�������䷽��
	���ȷ������˫�������ж�ʧ�������£������ض��ĳ�ʼ������A�Ƿ���Ӯ��
 */
public class ȡ���� {
	public static void main(String[] args) {
		System.out.println(f(10));
	}

	private static boolean f(int n) {
		if(n >= 1 && !f(n - 1)) return true;
		if(n >= 3 && !f(n - 3)) return true;
		if(n >= 7 && !f(n - 7)) return true;
		if(n >= 8 && !f(n - 8)) return true;
		return false;
	}
}
