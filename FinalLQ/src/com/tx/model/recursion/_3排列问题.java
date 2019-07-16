package com.tx.model.recursion;

import java.util.List;
import java.util.Vector;

//// ��֪������������������
public class _3�������� {
	// ��֪������������������
	static List<String> f(String s) {
		List<String> lst = new Vector<String>();

		if (s.length() == 1) {
			lst.add(s);
			return lst;
		}

		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i); // ȡ��ÿ���ַ�
			String s2 = s.substring(0, i) + s.substring(i + 1); // �۳�x��ʣ�µ�
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
	
	// ABCDE ��������
	/*
	void f("ABC"){
		A....
		B....
		C...
		A ... f("BC")
		ABC
		 CB
	    ��ӡ���У���
	    ���뺯��ʽ��񣬷��ء��б�
	}
	*/

	// aa: ��������
	// k: ���ǵĵ�ǰλ�ã������±꣩�� k ��ǰ�Ķ��ǿ�����ϵ�
	static void f(char[] aa, int k){
		if(k==aa.length-1){
			System.out.println(String.valueOf(aa));
			return;
		}
		
		// ��i���͵�k���������ݹ飬�ٻָ�
		for(int i=k; i<aa.length; i++){
			{char t=aa[k]; aa[k]=aa[i]; aa[i]=t;} // ��̽
			f(aa,k+1);
			{char t=aa[k]; aa[k]=aa[i]; aa[i]=t;} // ����
		}
	}
	
}
