package cn.dzqc.sftg;

import java.util.Scanner;

public class µİÍÆÇóÖµ {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int n=inScanner.nextInt();
		System.out.println(F(n, 1));
		System.out.println(F(n, 2));
	}
	//F(n, 1)=F(n-1, 2) + 2F(n-3, 1) + 5,
	//¡¡F(n, 2)=F(n-1, 1) + 3F(n-3, 1) + 2F(n-3, 2) + 3.
	static int F(int n,int num){
		if(num==1){
			if(n==1)return 2;
			if(n==2)return 1;
			if(n==3)return 6;
			
			return (F(n-1, 2)+2*F(n-3, 1)+5)%99999999;
		}
		if(num==2){
			if(n==1)return 3;
			if(n==2)return 4;
			if(n==3)return 5;
			
			return (F(n-1, 1)+3*F(n-3, 1)+2*F(n-3, 2)+3)%99999999;
		}
		return 0;
	}
}
