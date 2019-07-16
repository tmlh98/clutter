package cn.dzqc.sftg;

import java.util.Scanner;

public class ÄæĞòÅÅÁĞ {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int arr[]=new int [20];
		int i=0;
		while (true) {
			arr[i]=inScanner.nextInt();
			if(arr[i]==0){
				break;
			}
			i++;
		}
		for (int j = 0; j < i; j++) {
			System.out.print(arr[i-j-1]+" ");
		}
	}
}
