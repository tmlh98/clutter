package com.lqb.cgroup;

public class ËãÄêÁä {
	public static void main(String[] args) {
		for(int i = 0;i <= 100;i++) {
            for(int j = 1800;j <= 1899;j++) {
                if(i * i - j == i) {
                    System.out.println("i^2 = "+(i*i));
                    System.out.println("i = "+i+", j = "+j);
                }
            }
        }

	}
}
