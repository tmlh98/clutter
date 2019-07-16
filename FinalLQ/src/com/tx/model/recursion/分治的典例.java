package com.tx.model.recursion;

public class ���εĵ��� {
	
	public static void main(String[] args) {
		int n = 8;
		int[][] table = new int [n][n];
		part(table , n);
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void part(int[][] table, int n) {
		if(n == 1){
			table[0][0] = 1;
		}else{
			int m = n / 2;
			part(table, m);//�����������
			
			for (int i = 0; i < m; i++) {//����
				for (int j = m; j < table.length; j++) {
					table[i][j] = table[i][j -m] + m;
				}
			}
			
			for (int i = m; i < table.length; i++) {//����
				for (int j = 0; j < m; j++) {
					table[i][j] = table[i - m][j] + m;
					
				}
			}
			
			for (int i = m; i < table.length; i++) {//����
				for (int j = m; j < table.length; j++) {
					table[i][j] = table[i - m][j - m];
				}
				
			}
		}
	}
}
