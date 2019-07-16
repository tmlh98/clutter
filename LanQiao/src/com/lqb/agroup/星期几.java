package com.lqb.agroup;
/*
 * 
    1949年的国庆节（10月1日）是星期六。 
	    今年（2012）的国庆节是星期一。
	    那么，从建国到现在，有几次国庆节正好是星期日呢？
	    只要答案，不限手段！
	    可以用windows日历，windows计算器，Excel公式，。。。。。
	    当然，也可以编程！
	    不要求写出具体是哪些年，只要一个数目！
 */
public class 星期几 {
	public static void main(String[] args) {
		int day = 92;
		int count = 0;
		for (int i = 1950; i <= 2012; i++) {
			 if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))//闰年366天 平年365天
	                day += 366;
	           else 
	                day += 365;
	            if(day % 7 == 1){
	            	count++;
	            }
		}
		System.out.println(count);
	}
}
