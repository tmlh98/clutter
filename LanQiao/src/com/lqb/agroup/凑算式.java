package com.lqb.agroup;

/*
 * 
 B      DEF
 A + --- + ------- = 10 
 C      GHI

 BGHI+DEFC =(10 - A)CGHI
 这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

 比如：
 6+8/3+952/714 就是一种解法，
 5+3/1+972/486 是另一种解法。

 这个算式一共有多少种解法？
 */
public class 凑算式 {
	 public static void main(String[] args) {
		// 实现 元素都不相同的全排列 简单的方法可以用暴力破解的方法 只要把循环中有重复数字的结果剔除就可以
		int a, b, c, d, e, f, g, h, i, s = 0;
		for (a = 1; a < 10; a++) {
			for (b = 1; b < 10; b++) {
				if (b == a)
					continue;
				for (c = 1; c < 10; c++) {
					if (c == a || c == b)
						continue;
					for (d = 1; d < 10; d++) {
						if (d == a || d == b || d == c)
							continue;
						for (e = 1; e < 10; e++) {
							if (e == a || e == b || e == c || e == d)
								continue;
							for (f = 1; f < 10; f++) {
								if (f == a || f == b || f == c || f == d
										|| f == e)
									continue;
								for (g = 1; g < 10; g++) {
									if (g == a || g == b || g == c || g == d
											|| g == e || g == f)
										continue;
									for (h = 1; h < 10; h++) {
										if (h == a || h == b || h == c
												|| h == d || h == e || h == f
												|| h == g)
											continue;
										for (i = 1; i < 10; i++) {
											if (i == a || i == b || i == c
													|| i == d || i == e
													|| i == f || i == g
													|| i == h)
												continue;
											// 其中要注意的是，两个整数相除得到的还是整数，所以要把其中一个整数先乘以
											// 1.0 转化成浮点数 （建议乘在分子上，因为计算顺序不容易出错）
											double num = a + b * 1.0 / c
													+ (100 * d + 10 * e + f)
													* 1.0
													/ (100 * g + 10 * h + i)
													- 10;
											if (num == 0) {
												s++;
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
		System.out.println(s);
	}

}
