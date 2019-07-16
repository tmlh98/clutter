package cn.dzqc.lqb;

import java.util.Scanner;

public class 字串统计 {
	/**
	 * 统计字串substr在str的出现次数
	 */
	static int Strta(String str,String substr){
		int count =0;
		for (int i = 0; i <=str.length()-substr.length(); i++) {
			if(substr.equals(str.substring(i,i+substr.length()))){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		String s=in.next();
		String str1=s.substring(0,l);//初始比较的字串
		int max_count=1;//字符串最多出现次数
		for (int i = l; i <=s.length(); i++) {
			//这个字符串可能出现的长度
			for (int j = 0; j + i<= s.length(); j++) {
				//具体操作
				int var=Strta(s, s.substring(j,j+i));
				if(var>max_count){
					//获取出现次数最多的字符串
					max_count=var;
					str1=s.substring(j,j+i);
				}else if(var==max_count){
					if(str1.length()<i){
						str1=s.substring(j,j+i);
					}
				}
				
				
				
			}
			
			
		}
		
		System.out.println(str1);
		
	}
	
	

}
