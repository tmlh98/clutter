package cn.java.ss;

import java.util.Calendar;

/*
 * ����ѧ�Ҹ�˹�и���ϰ�ߣ�������ζ�Ҫ���ռǡ�
	�����ռ��и����ڲ�ͬ�ĵط������Ӳ�ע�������գ�������һ���������棬���磺4210
	��������֪�����Ǹ������������ڣ�����ʾ��һ���Ǹ�˹������ĵڼ��졣�����Ҳ�Ǹ���ϰ�ߣ�
	��ʱʱ�̿����������ˣ������ֹ�ȥһ�죬���ж���ʱ����������˷��أ�
	��˹�����ڣ�1777��4��30�ա�
	�ڸ�˹���ֵ�һ����Ҫ������ռ��ϱ�ע�ţ�5343����˿���������ǣ�1791��12��15�ա�
	��˹��ò�ʿѧλ�������ռ��ϱ��ţ�8113   
	���������˹��ò�ʿѧλ�������ա�
 */
public class ��˹�ռ� {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();// ���ϵͳʱ��
		cal.set(1777, 3, 30);
		int count = 0;
		while (true) {
			cal.add(cal.DATE, 1);// ������ÿ������һ��
			count++;
			if (count == 5343) {
				System.out.println(cal.get(Calendar.YEAR) + "��"
						+ (cal.get(Calendar.MONTH) + 1) + "��"
						+ (cal.get(Calendar.DAY_OF_MONTH)- 1));
				break;
			}
		}
	}
}
