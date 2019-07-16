package cn.java.eight;

import java.util.Scanner;

/*
 * 小明正在整理一批历史文献。这些历史文献中出现了很多日期。
 * 小明知道这些日期都在1960年1月1日至2059年12月31日。令小明头疼的是，
 * 这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。
 * 更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。 
	 比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。 
	 给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？
	 输入
	 一个日期，格式是”AA/BB/CC”。 (0 <= A, B, C <= 9) 
	 输出
	 输出若干个不相同的日期，每个日期一行，格式是”yyyy-MM-dd”。多个日期按从早到晚排列。 
	 样例输入
	 02/03/04 
	 样例输出
	 2002-03-04 
	 2004-02-03 
	 2004-03-02 
 */
public class 日期问题 {//1960年1月1日至2059年12月31日
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] s = str.split("[/]");
		
		String[] s2 ={s[2],s[0],s[1]}; 
		String[] s3 ={s[2],s[1],s[0]}; 
		
		String[] ss = check(s);
		String[] ss2 = check(s2);
		String[] ss3 = check(s3);
		
		if(check2(s))System.out.println(ss[0] +"-"+ss[1]+"-"+ss[2]);
		if(check2(s2))System.out.println(ss2[0] +"-"+ss2[1]+"-"+ss2[2]);
		if(check2(s3))System.out.println(ss3[0] +"-"+ss3[1]+"-"+ss3[2]);
		
		
	}

	private static boolean check2(String[] s) {
		int year  = Integer.valueOf(s[0]);
		int mouth  = Integer.valueOf(s[1]);
		int day  = Integer.valueOf(s[2]);
		int[] m ={31,28,31,30,31,30,31,31,30,31,30,31};
		if(mouth>0 && mouth <13){
			if(day <= m[mouth -1]){
				return true;
			}else if((year%4==0&&year%100!=0)||year%400 ==0){
				if(mouth == 2 && day <= 29)return true;
			}
		}
		return false;
	}

	private static String[] check(String[] s) {
		int year  = Integer.valueOf(s[0]);
		if(year>=0 && year <60) 
			if(year<10)s[0] = "200" +year;
			else s[0] = "20" +year;
		if(year>=60 && year <100) s[0] = "19" +year;
		return s;
	}
}
