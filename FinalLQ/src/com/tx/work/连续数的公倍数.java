package com.tx.work;

import java.math.BigInteger;
import java.util.Scanner;

import javax.jws.Oneway;

/*
 *  Ϊʲô1Сʱ��60���ӣ�������100�����أ�������ʷ�ϵ�ϰ�ߵ��¡�
 *  ��Ҳ���Ǵ����żȻ��60�Ǹ���������֣��������ӱȽ϶ࡣ
 *  ��ʵ�ϣ�����1��6��ÿ�����ֵı�������1,2,3,4,5,6���ǿ��Գ���60��
 *  ����ϣ��Ѱ�ҵ��ܳ���1��n�ĵ�ÿ�����ֵ���С������
 *  ��ҪС��������֣�������ʮ�ִ󣬱���n=100, �����Ϊ��
 *  69720375229712477164533808935312303556800
 *  ���д����ʵ�ֶ��û������ n ��n<100�����1~n����С��������
 *  
 *  ���磺
 *  �û����룺
 *  6
 *  ���������
 *  60
 * 
 *  �û����룺
 *  10
 *  ���������
 *  2520
 */
public class �������Ĺ����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		BigInteger bg = BigInteger.ONE;
		
		for (int i = 2; i <= n; i++) {
			BigInteger gcd = bg.gcd(new BigInteger("" + i));//2
			bg = bg.multiply(new BigInteger("" + i ));//24
			bg = bg.divide(gcd);//12
		}
		System.out.println(bg);
		sc.close();
	}
}
