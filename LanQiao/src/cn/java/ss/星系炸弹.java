package cn.java.ss;

import java.util.Calendar;

/*
 * 在X星系的广袤空间中漂浮着许多X星人造“炸弹”，用来作为宇宙中的路标。
	每个炸弹都可以设定多少天之后爆炸。
	比如：阿尔法炸弹2015年1月1日放置，定时为15天，则它在2015年1月16日爆炸。
	有一个贝塔炸弹，2014年11月9日放置，定时为1000天，请你计算它爆炸的准确日期。
	请填写该日期，格式为 yyyy-mm-dd  即4位年份2位月份2位日期。比如：2015-02-19
 */
public class 星系炸弹 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2014, 10, 9);
		int count = 0;
		while(true){
			cal.add(cal.DATE, 1);
			count++;
			if(count == 1000){
				System.out.println(cal.getTime());
				System.out.println(cal.get(Calendar.YEAR) + "年"
						+ (cal.get(Calendar.MONTH) + 1) + "月"
						+ (cal.get(Calendar.DAY_OF_MONTH)));
				break;
			}
		}
	}
}
