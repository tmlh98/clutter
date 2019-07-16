package cn.dzqc.lqb;

import java.util.Scanner;

public class CappCH0801 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.print("zrf is:"+a+"/"+b+";");
		System.out.println("ssh is:"+c+"/"+d);
		double zzf=a/b;
		double ssh=c/d;
		if(zzf==ssh)
			System.out.print("(zrf==ssh) is:0;");
		else
			System.out.print("(zrf==ssh) is:1;");
		if(zzf<ssh)
			System.out.print("(zrf<ssh) is:1");
		else
			System.out.print("(zrf<ssh) is:0");	
		
		
		
		
	}

}
