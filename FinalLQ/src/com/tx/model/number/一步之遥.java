package com.tx.model.number;

public class 一步之遥 {
	//97x - 127y = 1
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 10000; j++) {
				if(1 + 127* i == j * 97)
					System.out.println("x=" + j +", y ="+ i);
			}
		}
		
		
		int[] xy = new int[2];
		int a = e_gcd(97,127,xy);
		
		System.out.println(a);
		System.out.println(xy[0] + " " + xy[1]);
	}
	
	
	
	// 返回最大公约数
		// xy: 顺便解出的xy
	static int e_gcd(int A, int B, int[] xy)
	{
		if(B==0){
			xy[0] = 1;
			xy[1] = 0;
			return A;
		}
		
		int ans = e_gcd(B, A%B, xy);
		int t = xy[0];
		xy[0] = xy[1];
		xy[1] = t - A/B * xy[0];
		return ans;
	}
}
