package com.lqb.agroup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Ϊ�ḻͬѧ�ǵ�ҵ���Ļ����ĳ��Уѧ���ᴴ����3����ȤС��
�����³�A�飬B�飬C�飩��
ÿ��С���ѧ�������ֱ��ڡ�A.txt��,��B.txt���͡�C.txt���С�
ÿ���ļ��д洢����ѧ����ѧ�š�

���ڹ�����Ҫ������������֪����
    �Ȳμ���A�飬�ֲμ���B�飬����û�вμ�C���ͬѧһ���ж����ˣ�
 */
public class ��ȤС�� {
	public static void main(String[] args) throws Exception {
		InputStream is1 =new FileInputStream("src/com/lqb/agroup/A.txt");
		InputStream is2 =new FileInputStream("src/com/lqb/agroup/B.txt");
		InputStream is3 =new FileInputStream("src/com/lqb/agroup/C.txt");
		int data = 0;
		String str1 = "";
		String str2 = "";
		String str3 = "";
		while ((data=is1.read())!=-1) {
			str1 += (char)data;
		}
		while ((data=is2.read())!=-1) {
			str1 += (char)data;
		}
		while ((data=is3.read())!=-1) {
			str2 += (char)data;
		}
		String [] strArr = str1.split(", ");
		//C��
		String [] strArr2 = str2.split(", ");
		
		Set<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		for (int i = 0; i < strArr.length; i++) {
			if(set.contains(strArr[i])){
				set2.add(strArr[i]);
			}
			set.add(strArr[i]);
		}
		int sum = 0;
		for (int i = 0; i < strArr2.length; i++) {
			set2.add(strArr2[i]);
		}
		for (String string : set) {
			if(!set2.contains(string)){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
