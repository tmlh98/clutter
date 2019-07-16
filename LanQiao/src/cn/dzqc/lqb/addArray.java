package cn.dzqc.lqb;

import java.util.Scanner;

public class addArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int 
		no= in.nextInt();
		long num=0;
		if(no<=1000000000&&no>=1){
			for(int i=1;i<=no;i++){
				num+=i;
			}
			System.out.println(num);
		}
		
	}

}
