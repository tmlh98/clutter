package cn.dzqc.lqb;

import java.util.Scanner;

public class Torry的困惑_基本型 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int n=inScanner.nextInt();
		int temp=0,l=1;
		
		for (int i = 2; i <= 100000; i++) {
			if(isZS(i)){
				temp++;
				l=i*l%50000;
			}
			if(temp==n){
				break;
			}
		}
		System.out.println(l);

	}
	static Boolean isZS(int num){
		for (int i = 2; i < num; i++) {
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
