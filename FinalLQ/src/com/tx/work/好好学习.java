package com.tx.work;

public class ºÃºÃÑ§Ï° {
	
	public static void main(String[] args) {
		char[] c = {'a','a','b','c'};
		f(c  , 0);
		
		System.out.println(a +"/" +count);
	}
	static int count =0;
	static int a =0;
	private static void f(char[] c, int j) {
		if(c.length == j){
			if(new String(c) .equals("aabc"))a++;
			count++;
			return;
		}
		for (int i = j; i < c.length; i++) {
			{char ar = c[i];c[i]  =c[j];c[j] = ar;};
			f(c, j +1);
			{char ar = c[i];c[i]  =c[j];c[j] = ar;};
		}
	}
}
