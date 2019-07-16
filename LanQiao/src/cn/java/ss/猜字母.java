package cn.java.ss;
/*
 * 把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。
    接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。
    得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。
 */
public class 猜字母 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < 106; i++) {
			for (char j = 97; j < 97+19; j++) {
				str.append(j);
			}
		}
		
		while (str.length()>1) {
			StringBuilder str2 = new StringBuilder();
			for (int  i= 0;  i< str.length(); i++) {
				if(i%2==1)str2.append(str.charAt(i));
			}
			str = str2;
		}
		System.out.println(str.toString());
	}
}