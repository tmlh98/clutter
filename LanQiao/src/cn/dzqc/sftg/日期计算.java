package cn.dzqc.sftg;
import java.util.Calendar;
import java.util.Scanner;
public class ���ڼ��� {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int year=in.nextInt();
		int mouth=in.nextInt();
		int day=in.nextInt();
		Calendar cal=Calendar.getInstance();//���һ������
		cal.set(year, mouth-1,day);//Month ֵ�ǻ��� 0 �ġ����磬0 ��ʾ һ�¡�
		int week=cal.get(Calendar.DAY_OF_WEEK);//ָʾһ�������е�ĳ�졣
		if(week==1)
			System.out.println(7);
		else
			System.out.println(week-1);
	}
}
