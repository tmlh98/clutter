package cn.dzqc.sftg;
import java.util.Calendar;
import java.util.Scanner;
public class 日期计算 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int year=in.nextInt();
		int mouth=in.nextInt();
		int day=in.nextInt();
		Calendar cal=Calendar.getInstance();//获得一个日历
		cal.set(year, mouth-1,day);//Month 值是基于 0 的。例如，0 表示 一月。
		int week=cal.get(Calendar.DAY_OF_WEEK);//指示一个星期中的某天。
		if(week==1)
			System.out.println(7);
		else
			System.out.println(week-1);
	}
}
