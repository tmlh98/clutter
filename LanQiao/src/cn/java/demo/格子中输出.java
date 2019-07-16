package cn.java.demo;
/*
 * stringInGrid方法会在一个指定大小的格子中打印指定的字符串。
	要求字符串在水平、垂直两个方向上都居中。
	如果字符串太长，就截断。
	如果不能恰好居中，可以稍稍偏左或者偏上一点。
	对于题目中数据，应该输出：
	+------------------+
	|                  |
	|     abcd1234     |
	|                  |
	|                  |
	+------------------+
 */
public class 格子中输出 {
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

		String ff = "%"+((width-2-s.length())/2)+"s%s%"+((width-1-s.length())/2)+"s"; // 填空
	//注意：ff中有三个%s分别对应第一段空格字符，第二段函数给定变量s字符串字符，第三段空格字符
	//其中%s表示打印一个字符串变量，%is表示打印出长度为i的空格字符串
	//System.out.print(String.format(ff,"",s,""));该语句后面"",s,""分别表示变量1,2,3。即对应第一段字符串，
	//	第二段字符串，第三段字符串。而ff则为输出格式。

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
