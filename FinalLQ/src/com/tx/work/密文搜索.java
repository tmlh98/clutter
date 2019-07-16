package com.tx.work;

import java.util.Scanner;
/*
 * �㷨����Ƹ�������һ�����ԣ�
 * �裬n�������Ļ�Ϊ��m . ��m����Ψһ�طֽ�Ϊ��Щ�������ӡ�
 * ֻҪ��ÿ����ĸ��Ӧһ����ͬ��������������ͬ��ĸ��ϵļ��žͿ��������ǵĻ���ʾ��
 * ֻҪ�жϻ��Ƿ���ͬ����֪���Ƿ������ͬһ����ĸ��
 */
public class �������� {
	
	static int[] prm = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107};
	
	static long[] kkey;
	
	static int N = 8;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mother = sc.nextLine();
		
		create_kkey(mother);
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		for(int i=0; i<n; i++){
			sum += find(sc.nextLine());
		}
		
		System.out.println(sum);	
		sc.close();
	}

	private static void create_kkey(String mother) {
		kkey = new long[mother.length()-N+1];
		
		kkey[0] = 1;
		for(int i=0; i<N; i++) kkey[0] *= prm[mother.charAt(i)-'a'];
		
		for(int i=1; i<kkey.length; i++){
			kkey[i]=kkey[i-1] / prm[mother.charAt(i-1)-'a'] * prm[mother.charAt(i+N-1)-'a'];
		}	
		
	}
	
	public static int find(String child){
		long key = 1;
		for(int j=0; j<child.length(); j++) 
			key *= prm[child.charAt(j)-'a'];
		
		int n = 0;
		for(int i=0; i<kkey.length; i++) if(kkey[i]==key) n++;
		
		return n;
	}
	
	
}
