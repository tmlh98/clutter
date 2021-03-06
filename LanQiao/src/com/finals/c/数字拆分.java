package com.finals.c;

import java.util.List;
import java.util.Vector;

public class 数字拆分 {
	public static List fen(int n, int limit){
		Vector v = new Vector();
		if(n<=limit) v.add(n);
		
		for(int i=1; i<n; i++){
			if(n-i > limit) continue;

			List t = fen(i,n-i);
			
			for(int k=0; k<t.size(); k++)
				v.add(n - i + "+" +t.get(k));  //填空位置
		}
		
		return v;
	}

	public static void main(String[] args) {
		List v = fen(6, 6);
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
	}
}
/*
 * 正整数可以表示为若干正整数的累加和。 如，对于正整数n=6，可以分划为： 
 * 6 
 * 5+1 
 * 4+2 4+1+1 
 * 3+3 3+2+1 3+1+1+1 
 * 2+2+2 2+2+1+1 2+1+1+1+1
 * 1+1+1+1+1+1 现在的问题是，对于给定的正整数n,计算出所有划分情况。
 * 下面的代码实现了这个功能。仔细分析，填写划线部分缺失的代码。 注意：通过浏览器提交答案。只填写缺少的内容，不要填写任何多余的内容（例如：说明性文字
 */