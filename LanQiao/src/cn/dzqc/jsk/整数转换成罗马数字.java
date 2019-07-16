package cn.dzqc.jsk;

import java.util.Scanner;

public class 整数转换成罗马数字 {
	public static void main(String[] args) {
		// Ⅰ（1）、X（10）、C（100）、M（1000）、V（5）、L（50）、D（500)
		Scanner inScanner=new Scanner(System.in);
		int num=inScanner.nextInt();  
		System.out.println(intToRoman(num));
		inScanner.close();
	}

	public static String intToRoman(int number) {
		int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V", "IV", "I" };
		String roman = "";
		int i = 0;
		while (number != 0) {//3999 2999 1999 999 99 9
			if (number >= base[i]) {
				number -= base[i];//2999 1999 999 99 9
				roman += str[i];//MMMCDMXCIX
			} else
				i++;
		}
		return roman;
	}
}
