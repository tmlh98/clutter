package com.lqb.cgroup;

import java.util.Scanner;

public class �ƶ����� {
	private static Scanner in= new Scanner(System.in);

	/*
	 * X�������С����¥��ȫ��һ���ģ����Ұ�������ʽ���С���¥���ı��Ϊ1,2,3...
	 *  ������һ��ʱ������һ�����ڵ�¥���������źš�
	 *  ���磺��С���źſ��Ϊ6ʱ����ʼ�������£�
	 *  1  2  3  4  5  6
	 *  12 11 10 9  8  7
	 *  13 14 15 .....
	 *  ���ǵ������ǣ���֪������¥��m��n����Ҫ�������֮�������ƶ����루����б�߷����ƶ���
	 *  ����Ϊ3������w m n���ո�ֿ�������1��10000��Χ��
	 *  Ҫ�����һ����������ʾm n ��¥������ƶ����롣 
	 *  ���磺 
	 *  �û����룺 6 8 2 ��
	 *  ����Ӧ������� 4 
	 */
	public static void main(String[] args) {
		int w=in.nextInt();//���
		int m=in.nextInt();
		int n=in.nextInt();
		int mRow=0;
		int nRow=0;
		//����m��ǰ��
		if(m%w==0)mRow=m/w;
		else mRow=m/w+1;
		//����n��ǰ��
		if(n%w==0)nRow=n/w;
		else nRow=n/w+1;
		int mLine=0;
		int nLine=0;
		//����m��ǰ��
		if(mRow%2==0)mLine=w-m%w+1;//������
		else mLine=m%w;//ż����
		//����n��ǰ��
		if(nRow%2==0)nLine=w-n%w+1;//������
		else nLine=n%w;//ż����
		int shortPath=Math.abs(mRow-nRow)+Math.abs(mLine-nLine);
		System.out.println(shortPath);
	}
}
