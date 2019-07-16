package com.tx.model.recursion;

public class 汉诺塔 {
	
	public static void main(String[] args) {
		f(2 , 'A' ,  'B' , 'C');
	}

	private static void f(int n, char a, char b, char c) {
		if( n == 1){
			move(1, a , c);
		}else{
			f(n -1, a, c, b);//将n-1个盘子借助c从a挪到了b
			move(n  , a, c);
			f(n -1, b, a, c);//将n-1个盘子借助a从b挪到了c
			
		}
	}

	private static void move(int i, char from, char to) {
		System.out.println("第" + i + "个盘子从" +from + "===>" +to);
		
	}
}
