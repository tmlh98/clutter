import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int sumDay = 0;
		switch (month) {
			case 12:
				sumDay += 30;
			case 11:
				sumDay += 31;
			case 10:
				sumDay += 30;
			case 9:
				sumDay += 31;
			case 8:
				sumDay += 31;
			case 7:
				sumDay += 30;
			case 6:
				sumDay += 31;
			case 5:
				sumDay += 30;
			case 4:
				sumDay += 31;
			case 3:
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					sumDay += 29;
				else
					sumDay += 28;
			case 2:
				sumDay += 31;
			case 1:
				sumDay += day;

		}
		System.out.println(year + "��" + month + "��" + day + "���ǽ���ĵ�" + sumDay
				+ "��");
	}
}