package cn.java.ss;

/*
 * 观察下面的加法算式：
 祥 瑞 生 辉   abcd
 +  三 羊 献 瑞 efgb
 -------------------
 三 羊 生 瑞 气efcbh

 其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。
 你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。
 */
public class 三羊献瑞 {
	public static void main(String[] args) {
		int a, b, c, d, e, f, g, h;
		for (a = 0; a < 10; a++) {
			for (b = 0; b < 10; b++) {
				if (a == b)
					continue;
				for (c = 0; c < 10; c++) {
					if (a == c || b == c)
						continue;
					for (d = 0; d < 10; d++) {
						if (a == d || b == d || c == d)
							continue;
						for (e = 1; e < 10; e++) {
							if (a == e || b == e || c == e || d == e)
								continue;
							for (f = 0; f < 10; f++) {
								if (a == f || b == f || c == f || d == f
										|| e == f)
									continue;
								for (g = 0; g < 10; g++) {
									if (a == g || b == g || c == g || d == g
											|| e == g || f == g)
										continue;
									for (h = 0; h < 10; h++) {
										if (a == h || b == h || c == h
												|| d == h || e == h || f == h
												|| g == h)
											continue;
										int num1 = a * 1000 + b * 100 + c * 10
												+ d;
										int num2 = e * 1000 + f * 100 + g * 10
												+ b;
										int result = e * 10000 + f * 1000 + c
												* 100 + b * 10 + h;
										if (num1 + num2 == result)
											System.out.println(e + " " + f + " "
													+ g + " " + b);

									}
								}
							}
						}
					}
				}
			}
		}
	}
}
