package com.tx.model.number;

public class 天平称重 {
	 

	public static void main(String[] args) {
		for (int i = 1; i < 122; i++) {
			System.out.println(f(i));
			
		}
		 
	}

	private static String f(int n) {
		String str = "";
		int k = 1;
		while(n > 0){
			int sh = n / 3;
			if(n % 3 == 1)str = "+" +k + str; 
			if(n % 3 == 2){
				str = "-" +k + str; 
				sh ++;
			}
			n = sh; 
			k *= 3; 
		}
		
		
		return str.substring(1);
	}
}
/*用天平称重时，我们希望用尽可能少的砝码组合称出尽可能多的重量。
	如果只有5个砝码，重量分别是1，3，9，27，81
	则它们可以组合称出1到121之间任意整数重量（砝码允许放在左右两个盘中）。
	
	本题目要求编程实现：对用户给定的重量，给出砝码组合方案。
	例如：
	用户输入：
	5
	程序输出：
	9-3-1
	用户输入：
	19
	程序输出：
	27-9+1
	
	要求程序输出的组合总是大数在前小数在后。
	可以假设用户的输入的数字符合范围1~121。
*/