package cn.java.demo;

import java.util.HashSet;

/*
 * С��������һ����������֡�����ƽ�����������ð�0~9��10������ÿ������ֻ����һ�Ρ�
	���ܲ³���������Ƕ�����
 */
public class ��������� {
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
