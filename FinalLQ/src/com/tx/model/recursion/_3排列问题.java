package com.tx.model.recursion;

import java.util.List;
import java.util.Vector;

//// 已知串，求它的所有排列
public class _3排列问题 {
	// 已知串，求它的所有排列
	static List<String> f(String s) {
		List<String> lst = new Vector<String>();

		if (s.length() == 1) {
			lst.add(s);
			return lst;
		}

		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i); // 取出每个字符
			String s2 = s.substring(0, i) + s.substring(i + 1); // 扣除x后剩下的
			List<String> t = f(s2);
			for (int k = 0; k < t.size(); k++) {
				lst.add("" + x + t.get(k));
			}
		}

		return lst;
	}

	public static void main(String[] args) {
		f("ABC");
//		for (int i = 0; i < lst.size(); i++) {
//			System.out.println(lst.get(i));
//		}
		f("ABCDE".toCharArray(), 0);
	}
	
	// ABCDE 所有排列
	/*
	void f("ABC"){
		A....
		B....
		C...
		A ... f("BC")
		ABC
		 CB
	    打印不行！！
	    必须函数式风格，返回“列表”
	}
	*/

	// aa: 待排数据
	// k: 考虑的当前位置（数组下标）， k 以前的都是考虑完毕的
	static void f(char[] aa, int k){
		if(k==aa.length-1){
			System.out.println(String.valueOf(aa));
			return;
		}
		
		// 第i个和第k个交换，递归，再恢复
		for(int i=k; i<aa.length; i++){
			{char t=aa[k]; aa[k]=aa[i]; aa[i]=t;} // 试探
			f(aa,k+1);
			{char t=aa[k]; aa[k]=aa[i]; aa[i]=t;} // 回溯
		}
	}
	
}
