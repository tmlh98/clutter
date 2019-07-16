package cn.dzqc.sftg;

import java.util.ArrayList;
import java.util.Scanner;
public class ¶ÓÁÐ²Ù×÷ {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		Scanner inScanner=new Scanner(System.in);
		int n=inScanner.nextInt();
		int i=0;
		do {
			int key=inScanner.nextInt();
			switch (key) {
			case 1:
				list.add(inScanner.nextInt());
				i++;
				break;
			case 2:
				if(list.size()==0){
					System.out.println("no");
					i++;
					return;
				}else {
					System.out.println(list.get(0) );
					i++;
					list.remove(0);
					break;
				}
			case 3:
				System.out.println(list.size());
				i++;
				break;
			}
		} while (i!=n);
	}
}
