package com.lqb.cgroup;

public class 猜字母 {
/*
 * 把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。

    接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。

    得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。

     答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容。
 */
	public static void main(String[] args) {
		//构造a-s
		String str=new String();
		for (int i = 97; i < 116; i++) {
			str+=(char)i;
		}
		//构造长度为2014的串
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < 106; i++) {
			sb.append(str);
		}
		
		str=sb.toString();
		//每次拿到新串
		while(str.length()>1){
			String str1=new String();
			for (int i = 1; i <= str.length(); i++) {
				if(i%2==0){
					str1+=str.charAt(i-1);
				}
			}
			str=str1;
		}
		
		System.out.println(str);
	}
}
