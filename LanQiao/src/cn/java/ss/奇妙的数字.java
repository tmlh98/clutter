package cn.java.ss;

import java.util.HashSet;

/*
 * 小明发现了一个奇妙的数字。它的平方和立方正好把0~9的10个数字每个用且只用了一次。你能猜出这个数字是多少吗？
 */
public class 奇妙的数字 {
	public static void main(String[] args) {
		for (int i = 10; i < 1000; i++) {
			int a = i*i;
			int b = i*i*i;
			char [] c = (a +"" +b).toCharArray();
			if(c.length == 10){
				HashSet<Character> hashSet =new HashSet<Character>();
				for (int j = 0; j < c.length; j++) hashSet.add(c[j]);
				if(hashSet.size()==10)System.out.println(i);
			}
		}
	}
}
