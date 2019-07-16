package cn.dzqc.lqb;

import java.util.Scanner;

public class basics2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		if (count < 1 || count > 10)
			return;
		StringBuffer shuzu16[] = new StringBuffer[count];
		StringBuffer shuzu2[] = new StringBuffer[count];
		StringBuffer shuzu8[] = new StringBuffer[count];
		StringBuffer shuzu8OUT[] = new StringBuffer[count];
		for (int i = 0; i < count; i++) {
			StringBuffer temp = new StringBuffer(sc.next());
			if (temp.charAt(0) == '0')
				return;
			if (temp.length() > 100000)
				continue;
			shuzu16[i] = temp;
		}
		// 16--->2
		for (int i = 0; i < count; i++) {
			// 将String shuzu[i]转换成2进制的东西
			shuzu2[i] = new StringBuffer("");
			for (int j = 0; j < shuzu16[i].length(); j++) {
				shuzu2[i].append(Change16To2(shuzu16[i].charAt(j)));
			}
			// System.out.println(shuzu2[i]);
		}
		// 2---->8
		for (int i = 0; i < count; i++) {
			// 从后面每次取三位，做成一个字符串，然后返回其八进制
			// 如果不够，就添加
			shuzu8[i] = new StringBuffer("");
			String temp = "";
			for (int j = shuzu2[i].length() - 1; j > -2; j = j - 3) {
				int thisnum = j - 2;
				for (int k = 0; k < 3; k++) {
					if (thisnum < 0)
						temp += "0";
					else
						temp += shuzu2[i].charAt(thisnum);
					thisnum++;
				}
				// System.out.println(temp);
				shuzu8[i].append(Change2To8(temp));
				temp = "";
			}
		}
		// 输出
		for (int i = 0; i < count; i++) {
			shuzu8OUT[i] = new StringBuffer("");
			int flag, k;
			if (shuzu8[i].charAt(shuzu8[i].length() - 1) == '0')
				k = shuzu8[i].length() - 2;
			else
				k = shuzu8[i].length() - 1;
			for (; k >= 0; k--) {
				shuzu8OUT[i].append(shuzu8[i].charAt(k));
			}
			System.out.println(shuzu8OUT[i]);
		}
	}

	private static String Change2To8(String temp) {
		if (temp.equals("000"))
			return "0";
		if (temp.equals("001"))
			return "1";
		else if (temp.equals("010"))
			return "2";
		else if (temp.equals("011"))
			return "3";
		else if (temp.equals("100"))
			return "4";
		else if (temp.equals("101"))
			return "5";
		else if (temp.equals("110"))
			return "6";
		else
			return "7";
	}

	private static String Change16To2(char c) {
		// TODO Auto-generated method stub
		if (c == '0')
			return "0000";
		if (c == '1')
			return "0001";
		else if (c == '2')
			return "0010";
		else if (c == '3')
			return "0011";
		else if (c == '4')
			return "0100";
		else if (c == '5')
			return "0101";
		else if (c == '6')
			return "0110";
		else if (c == '7')
			return "0111";
		else if (c == '8')
			return "1000";
		else if (c == '9')
			return "1001";
		else if (c == 'A')
			return "1010";
		else if (c == 'B')
			return "1011";
		else if (c == 'C')
			return "1100";
		else if (c == 'D')
			return "1101";
		else if (c == 'E')
			return "1110";
		else
			return "1111";
	}
}