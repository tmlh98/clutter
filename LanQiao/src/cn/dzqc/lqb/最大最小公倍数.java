package cn.dzqc.lqb;

import java.util.Scanner;

public class �����С������ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��֪һ��������N���ʴ�1~N����ѡ�������������ǵ���С������������Ϊ���١�1 <= N <= 1000000��
		Scanner inScanner=new Scanner(System.in);
		long n = inScanner.nextLong();
		long num = 0;
		if (n<=2) {
			num=n;
		}else if (n%2==1) {//��������
			num = n*(n-1)*(n-2);
		}else {
			if (n%3==0) {//n��3�ı���
				num = (n-1)*(n-2)*(n-3);
			}else {//8
				num=n*(n-1)*(n-3);
			}
		}
		System.out.println(num);

	}

}
