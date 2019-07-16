package cn.java.ss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * 匪警请拨110,即使手机欠费也可拨通！
	 为了保障社会秩序，保护人民群众生命财产安全，警察叔叔需要与罪犯斗智斗勇，因而需要经常性地进行体力训练和智力训练！
	 某批警察叔叔正在进行智力训练：
	 1 2 3 4 5 6 7 8 9 = 110;
	
	 请看上边的算式，为了使等式成立，需要在数字间填入加号或者减号（可以不填，但不能填入其它符号）。之间没有填入符号的数字组合成一个数，
	 例如：12+34+56+7-8+9 就是一种合格的填法；123+4+5+67-89 是另一个可能的答案。
	
	 请你利用计算机的优势，帮助警察叔叔快速找到所有答案。
	 每个答案占一行。形如：
	 12+34+56+7-8+9
	 123+4+5+67-89
	 ......
 */
public class 趣味算式 {
	private static HashSet<String> hashSet = new HashSet<String>(); 
	
	public static void main(String[] args) {
		//构造一个长度为17的数组，存放1-9，每两个之间留一个位置作为填充运算符
		char[] c= new char [17];
		char d= '1';
		for (int i = 0; i < c.length; i+=2) {
			c[i] = d++;
		}
		getResult(c, 1);
		for (String hs : hashSet) {
			for (int i = 0; i < hs.length(); i++) {
				if(hs.charAt(i)!='#')System.out.print(hs.charAt(i));
			}
			System.out.println();
		}
	}
	//
	public static void getResult(char[] c,int index){
		//递归退出条件
		if(index == 17){
			setResult(c);
			return;
		}
		//此时表示没有运算符,
		c[index] = '#';
		//每次前进两位找到空隙
		getResult(c, index + 2);
		c[index] = '+';
		getResult(c, index + 2);
		c[index] = '-';
		getResult(c, index + 2);
		
	}
	//对char进行解析
	private static void setResult(char [] c) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		String str = "";
		for (int i = 0; i < c.length; i++) {
			if(c[i] == '+'){
				list1.add(str);
				str = "";
			}else if(c[i] == '-'){
				list2.add(str);
				str = "";
			}else if(c[i] != '#'){
				str += c[i];
			}
			if(i ==16){
				if(c[15] == '+') {
					list1.add(str);
					break;
				}
				if(c[15] == '-'){
					list2.add(str);
					break;
				} 
				if(c[13] == '+') {
					list1.add(str);
					break;
				}
				if(c[13] == '-'){
					list2.add(str);
					break;
				} 
			}
		}
		
		 int sum = 0;
		 for (String string : list1) {
			sum += Integer.valueOf(string); 
		 }
		 for (String string : list2) {
				sum -= Integer.valueOf(string); 
		}
		
		if(sum == 110){
			hashSet.add(new String(c));
		}
		
	}
	
}
