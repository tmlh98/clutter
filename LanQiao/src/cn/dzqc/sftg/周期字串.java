package cn.dzqc.sftg;

import java.util.Scanner;

public class 周期字串 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		String str=inScanner.next();
		boolean result=true;
		int num=0;
		for (int i = 1; i <= str.length(); i++) {
			if(str.length()%i==0){
				for (int j = 0; j < str.length()-i; j+=i) {
					if(str.substring(j, i+j).equals(str.substring(j+i, 2*i+j))){
						num+=i;
					}
				}
				if(num==str.length()-i){
					System.out.println(i);
					result=false;
				}
				if(!result){
					break;
				}
			}
			if(result&&i==str.length()){
				System.out.println(i);
			}
		}
		/**
		 * String a = in.next();
		char[] b = a.toCharArray();
		for (int i = 1; i <= a.length(); i++) {
			int flag = 1;		//添加标记
			if (a.length()%i==0) {	//字符串的长度一定是周期的倍数
				for (int j = i; j < a.length(); j++) {
					if (b[j%i]!=b[j]) {	//核心
						flag=0;
						break;
					}
				}
				if (flag==1) {
					System.out.println(i);
					break;
				}
			}
		}

		 * 
		 * 
		 */
		
		
		

	}

}
