package cn.dzqc.sftg;

import java.util.Scanner;

public class _9_3摩尔斯电码 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str =in.next();
		String str2;
		int begin=0;
		while(true){
			int index=str.indexOf("|",begin);
			if(index<0){
				str2=str.substring(begin);
			}else{
				str2=str.substring(begin,index);
			}
			begin=index+1;
			/** 判断代码并转换 */
			if (str2.equals("*-"))
				System.out.print("a");
			else if (str2.equals("-***"))
				System.out.print("b");
			else if (str2.equals("-*-*"))
				System.out.print("c");
			else if (str2.equals("-**"))
				System.out.print("d");
			else if (str2.equals("*"))
				System.out.print("e");
			else if (str2.equals("**-*"))
				System.out.print("f");
			else if (str2.equals("--*"))
				System.out.print("g");
			else if (str2.equals("****"))
				System.out.print("h");
			else if (str2.equals("**"))
				System.out.print("i");
			else if (str2.equals("*---"))
				System.out.print("j");
			else if (str2.equals("-*-"))
				System.out.print("k");
			else if (str2.equals("*-**"))
				System.out.print("l");
			else if (str2.equals("--"))
				System.out.print("m");
			else if (str2.equals("-*"))
				System.out.print("n");
			else if (str2.equals("---"))
				System.out.print("o");
			else if (str2.equals("*--*"))
				System.out.print("p");
			else if (str2.equals("**-"))
				System.out.print("q");
			else if (str2.equals("***-"))
				System.out.print("r");
			else if (str2.equals("***"))
				System.out.print("s");
			else if (str2.equals("-"))
				System.out.print("t");
			else if (str2.equals("**-"))
				System.out.print("u");
			else if (str2.equals("***-"))
				System.out.print("v");
			else if (str2.equals("*--"))
				System.out.print("w");
			else if (str2.equals("-**-"))
				System.out.print("x");
			else if (str2.equals("-*--"))
				System.out.print("y");
			else if (str2.equals("--**"))
				System.out.print("z");
			if(index<0){
				break;
			}
				
			
		
		
		}
		
		

	}

}
