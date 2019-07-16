package cn.dzqc.jsk;

import java.util.Scanner;

public class 泥塑课 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		do {
			//保存每个班级的数据
			String[][] str = new String[n][];
			int[] a = new int [n];
			for (int i = 0; i < n; i++) {
				str[i] = sc.nextLine().split(" ");
				a[i] = Integer.valueOf(str[i][0])*Integer.valueOf(str[i][1])*Integer.valueOf(str[i][2]);
			}
			int min = 999;
			int max = 0;
			for (int i = 0; i < a.length; i++) {
				if(a[i] < min)min = a[i];
				if(a[i] > max)max = a[i];
			}
			int x1 = 0, x2 =0;
			for (int i = 0; i < a.length; i++) {
				if(min == a[i]) x1 = i; 
				if(max == a[i]) x2 = i; 
			}
			System.out.println(str[x2][3]+" took clay from "+str[x1][3]+".");
			n = Integer.valueOf(sc.nextLine());
		} while (n != -1);
		sc.close();
	}
}
