package cn.dzqc.lqbtwo;

import java.util.Scanner;

public class 二次幂的表示 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		calute(n);
	}

	private static void calute(int n) {//递归看系数,eg：137-》2^7+2^3+2^0，其实下面判断的为，7,3,0，然后继续，7拆分
		String sum=Integer.toBinaryString(n);//十进制转二进制          10001001
		int []a=new int[sum.length()];
		int k=0;
		for (int i = 0; i < sum.length(); i++) {
			if(sum.charAt(i)=='1'){
				a[k]=sum.length()-1-i;
				k++;
			}
		}
		for (int i = 0; i <=k-1; i++) {//7 3 0
			if(a[i]==0){
				System.out.print("2(0)");
			}else if (a[i]==1) {
				System.out.print("2");
			}else if (a[i]==2) {
				System.out.print("2(2)");
			}else {
				System.out.print("2(");
				calute(a[i]); // 递归次幂
				System.out.print(")");
			}
			if (i != k-1) {
				System.out.print("+");
			}
			
		}
		
	}
}
