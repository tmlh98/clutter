package cn.java.ss;

import java.util.HashSet;
import java.util.Scanner;

/*
 * ��������
	������n��С����Χ����һȦ����ʦ��ÿ��С���������ż�����ǹ���Ȼ������������Ϸ��
	����ÿ��С���Ѷ����Լ����ǹ���һ������ֱߵĺ��ӡ�
	����һ�ַ��Ǻ�ӵ���������ǵĺ�������ʦ����1���ǹ����Ӷ����ż����
	�����������������Ϸ��ֱ������С���ѵ��ǹ�������ͬΪֹ��
	�������������Ԥ������֪�ĳ�ʼ�ǹ������£���ʦһ����Ҫ�������ٸ��ǹ���
	�����ʽ
	�����������ȶ���һ������N(2<N<100)����ʾС���ѵ�������
	����������һ���ÿո�ֿ���N��ż����ÿ��ż��������1000����С��2��
	�����ʽ
	����Ҫ��������һ����������ʾ��ʦ��Ҫ�������ǹ�����
	��������
	3
	2 2 4
	�������
	4
 */
public class ���ǹ� {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int [N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		while(true){
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int i = 0; i < a.length; i++) {
				hs.add(a[i]);
				
				if(a[i] %2 == 1){//�ǹ�Ϊ����ʱ
					a[i]++;//�����ǹ�
					count++;
				}
				
			}
			if(hs.size() == 1){//��ʱÿ��С���ѵ��ǹ����������
				break;
			}
			for (int i = 0; i < a.length; i++) {
				int temp = a[0] / 2;
				if(i == a.length - 1)
					a[a.length - 1] =a[a.length - 1]/2+ temp;
				else if(i == 0)
					a[0] = temp + a[1] / 2;
				else
					a[i] = a[i]/2+a[i + 1] / 2;
			}
		}
		
		System.out.println(count);
	}

}
