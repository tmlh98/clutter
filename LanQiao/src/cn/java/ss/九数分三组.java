package cn.java.ss;
/*
 *  1~9�����ֿ������3��3λ������Ϊ��A,B,C,  ����Ҫ���������¹�ϵ��
	B = 2 * A
	C = 3 * A
	����д��A�����п��ܴ𰸣����ּ��ÿո�ֿ������ְ��������С�
 */
public class ���������� {
	public static void main(String[] args) {
		char[] c = "123456789".toCharArray();
		run(c,0);
	}

	private static void run(char[] c, int k) {
		if(c.length - 1 == k){
			judge(c);
			return;
		}
		
		for (int i = k; i < c.length; i++) {
			{char temp = c[i];c[i] = c[k]; c[k] = temp;}
			run(c,k+1);
			{char temp = c[i];c[i] = c[k]; c[k] = temp;}
		}
	}

	private static void judge(char[] c) {
		String str = new String(c);
		String A = str.substring(0, 3);
		String B = str.substring(3, 6);
		String C = str.substring(6, 9);
		if(Integer.valueOf(B) == 2 * Integer.valueOf(A)&&Integer.valueOf(C)==3*Integer.valueOf(A)){
			System.out.println(A);
		}
	}
}
