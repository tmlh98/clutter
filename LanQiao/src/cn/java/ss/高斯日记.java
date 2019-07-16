package cn.java.ss;

import java.util.Calendar;

/*
 * 大数学家高斯有个好习惯：无论如何都要记日记。
	他的日记有个与众不同的地方，他从不注明年月日，而是用一个整数代替，比如：4210
	后来人们知道，那个整数就是日期，它表示那一天是高斯出生后的第几天。这或许也是个好习惯，
	它时时刻刻提醒着主人：日子又过去一天，还有多少时光可以用于浪费呢？
	高斯出生于：1777年4月30日。
	在高斯发现的一个重要定理的日记上标注着：5343，因此可算出那天是：1791年12月15日。
	高斯获得博士学位的那天日记上标着：8113   
	请你算出高斯获得博士学位的年月日。
 */
public class 高斯日记 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();// 获得系统时间
		cal.set(1777, 3, 30);
		int count = 0;
		while (true) {
			cal.add(cal.DATE, 1);// 让日子每天向后加一天
			count++;
			if (count == 5343) {
				System.out.println(cal.get(Calendar.YEAR) + "年"
						+ (cal.get(Calendar.MONTH) + 1) + "月"
						+ (cal.get(Calendar.DAY_OF_MONTH)- 1));
				break;
			}
		}
	}
}
