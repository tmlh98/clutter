package cn.dzqc.sftg;

import java.util.Scanner;

public class 约数个数 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int count = 0;
		for (int i = N; i >0; i--) {
			if(N%i==0){
				count++;
			}
		}
		System.out.println(count);
	}
}
