package cn.java.ss;

import java.util.HashSet;

/*
 * С��������һ����������֡�����ƽ�����������ð�0~9��10������ÿ������ֻ����һ�Ρ����ܲ³���������Ƕ�����
 */
public class ��������� {
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
