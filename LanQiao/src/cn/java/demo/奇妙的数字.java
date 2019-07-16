package cn.java.demo;

import java.util.HashSet;

/*
 * 小明发现了一个奇妙的数字。它的平方和立方正好把0~9的10个数字每个用且只用了一次。
	你能猜出这个数字是多少吗？
 */
public class 奇妙的数字 {
	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			HashSet<Character> hs =new HashSet<Character>();
			char[] c = (i*i +"" +i*i*i).toCharArray();
			for (int k = 0; k < c.length; k++) {
				hs.add(Character.valueOf(c[k]));
			}
			if(hs.size() == 10){
				System.out.println(i);
			}
		}
	}
}
