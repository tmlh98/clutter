package cn.java.demo;
/*
 * stringInGrid��������һ��ָ����С�ĸ����д�ӡָ�����ַ�����
	Ҫ���ַ�����ˮƽ����ֱ���������϶����С�
	����ַ���̫�����ͽضϡ�
	�������ǡ�þ��У���������ƫ�����ƫ��һ�㡣
	������Ŀ�����ݣ�Ӧ�������
	+------------------+
	|                  |
	|     abcd1234     |
	|                  |
	|                  |
	+------------------+
 */
public class ��������� {
	public static void stringInGrid(int width, int height, String s) {
		if (s.length() > width - 2)
			s = s.substring(0, width - 2);
		System.out.print("+");
		for (int i = 0; i < width - 2; i++)
			System.out.print("-");
		System.out.println("+");

		for (int k = 1; k < (height - 1) / 2; k++) {
			System.out.print("|");
			for (int i = 0; i < width - 2; i++)
				System.out.print(" ");
			System.out.println("|");
		}

		System.out.print("|");

		String ff = "%"+((width-2-s.length())/2)+"s%s%"+((width-1-s.length())/2)+"s"; // ���
	//ע�⣺ff��������%s�ֱ��Ӧ��һ�οո��ַ����ڶ��κ�����������s�ַ����ַ��������οո��ַ�
	//����%s��ʾ��ӡһ���ַ���������%is��ʾ��ӡ������Ϊi�Ŀո��ַ���
	//System.out.print(String.format(ff,"",s,""));��������"",s,""�ֱ��ʾ����1,2,3������Ӧ��һ���ַ�����
	//	�ڶ����ַ������������ַ�������ff��Ϊ�����ʽ��

		System.out.print(String.format(ff, "", s, ""));

		System.out.println("|");

		for (int k = (height - 1) / 2 + 1; k < height - 1; k++) {
			System.out.print("|");
			for (int i = 0; i < width - 2; i++)
				System.out.print(" ");
			System.out.println("|");
		}

		System.out.print("+");
		for (int i = 0; i < width - 2; i++)
			System.out.print("-");
		System.out.println("+");
	}
	public static void main(String[] args) {
		stringInGrid(10,5,"dsfsd");
	}
}
