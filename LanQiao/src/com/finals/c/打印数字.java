package com.finals.c;
/*
 * 小明写了一个有趣的程序，给定一串数字。
它可以输出这串数字拼出放大的自己的样子。

比如“2016”会输出为：
 22222   00000       1   6666
2     2 0     0    1 1  6
      2 0     0      1  666666
     2  0     0      1  6     6
   2    0     0      1  6     6
 2    2 0     0      1  6     6
2222222  00000     1111  66666

请仔细分析代码，填写划线部分缺少的内容。




注意：只提交划线部分缺少的代码，不要添加任何题面已有代码或符号。
也不要提交任何说明解释文字等。
 */
public class 打印数字 {
		static void f(int n){
			String[][] di = 
		  {{" 00000 ",
			"0     0",
			"0     0",
			"0     0",
			"0     0",
			"0     0",
			" 00000 "},
			{"     1 ",
			"   1 1 ",
			"     1 ",
			"     1 ",
			"     1 ",
			"     1 ",
			"   1111"},
			{" 22222 ",
			"2     2",
			"      2",
			"     2 ",
			"   2   ",
			" 2    2",
			"2222222"},
			{" 33333 ",
			"3     3",
			"      3",
			"  3333 ",
			"      3",
			"3     3",
			" 33333 "},
			{"   44  ",
			"  4 4  ",
			" 4  4  ",
			"4   4  ",
			"4   4  ",
			"4444444",
			"    4  "},
			{" 55555 ",
			" 5     ",
			"555555 ",
			"      5",
			"      5",
			"5     5",
			" 55555 "},
			{" 6666  ",
			"6      ",
			"666666 ",
			"6     6",
			"6     6",
			"6     6",
			" 66666 "},
			{"7777777",
			"7    7 ",
			"    7  ",
			"   7   ",
			"  7    ",
			" 7     ",
			" 7     "},
			{" 88888 ",
			"8     8",
			"8     8",
			" 88888 ",
			"8     8",
			"8     8",
			" 88888 "},
			{" 99999 ",
			"9     9",
			"9     9",
			" 999999",
			"      9",
			"9     9",
			" 99999 "}};
				               
				char[] cc = (""+n).toCharArray(); 
				          
				for(int i=0; i<di[0].length; i++){
					for(int j=0; j<cc.length; j++){
						System.out.print(di[cc[j] - '0'][i] + " ");  //填空位置
					}
					System.out.println();
			}	
		}
		
		public static void main(String[] args){
			f(2016);
		}
}
