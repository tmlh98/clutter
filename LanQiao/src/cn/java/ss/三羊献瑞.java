package cn.java.ss;

/*
 * �۲�����ļӷ���ʽ��
 �� �� �� ��   abcd
 +  �� �� �� �� efgb
 -------------------
 �� �� �� �� ��efcbh

 ���У���ͬ�ĺ��ִ�����ͬ�����֣���ͬ�ĺ��ִ���ͬ�����֡�
 ����д�����������������4λ���֣���Ψһ������Ҫ��д�κζ������ݡ�
 */
public class �������� {
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
