package cn.java.ss;

import java.util.Scanner;

/*
 *  X�������С����¥��ȫ��һ���ģ����Ұ�������ʽ���С���¥���ı��Ϊ1,2,3...
	������һ��ʱ������һ�����ڵ�¥���������źš�
	���磺��С���źſ��Ϊ6ʱ����ʼ�������£�
		1  2  3  4  5  6
		12 11 10 9  8  7
		13 14 15 .....
	���ǵ������ǣ���֪������¥��m��n����Ҫ�������֮�������ƶ����루����б�߷����ƶ���
	����Ϊ3������w m n���ո�ֿ�������1��10000��Χ��
	Ҫ�����һ����������ʾm n ��¥������ƶ����롣
	���磺
	�û����룺
		6 8 2
	�򣬳���Ӧ�������
		4
 */
public class �ƶ����� {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int w = sc.nextInt();//ÿһ�п��
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int m1 = (m % w) == 0?m / w:(m / w)+ 1;//���������Ϊ0������Ҫ��1
		int n1 = (n % w) == 0?n / w:(n / w)+ 1;
		
		int m2 = m1%2 == 1?(m % w == 0?w:m%w):(m % w == 0?m % w + 1:w -m % w + 1);
		
		int n2 = n1%2 == 1?(n % w == 0?w:n%w):(n % w == 0?n % w + 1:w -n % w + 1);
		
		System.out.println(m1 + " " +m2);
		System.out.println(n1 + " " +n2);
		System.out.println(Math.abs(m1 -n1) + Math.abs(m2 -n2));
		sc.close();
	}
}
