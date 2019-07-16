package com.tx.work;

import java.util.Scanner;

public class 填字母游戏 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(game(sc.next()));
			
		}
		sc.close();
}

	private static int game(String s) {
		return f(s.toCharArray());
	}

	private static int f(char[] c) {
		String s = new String(c);
		if(s.contains("LOL"))return -1;//对手赢了 , 那么我输了
		if(!s.contains("*"))return 0;//没有落子点,平局了
		
		boolean ping = false;
		for (int i = 0; i < c.length; i++) {
			if(c[i] == '*'){
				try{
					c[i] = 'L';
					switch (f(c)) {
						case -1: return 1;
						case 0: ping = true;
					}
					c[i] = 'O';
					switch (f(c)) {
						case -1: return 1;
						case 0: ping = true;
					}
				}finally{
					c[i] = '*';
				}
				
			}
		}
		if(ping) return 0 ;
		return -1;
	}
	
}
