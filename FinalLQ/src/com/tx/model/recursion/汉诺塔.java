package com.tx.model.recursion;

public class ��ŵ�� {
	
	public static void main(String[] args) {
		f(2 , 'A' ,  'B' , 'C');
	}

	private static void f(int n, char a, char b, char c) {
		if( n == 1){
			move(1, a , c);
		}else{
			f(n -1, a, c, b);//��n-1�����ӽ���c��aŲ����b
			move(n  , a, c);
			f(n -1, b, a, c);//��n-1�����ӽ���a��bŲ����c
			
		}
	}

	private static void move(int i, char from, char to) {
		System.out.println("��" + i + "�����Ӵ�" +from + "===>" +to);
		
	}
}
