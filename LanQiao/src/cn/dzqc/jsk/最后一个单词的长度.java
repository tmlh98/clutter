package cn.dzqc.jsk;

import java.util.Scanner;

public class 最后一个单词的长度 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String []s=str.split(" ");
        if(str.equals(" ")){
        	System.out.println(0) ;
        }else{
        	System.out.println(s.length);
        	 System.out.print(s[s.length-1].length());	
        }
       

	}

}
