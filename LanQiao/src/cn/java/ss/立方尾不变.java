package cn.java.ss;
/*
 * 有些数字的立方的末尾正好是该数字本身。
比如：1,4,5,6,9,24,25,....

请你计算一下，在10000以内的数字中（指该数字，并非它立方后的数值），符合这个特征的正整数一共有多少个。
 */
public class 立方尾不变 {
	public static void main(String[] args) {
		int count = 0;
		for (long i = 1; i <= 10000; i++) {
			String str=i+"";
			String str2=(i*i*i)+"";
			String str3=str2.substring(str2.length()-str.length(),str2.length());
			if(str3.equals(str)){
				count++;
			}
		}
		System.out.println(count);
	}
}
