package com.lqb.agroup;

/*
 * 
 B      DEF
 A + --- + ------- = 10 
 C      GHI

 BGHI+DEFC =(10 - A)CGHI
 �����ʽ��A~I����1~9�����֣���ͬ����ĸ����ͬ�����֡�

 ���磺
 6+8/3+952/714 ����һ�ֽⷨ��
 5+3/1+972/486 ����һ�ֽⷨ��

 �����ʽһ���ж����ֽⷨ��
 */
public class ����ʽ {
	 public static void main(String[] args) {
		// ʵ�� Ԫ�ض�����ͬ��ȫ���� �򵥵ķ��������ñ����ƽ�ķ��� ֻҪ��ѭ�������ظ����ֵĽ���޳��Ϳ���
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
											// ����Ҫע����ǣ�������������õ��Ļ�������������Ҫ������һ�������ȳ���
											// 1.0 ת���ɸ����� ��������ڷ����ϣ���Ϊ����˳�����׳���
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
