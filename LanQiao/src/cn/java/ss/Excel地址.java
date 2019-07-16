package cn.java.ss;
/*
 * Excel单元格的地址表示很有趣，它使用字母来表示列号，比如：
	A表示第1列，
	B表示第2列，
	Z表示第26列，
	AA表示第27列，
	AB表示第28列，
	BA表示第53列，
	....
	当然Excel的最大列号是有限度的，所以转换起来不难。
	如果我们想把这种表示法一般化，可以把很大的数字转换为很长的字母序列呢？
	本题目既是要求对输入的数字, 输出其对应的Excel地址表示方式。
	例如，
	输入：
	26
	则程序应该输出：
	Z
	
	我们约定，输入的整数范围[1,2147483647]
 */
public class Excel地址 {

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
