package cn.java.ss;
/*
 * Excel��Ԫ��ĵ�ַ��ʾ����Ȥ����ʹ����ĸ����ʾ�кţ����磺
	A��ʾ��1�У�
	B��ʾ��2�У�
	Z��ʾ��26�У�
	AA��ʾ��27�У�
	AB��ʾ��28�У�
	BA��ʾ��53�У�
	....
	��ȻExcel������к������޶ȵģ�����ת���������ѡ�
	�������������ֱ�ʾ��һ�㻯�����԰Ѻܴ������ת��Ϊ�ܳ�����ĸ�����أ�
	����Ŀ����Ҫ������������, ������Ӧ��Excel��ַ��ʾ��ʽ��
	���磬
	���룺
	26
	�����Ӧ�������
	Z
	
	����Լ���������������Χ[1,2147483647]
 */
public class Excel��ַ {

	public static void main(String[] args) {
		String str = f(12666);
		System.out.println(str);
	}

	private static String f(int n) {
		for (int i = 0; i <= 26; i++)
			for (int j = (i == 0) ? 0 : 1; j <= 26; j++)
				for (int k = (j == 0) ? 0 : 1; k <= 26; k++) {
					int x = i * 26 * 26 + j * 26 + k;
					if (x == n) {
						String s = "";
						if (i > 0)
							s += (char) (i - 1 + 'A');
						if (j > 0)
							s += (char) (j - 1 + 'A');
						if (k > 0)
							s += (char) (k - 1 + 'A');
						return s;
					}
				}
		return "";

	}
	
	static int f(String s){
		int n = 0;
		for(int i=0; i<s.length(); i++){
			n = n * 26 + (s.charAt(i)-'A' + 1);
		}
		return n;
	}

}
