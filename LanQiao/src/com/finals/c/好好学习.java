package com.finals.c;

public class 好好学习 {
	public static void main(String[] args) {
		String[] str = new String[]{"好","好","学","习"};
		int count = 0;
		int count2 = 0;
		for (int a = 0; a < str.length; a++) {
			for (int b = 0; b < str.length; b++) {
				if(a == b)continue;
				for (int c = 0; c < str.length; c++) {
					if(a == c || b == c )continue;
					for (int d = 0; d < str.length; d++) {
						if(a == d|| b == d || c ==d)continue;
						count ++;
						if("好好学习".equals(str[a] + str[b] + str[c]+str[d]))count2++;
					}
				}
			}
		}
		System.out.println(count2+"/"+count);
	}
}
/*
 * 汤姆跟爷爷来中国旅游。一天，他帮助中国的小朋友贴标语。
 * 他负责贴的标语是分别写在四块红纸上的四个大字：“好、好、学、习”。
 * 但是汤姆不认识汉字，他就想胡乱地贴成一行
 * 请你替小汤姆算一下，他这样乱贴，恰好贴对的概率是多少？ 
 * 答案是一个分数，请表示为两个整数比值的形式。例如：1/3 或 2/15 等。
 * 如果能够约分，请输出约分后的结果。
 */