package cn.dzqc.lqb;

import java.util.Scanner;

public class z16to8 {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int num=inScanner.nextInt();
		StringBuilder sb1[]=new StringBuilder[num];
		StringBuilder sb2[]=new StringBuilder[num];
		StringBuilder sb3[]=new StringBuilder[num];
		//循环录入
		for (int i = 0; i < num; i++) {
			sb1[i]=new StringBuilder();
			sb1[i].append(inScanner.next());
		}
		for (int i = 0; i < num; i++) {
			sb2[i]=new StringBuilder();
			sb2[i].append(to2(sb1[i].toString()));
			sb3[i]=new StringBuilder();
			sb3[i].append(to8(sb2[i].toString()));
		}
		for (int i = 0; i < sb3.length; i++) {
			System.out.println(sb3[i]);
		}
	}
	//十六进制转二进制
	public static String to2(String  str){
		StringBuilder sbBuilder=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
				case '0':sbBuilder.append("0000");break;
				case '1':sbBuilder.append("0001");break;
				case '2':sbBuilder.append("0010");break;
				case '3':sbBuilder.append("0011");break;
				case '4':sbBuilder.append("0100");break;
				case '5':sbBuilder.append("0101");break;
				case '6':sbBuilder.append("0110");break;
				case '7':sbBuilder.append("0111");break;
				case '8':sbBuilder.append("1000");break;
				case '9':sbBuilder.append("1001");break;
				case 'A':sbBuilder.append("1010");break;
				case 'B':sbBuilder.append("1011");break;
				case 'C':sbBuilder.append("1100");break;
				case 'D':sbBuilder.append("1101");break;
				case 'E':sbBuilder.append("1110");break;
				default:sbBuilder.append("1111");break;
			}
		}
		return sbBuilder.toString();
	}
	//二进制转八进制
	public static String to8(String str){
		StringBuilder sbBuilder=new StringBuilder();
		if(str.length()%3==1){
			str="00"+str;
		}
		if(str.length()%3==2){
			str="0"+str;
		}
		for (int i = 0; i < str.length(); i+=3) {
			if(str.substring(i,i+3).equals("000")){
				sbBuilder.append("0");
			}
			if(str.substring(i,i+3).equals("001")){
				sbBuilder.append("1");
			}
			if(str.substring(i,i+3).equals("010")){
				sbBuilder.append("2");
			}
			if(str.substring(i,i+3).equals("011")){
				sbBuilder.append("3");
			}
			if(str.substring(i,i+3).equals("100")){
				sbBuilder.append("4");
			}
			if(str.substring(i,i+3).equals("101")){
				sbBuilder.append("5");
			}
			if(str.substring(i,i+3).equals("110")){
				sbBuilder.append("6");
			}
			if(str.substring(i,i+3).equals("111")){
				sbBuilder.append("7");
			}
		}
		String strnew=sbBuilder.toString();
		if(strnew.charAt(0)=='0'&&strnew.charAt(1)=='0'){
			strnew=strnew.substring(2,strnew.length());
		}else if(strnew.charAt(0)=='0'){
			strnew=strnew.substring(1,strnew.length());
		}
		return strnew;
	}
	
	
}
