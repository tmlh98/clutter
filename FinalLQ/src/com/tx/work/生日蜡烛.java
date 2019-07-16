package com.tx.work;
public class ÉúÈÕÀ¯Öò {
	
	public static void main(String[] args) {
		int a = 1;
		int count = 0;
		for (int i = a; i < 50; i++) {
			count += i ;
			if(count == 236){
				System.out.println(a);
			}
			if(count > 236){
				count = 0;
				i = a;  
				a ++;
			}
		}
	}
}
